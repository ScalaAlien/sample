package controllers

import javax.inject._
import play.api.libs.json._
import play.api.mvc._
import services._

import scala.concurrent.ExecutionContext

@Singleton
class BeaconController @Inject()(val beaconService: BeaconService,
                                 components: ControllerComponents)(implicit ec: ExecutionContext)
  extends AbstractController(components) {

  def index(serial: String, bleAddress: String) = Action { implicit request: Request[AnyContent] =>
    val json = Json.toJson(beaconService.confirmFinishedProductInspection(serial, bleAddress))
    Ok(json)
  }
}