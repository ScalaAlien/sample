package services

import javax.inject._
import models.BeaconLog
import scalikejdbc._

@Singleton
class BeaconLogServiceImpl extends BeaconLogService {

  override def create(beaconLog: BeaconLog)(implicit session: DBSession = AutoSession): Long = BeaconLog.create(beaconLog)

  override def update(beaconLog: BeaconLog)(implicit session: DBSession = AutoSession): Int = BeaconLog.update(beaconLog)

}
