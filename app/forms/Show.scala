package forms

import java.sql.Timestamp

case class Show(date_start: Timestamp, date_end: Timestamp, serial: String, ble_address: String)