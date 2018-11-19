package models

import java.time.ZonedDateTime

import scalikejdbc._
import skinny.orm._

case class BeaconLog(id: Option[Long] = None,
                      beaconId: Long,
                      serial: String,
                      bleAddress: String,
                      ng: Long,
                      finishedProductInspectionAt: ZonedDateTime,
                      packagingAt: Option[ZonedDateTime],
                      visualInspectionDefectiveAt: Option[ZonedDateTime],
                      createdAt: ZonedDateTime,
                      updatedAt: ZonedDateTime
                    )

object BeaconLog extends SkinnyCRUDMapper[BeaconLog] {

  override val columns = Seq(
    "id",
    "beaconsId",
    "serial",
    "ble_address",
    "ng",
    "finished_product_inspection_at",
    "packaging_at",
    "visual_inspection_defective_at",
    "created_at",
    "updated_at"
  )

  override def tableName = "beacons_log"

  override def defaultAlias: Alias[BeaconLog] = createAlias("bl")

  override def extract(rs: WrappedResultSet, n: ResultName[BeaconLog]): BeaconLog =
    autoConstruct(rs, n)

  def create(beaconLog: BeaconLog)(implicit session: DBSession = AutoSession): Long =
    createWithAttributes(toNamedValues(beaconLog): _*)

  def update(beaconLog: BeaconLog)(implicit session: DBSession = AutoSession): Int =
    updateById(beaconLog.id.get).withAttributes(toNamedValues(beaconLog): _*)

  private def toNamedValues(record: BeaconLog): Seq[(Symbol, Any)] = Seq(
    'beaconId -> record.beaconId,
    'serial -> record.serial,
    'bleAddress -> record.bleAddress,
    'ng -> record.ng,
    'finishedProductInspectionAt -> record.finishedProductInspectionAt,
    'packagingAt -> record.packagingAt,
    'visualInspectionDefectiveAt -> record.visualInspectionDefectiveAt,
    'createdAt -> record.createdAt,
    'updatedAt -> record.updatedAt
  )
}
