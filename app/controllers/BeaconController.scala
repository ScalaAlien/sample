package controllers

import forms.{Date, Item}
import java.time.ZonedDateTime

import javax.inject._
import models._
import play.api.data.Forms._
import play.api.data._
import play.api.i18n.{I18nSupport, Messages}
import play.api.libs.json._
import play.api.mvc._

import scala.concurrent.ExecutionContext
import services._

@Singleton
class BeaconController @Inject()(
                                  val beaconService: BeaconService,
                                  val beaconLogService: BeaconLogService,
                                  components: ControllerComponents)(implicit ec: ExecutionContext)
  extends AbstractController(components)
    with I18nSupport {
  private val dateForm = Form(
    mapping(
      "date_start" -> localDate,
      "date_end" -> localDate
    )(Date.apply)(Date.unapply)
  )
  private val itemForm = Form(
    mapping(
      "serial" -> text,
      "ble_address" -> text
    )(Item.apply)(Item.unapply)
  )

  def index = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index(dateForm,itemForm, None))
  }

  def selectByDate: Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      dateForm
        .bindFromRequest()
        .fold(
          { formWithErrors =>
            println(formWithErrors)
            BadRequest(views.html.index(formWithErrors, itemForm, None))
          }, { dateForm =>
            beaconService
              .selectByDate(dateForm.date_start,
                dateForm.date_end)
              .map { beacons =>
                println(beacons)
                Ok(views.html.index(this.dateForm, itemForm, Some(beacons)))
              }
              .getOrElse(InternalServerError(Messages("InternalError")))
          }
        )
  }

  def selectByItem: Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      itemForm
        .bindFromRequest()
        .fold(
          { formWithErrors =>
            println(formWithErrors)
            BadRequest(views.html.index(dateForm, formWithErrors, None))
          }, { itemForm =>
            beaconService
              .selectByItem(itemForm.serial,
                itemForm.ble_address)
              .map { beacons =>
                println(beacons)
                Ok(views.html.index(dateForm, this.itemForm, Some(beacons)))
              }
              .getOrElse(InternalServerError(Messages("InternalError")))
          }
        )
  }

  def confirmFinishedProductInspection(serial: String, bleAddress: String) =
    Action { implicit request: Request[AnyContent] =>
      val json = Json.toJson(
        beaconService.confirmFinishedProductInspection(serial, bleAddress))
      Ok(json)
    }

  def confirmPackaging(serial: String, bleAddress: String) = Action {
    implicit request: Request[AnyContent] =>
      val json = Json.toJson(beaconService.confirmPackaging(serial, bleAddress))
      Ok(json)
  }

  def createFinishedProductInspection: Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      val body: AnyContent = request.body
      val formOpt: Option[Map[String, Seq[String]]] = body.asFormUrlEncoded
      val serial: String = formOpt.fold("")(_ ("serial").head)
      val bleAddress: String = formOpt.fold("")(_ ("bleAddress").head)
      val ng: Int = formOpt.fold(-1)(_ ("ng").head.toInt)
      val now = ZonedDateTime.now
      val beaconId = beaconService.create(
        Beacon(None, serial, bleAddress, ng, now, None, None, now, now))
      Ok(s"Beacon ID = $beaconId")
  }

  def updateFinishedProductInspection: Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      val body: AnyContent = request.body
      val formOpt: Option[Map[String, Seq[String]]] = body.asFormUrlEncoded
      val serial: String = formOpt.fold("")(_ ("serial").head)
      val bleAddress: String = formOpt.fold("")(_ ("bleAddress").head)
      val ng: Int = formOpt.fold(-1)(_ ("ng").head.toInt)
      val now = ZonedDateTime.now
      val beacon = beaconService.getBySerial(serial).get.get
      val beaconLogId = beaconLogService.create(
        BeaconLog(
          None,
          beacon.id.get,
          beacon.serial,
          beacon.bleAddress,
          beacon.ng,
          beacon.finishedProductInspectionAt,
          beacon.packagingAt,
          beacon.visualInspectionDefectiveAt,
          beacon.createAt,
          beacon.updateAt
        ))
      val beaconCount = beaconService.update(
        Beacon(beacon.id, serial, bleAddress, ng, now, None, None, now, now))
      Ok(s"Beacon Updated Count = $beaconCount, BeaconLog ID = $beaconLogId")
  }

  def updateVisualInspection: Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      val body: AnyContent = request.body
      val formOpt: Option[Map[String, Seq[String]]] = body.asFormUrlEncoded
      val serial: String = formOpt.fold("")(_ ("serial").head)
      val now = ZonedDateTime.now
      val beacon = beaconService.getBySerial(serial).get.get
      val beaconCount = beaconService.update(
        Beacon(None,
          serial,
          beacon.bleAddress,
          beacon.ng,
          beacon.finishedProductInspectionAt,
          None,
          Some(now),
          now,
          now))

      Ok(s"Beacon Updated Count = $beaconCount")
  }

  def updatePackaging: Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      val body: AnyContent = request.body
      val formOpt: Option[Map[String, Seq[String]]] = body.asFormUrlEncoded
      val serial: String = formOpt.fold("")(_ ("serial").head)
      val now = ZonedDateTime.now
      val beacon = beaconService.getBySerial(serial).get.get
      val beaconCount = beaconService.update(
        Beacon(None,
          serial,
          beacon.bleAddress,
          beacon.ng,
          beacon.finishedProductInspectionAt,
          Some(now),
          None,
          beacon.createAt,
          now))
      Ok(s"Beacon Updated Count = $beaconCount")
  }
}
