package models

import java.time.ZonedDateTime

import scalikejdbc._
import skinny.orm._

case class Beacon(id: Option[Long] = None,
                  serial: String,
                  bleAddress: String,
                  ng: Long,
                  finishedProductInspectionAt: ZonedDateTime,
                  packagingAt: Option[ZonedDateTime],
                  visualInspectionDefectiveAt: Option[ZonedDateTime],
                  createAt: ZonedDateTime,
                  updateAt: ZonedDateTime)

object Beacon extends SkinnyCRUDMapper[Beacon] {

  override val columns = Seq(
    "id",
    "serial",
    "ble_address",
    "ng",
    "finished_product_inspection_at",
    "packaging_at",
    "visual_inspection_defective_at",
    "create_at",
    "update_at"
  )

  override def tableName = "beacons"

  override def defaultAlias: Alias[Beacon] = createAlias("b")

  override def extract(rs: WrappedResultSet, n: ResultName[Beacon]): Beacon =
    autoConstruct(rs, n)

  def create(beacon: Beacon)(implicit session: DBSession = AutoSession): Long =
    createWithAttributes(toNamedValues(beacon): _*)

  def update(beacon: Beacon)(implicit session: DBSession = AutoSession): Int =
    updateById(beacon.id.get).withAttributes(toNamedValues(beacon): _*)

  private def toNamedValues(record: Beacon): Seq[(Symbol, Any)] = Seq(
    'serial -> record.serial,
    'bleAddress -> record.bleAddress,
    'ng -> record.ng,
    'finishedProductInspectionAt -> record.finishedProductInspectionAt,
    'packagingAt -> record.packagingAt,
    'visualInspectionDefectiveAt -> record.visualInspectionDefectiveAt,
    'createAt -> record.createAt,
    'updateAt -> record.updateAt
  )
}
