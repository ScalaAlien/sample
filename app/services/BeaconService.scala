package services

import java.time.LocalDate

import models.Beacon
import play.api.libs.json.JsObject
import scalikejdbc._

import scala.util.Try

trait BeaconService {

  def create(beacon: Beacon)(implicit session: DBSession = AutoSession): Long

  def update(beacon: Beacon)(implicit session: DBSession = AutoSession): Int

  def selectByDate(dateStart: LocalDate, dateEnd: LocalDate)(implicit session: DBSession = AutoSession): Try[Seq[(Beacon, Int)]]

  def selectByItem(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): Try[Seq[(Beacon, Int)]]

  def getBySerial(serial: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]]

  def getByBleAddress(bleAddress: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]]

  def getBySerialAndBleAddress(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]]

  def confirmFinishedProductInspection(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): JsObject

  def confirmPackaging(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): JsObject

}
