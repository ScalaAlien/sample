package forms

import java.sql.Timestamp

case class Show(date_start: Option[Timestamp], date_end: Option[Timestamp], serial: Option[String], ble_address: Option[String])