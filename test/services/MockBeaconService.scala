package services

import java.time.ZonedDateTime._

import models.Beacon
import play.api.libs.json.{JsObject, Json}
import scalikejdbc._

import scala.util.Try

class MockBeaconService extends BeaconService {
  override def getBySerial(serial: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]] = Try(Some(Beacon(Some(1L), "a", "b", 0L, now, Some(now), None, now, now)))

  override def getByBleAddress(bleAddress: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]] = Try(Some(Beacon(Some(1L), "a", "b", 0L, now, Some(now), None, now, now)))

  override def getBySerialAndBleAddress(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]] = Try(Some(Beacon(Some(1L), "a", "b", 0L, now, Some(now), None, now, now)))

  override def create(beacon: Beacon)(implicit session: DBSession): Long = 1L

  override def update(beacon: Beacon)(implicit session: DBSession): Int = 1

  override def confirmFinishedProductInspection(serial: String, bleAddress: String): JsObject = {
    val beaconBySerialAndBleAddress = getBySerialAndBleAddress(serial, bleAddress).getOrElse(None)
    val beaconBySerial = getBySerial(serial).getOrElse(None)
    val beaconByBleAddress = getByBleAddress(bleAddress).getOrElse(None)
    Json.obj("confirmFinishedProductInspection" -> {
      if (beaconBySerialAndBleAddress.isDefined) {
        Json.obj("existsSerial" -> true, "existsBleAddress" -> true)
      } else if (beaconBySerial.isDefined) {
        Json.obj("existsSerial" -> true, "existsBleAddress" -> false)
      } else if (beaconByBleAddress.isDefined) {
        val jsObj = Json.obj("existsSerial" -> false, "existsBleAddress" -> true)
        beaconByBleAddress.get.visualInspectionDefectiveAt match {
          case Some(_) =>
            jsObj ++ Json.obj("existsVisualInspectionDefectiveAt" -> true)
          case None =>
            jsObj ++ Json.obj("existsVisualInspectionDefectiveAt" -> false)
        }
      } else {
        Json.obj("existsSerial" -> false, "existsBleAddress" -> false)
      }
    })
  }

  override def confirmPackaging(serial: String, bleAddress: String): JsObject = {
    val beaconBySerialAndBleAddress = getBySerialAndBleAddress(serial, bleAddress).getOrElse(None)
  val beaconBySerial = getBySerial(serial).getOrElse(None)
  val beaconByBleAddress = getByBleAddress(bleAddress).getOrElse(None)
  Json.obj("confirmFinishedProductInspection" -> {
    if (beaconBySerialAndBleAddress.isDefined) {
      val jsObj = Json.obj("existsSerial" -> true, "existsBleAddress" -> true)
      beaconBySerialAndBleAddress.get.visualInspectionDefectiveAt match {
        case Some(_) =>
          jsObj ++ Json.obj("existsVisualInspectionDefectiveAt" -> true)
        case None =>
          jsObj ++ Json.obj("existsVisualInspectionDefectiveAt" -> false)
          beaconBySerialAndBleAddress.get.packagingAt match {
            case Some(_) => jsObj ++ Json.obj("existspackagingAt" -> true)
            case None => jsObj ++ Json.obj("existspackagingAt" -> false)
          }

      }
    } else if (beaconBySerial.isDefined) {
      val jsObj =
        Json.obj("existsSerial" -> true, "existsBleAddress" -> false)
      beaconBySerial.get.visualInspectionDefectiveAt match {
        case Some(_) =>
          jsObj ++ Json.obj("existsVisualInspectionDefectiveAt" -> true)
        case None =>
          jsObj ++ Json.obj("existsVisualInspectionDefectiveAt" -> false)
          beaconBySerial.get.packagingAt match {
            case Some(_) => jsObj ++ Json.obj("existspackagingAt" -> true)
            case None => jsObj ++ Json.obj("existspackagingAt" -> false)
          }
      }
    } else if (beaconByBleAddress.isDefined) {
      val jsObj =
        Json.obj("existsSerial" -> false, "existsBleAddress" -> true)
      beaconByBleAddress.get.visualInspectionDefectiveAt match {
        case Some(_) =>
          jsObj ++ Json.obj("existsVisualInspectionDefectiveAt" -> true)
        case None =>
          jsObj ++ Json.obj("existsVisualInspectionDefectiveAt" -> false)
          beaconByBleAddress.get.packagingAt match {
            case Some(_) => jsObj ++ Json.obj("existspackagingAt" -> true)
            case None => jsObj ++ Json.obj("existspackagingAt" -> false)
          }
      }
    } else {
      Json.obj("existsSerial" -> false, "existsBleAddress" -> false)
    }
  })
}
}
