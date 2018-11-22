package services

import models.BeaconLog
import scalikejdbc._

class MockBeaconLogService extends BeaconLogService {
  override def create(beaconLog: BeaconLog)(implicit session: DBSession): Long = 1L

  override def update(beaconLog: BeaconLog)(implicit session: DBSession): Int = 1

}
