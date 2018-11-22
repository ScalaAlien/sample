package services

import models.BeaconLog
import scalikejdbc._

trait BeaconLogService {

  def create(beaconLog: BeaconLog)(implicit session: DBSession = AutoSession): Long

  def update(beaconLog: BeaconLog)(implicit session: DBSession = AutoSession): Int

}
