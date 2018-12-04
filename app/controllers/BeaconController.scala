package controllers

import java.time.ZonedDateTime

import forms.Show
import javax.inject._
import models._
import play.api.data.Forms._
import play.api.data._
import play.api.i18n.{I18nSupport, Messages}
import play.api.libs.json._
import play.api.mvc._
import services._

import scala.concurrent.ExecutionContext

@Singleton
class BeaconController @Inject()(
    val beaconService: BeaconService,
    val beaconLogService: BeaconLogService,
    components: ControllerComponents)(implicit ec: ExecutionContext)
    extends AbstractController(components)
    with I18nSupport {

  def createFinishedProductInspection: Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      val body: AnyContent = request.body
      val formOpt: Option[Map[String, Seq[String]]] = body.asFormUrlEncoded
      val serial: String = formOpt.fold("")(_("serial").head)
      val bleAddress: String = formOpt.fold("")(_("bleAddress").head)
      val ng: Int = formOpt.fold(-1)(_("ng").head.toInt)
      val now = ZonedDateTime.now

      val beaconId = beaconService.create(
        Beacon(None, serial, bleAddress, ng, now, None, None, now, now))

      Ok(s"Beacon ID = $beaconId")
  }

  def confirmFinishedProductInspection(serial: String, bleAddress: String) =
    Action { implicit request: Request[AnyContent] =>
      val json = Json.toJson(
        beaconService.confirmFinishedProductInspection(serial, bleAddress))
      Ok(json)
    }

  def updateFinishedProductInspection: Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      val body: AnyContent = request.body
      val formOpt: Option[Map[String, Seq[String]]] = body.asFormUrlEncoded

      val serial: String = formOpt.fold("")(_("serial").head)
      val bleAddress: String = formOpt.fold("")(_("bleAddress").head)
      val ng: Int = formOpt.fold(-1)(_("ng").head.toInt)

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

      val serial: String = formOpt.fold("")(_("serial").head)

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
      val serial: String = formOpt.fold("")(_("serial").head)
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

  def confirmPackaging(serial: String, bleAddress: String) = Action {
    implicit request: Request[AnyContent] =>
      val json = Json.toJson(beaconService.confirmPackaging(serial, bleAddress))
      Ok(json)
  }

  private val form = Form(
    mapping(
      "date_start" -> localDate,
      "date_end" -> localDate,
      "serial" -> text,
      "ble_address" -> text
    )(Show.apply)(Show.unapply)
  )

  def index = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index(form))
  }

  def show: Action[AnyContent] = Action {
    implicit request: Request[AnyContent] =>
      form
        .bindFromRequest()
        .fold(
          { formWithErrors =>
            println(formWithErrors)
            BadRequest(views.html.index(formWithErrors))
          }, { show =>
            beaconService
              .show(show.date_start,
                    show.date_end,
                    show.serial,
                    show.ble_address)
              .map { beacons =>
                println(beacons)
                Ok(views.html.show(beacons))
              }
              .getOrElse(InternalServerError(Messages("InternalError")))
          }
        )
  }

}
