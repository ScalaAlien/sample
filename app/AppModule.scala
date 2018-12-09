import com.google.inject.AbstractModule
import services._

class AppModule extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[BeaconService]).to(classOf[BeaconServiceImpl])
    bind(classOf[BeaconLogService]).to(classOf[BeaconLogServiceImpl])
  }
}