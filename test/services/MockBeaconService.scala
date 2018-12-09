package services

import java.time.LocalDate
import java.time.ZonedDateTime._
import models.Beacon
import play.api.libs.json.JsObject
import scala.util.Try
import scalikejdbc._

class MockBeaconService extends BeaconService {
  override def getBySerial(serial: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]] = Try(Some(Beacon(Some(1L), "exists", "not_exists", 0L, now, Some(now), None, now, now)))

  override def getByBleAddress(bleAddress: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]] = Try(Some(Beacon(Some(1L), "not_exists", "exists", 0L, now, Some(now), None, now, now)))

  override def getBySerialAndBleAddress(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]] = Try(Some(Beacon(Some(1L), "exists", "exists", 0L, now, Some(now), None, now, now)))

  override def create(beacon: Beacon)(implicit session: DBSession = AutoSession): Long = 1L

  override def update(beacon: Beacon)(implicit session: DBSession = AutoSession): Int = 1

  override def confirmFinishedProductInspection(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): JsObject = {
    JsObject.empty
  }

  override def confirmPackaging(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): JsObject = {
    JsObject.empty
  }

  override def show(dateStart: LocalDate, dateEnd: LocalDate, serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): Try[Seq[(Beacon, Int)]] = Try {
    Seq {
      (Beacon(Some(1L), "exists", "exists", 0L, now, Some(now), None, now, now), 1)
    }
  }

}
