package services

import models.Beacon
import play.api.libs.json.JsObject
import scalikejdbc._

import scala.util.Try

trait BeaconService {
  def getBySerial(serial: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]]

  def getByBleAddress(bleAddress: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]]

  def getBySerialAndBleAddress(serial: String, bleAddress: String)(implicit session: DBSession = AutoSession): Try[Option[Beacon]]

  def confirmFinishedProductInspection(serial: String, bleAddress: String): JsObject
}
