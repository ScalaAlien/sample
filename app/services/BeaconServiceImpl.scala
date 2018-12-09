package services

import java.time.LocalDate
import javax.inject._
import models.Beacon
import play.api.libs.json._
import scala.util.Try
import scalikejdbc._

@Singleton
class BeaconServiceImpl extends BeaconService {
  override def create(beacon: Beacon)(implicit session: DBSession = AutoSession): Long = Beacon.create(beacon)

  override def update(beacon: Beacon)(implicit session: DBSession = AutoSession): Int = Beacon.update(beacon)

  override def selectByDate(dateStart: LocalDate, dateEnd: LocalDate)(implicit session: DBSession = AutoSession): Try[Seq[(Beacon, Int)]] = Try {
    val b = Beacon.syntax("b")
    withSQL {
      select(b.result.*).from(Beacon as b).where.between(b.updateAt, dateStart, dateEnd)
    }.map(rs => (Beacon(b)(rs), rs.int(1))).list().apply().toVector
  }

  override def selectByItem(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): Try[Seq[(Beacon, Int)]] = Try {
    val b = Beacon.syntax("b")
    withSQL {
      select(b.result.*).from(Beacon as b)
    }.map(rs => (Beacon(b)(rs), rs.int(1))).list().apply().toVector
  }

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

  val jsVisualInspectionDefectiveAt = (beaconOpt: Option[Beacon], jsObj: JsObject) => {
    beaconOpt.get.visualInspectionDefectiveAt match {
      case Some(_) =>
        jsObj ++ Json.obj("existsVisualInspectionDefectiveAt" -> true)
      case None =>
        jsObj ++ Json.obj("existsVisualInspectionDefectiveAt" -> false)
    }
  }
  val jsPackagingAt = (beaconOpt: Option[Beacon], jsObj: JsObject) => {
    beaconOpt.get.packagingAt match {
      case Some(_) =>
        jsObj ++ Json.obj("existsPackagingAt" -> true)
      case None =>
        jsObj ++ Json.obj("existsPackagingAt" -> false)
    }
  }

  override def confirmFinishedProductInspection(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): JsObject = {
    val beaconBySerialAndBleAddress = getBySerialAndBleAddress(serial, bleAddress).getOrElse(None)
    val beaconBySerial = getBySerial(serial).getOrElse(None)
    val beaconByBleAddress = getByBleAddress(bleAddress).getOrElse(None)
    var jsObj: JsObject = JsObject.empty
    Json.obj("confirmFinishedProductInspection" -> {
      if (beaconBySerialAndBleAddress.isDefined) {
        jsObj = Json.obj("existsSerial" -> true, "existsBleAddress" -> true)
        jsObj
      } else if (beaconBySerial.isDefined) {
        jsObj = Json.obj("existsSerial" -> true, "existsBleAddress" -> false)
        jsObj
      } else if (beaconByBleAddress.isDefined) {
        jsObj = Json.obj("existsSerial" -> false, "existsBleAddress" -> true)
        jsObj = jsVisualInspectionDefectiveAt(beaconByBleAddress, jsObj)
        jsObj
      } else {
        jsObj = Json.obj("existsSerial" -> false, "existsBleAddress" -> false)
        jsObj
      }
    })
  }

  override def confirmPackaging(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession) = {
    val beaconBySerialAndBleAddress = getBySerialAndBleAddress(serial, bleAddress).getOrElse(None)
    val beaconBySerial = getBySerial(serial).getOrElse(None)
    val beaconByBleAddress = getByBleAddress(bleAddress).getOrElse(None)
    var jsObj: JsObject = JsObject.empty
    Json.obj("confirmPackaging" -> {
      if (beaconBySerialAndBleAddress.isDefined) {
        jsObj = Json.obj("existsSerial" -> true, "existsBleAddress" -> true)
        jsObj = jsVisualInspectionDefectiveAt(beaconBySerialAndBleAddress, jsObj)
        jsObj = jsPackagingAt(beaconBySerialAndBleAddress, jsObj)
        jsObj
      } else if (beaconBySerial.isDefined) {
        jsObj = Json.obj("existsSerial" -> true, "existsBleAddress" -> false)
        jsObj = jsVisualInspectionDefectiveAt(beaconBySerial, jsObj)
        jsObj = jsPackagingAt(beaconBySerial, jsObj)
        jsObj
      } else if (beaconByBleAddress.isDefined) {
        jsObj = Json.obj("existsSerial" -> false, "existsBleAddress" -> true)
        jsObj = jsVisualInspectionDefectiveAt(beaconByBleAddress, jsObj)
        jsObj = jsPackagingAt(beaconByBleAddress, jsObj)
        jsObj
      } else {
        jsObj = Json.obj("existsSerial" -> false, "existsBleAddress" -> false)
        jsObj
      }
    })
  }
}