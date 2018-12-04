package services

import java.time.LocalDate

import javax.inject._
import models.Beacon
import play.api.libs.json._
import scalikejdbc._

import scala.util.Try

@Singleton
class BeaconServiceImpl extends BeaconService {

  override def getBySerial(serial: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]] =
    Try {
      Beacon
        .where('serial -> serial)
        .apply.
        headOption
    }

  override def getByBleAddress(bleAddress: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]] =
    Try {
      Beacon
        .where('bleAddress -> bleAddress)
        .apply
        .headOption
    }

  override def getBySerialAndBleAddress(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]] =
    Try {
      Beacon
        .where('serial -> serial, 'bleAddress -> bleAddress)
        .apply
        .headOption
    }

  override def confirmFinishedProductInspection(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): JsObject = {
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

  override def confirmPackaging(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): JsObject = {
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

  override def create(beacon: Beacon)(implicit session: DBSession = AutoSession): Long = Beacon.create(beacon)

  override def update(beacon: Beacon)(implicit session: DBSession = AutoSession): Int = Beacon.update(beacon)

  override def show(dateStart: LocalDate, dateEnd: LocalDate, serial: String, bleAddress: String)(implicit session: DBSession = AutoSession) = Try {
    val b = Beacon.syntax("b")
    withSQL {
      select(b.result.*).from(Beacon as b).where.between(b.updateAt, dateStart, dateEnd)
    }.map(rs => (Beacon(b)(rs), rs.int(1))).list().apply().toVector
  }
}