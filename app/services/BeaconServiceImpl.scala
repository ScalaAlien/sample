package services

import javax.inject._
import models.Beacon
import play.api.libs.json._
import scalikejdbc._

import scala.util.Try

@Singleton
class BeaconServiceImpl extends BeaconService {
  override def getBySerial(serial: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]] =
    Try {
      Beacon.where('serial -> serial).apply.headOption
    }

  override def getByBleAddress(bleAddress: String)(
    implicit session: DBSession = AutoSession): Try[Option[Beacon]] =
    Try {
      Beacon.where('bleAddress -> bleAddress).apply.headOption
    }

  override def getBySerialAndBleAddress(serial: String, bleAddress: String)(
    implicit session: DBSession = AutoSession): Try[Option[Beacon]] =
    Try {
      Beacon
        .where('serial -> serial, 'bleAddress -> bleAddress).apply.headOption
    }

  override def confirmFinishedProductInspection(serial: String, bleAddress: String): JsObject = {
    val beaconBySerialAndBleAddress = getBySerialAndBleAddress(serial, bleAddress).getOrElse(None)
    val beaconBySerial = getBySerial(serial).getOrElse(None)
    val beaconByBleAddress = getByBleAddress(bleAddress).getOrElse(None)
    if (beaconBySerialAndBleAddress.isDefined) {
      Json.obj("existsSerial" -> true, "existsBleAddress" -> true)
    } else if (beaconBySerial.isDefined) {
      Json.obj("existsSerial" -> true, "existsBleAddress" -> false)
    } else if (beaconByBleAddress.isDefined) {
      val jsObj = Json.obj("existsSerial" -> false, "existsBleAddress" -> true)
      beaconByBleAddress.get.visualInspectionDefectiveAt match {
        case Some(_) =>
          jsObj ++ Json.obj("visualInspectionDefectiveAt" -> true)
        case None =>
          jsObj ++ Json.obj( "visualInspectionDefectiveAt" -> false)
      }
    } else {
      Json.obj("existsSerial" -> false, "existsBleAddress" -> false)
    }
  }
}
