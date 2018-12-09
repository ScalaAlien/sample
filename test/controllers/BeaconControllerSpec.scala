package controllers

import org.scalatest._
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.Application
import play.api.inject.bind
import play.api.inject.guice.GuiceApplicationBuilder
import play.api.test.Helpers._
import play.api.test._
import scalikejdbc.PlayModule
import services._

class BeaconControllerSpec extends FunSpec
  with MustMatchers
  with GuiceOneAppPerSuite {

  override def fakeApplication(): Application =
    new GuiceApplicationBuilder()
      .disable[PlayModule]
      .overrides(bind[BeaconService].to[MockBeaconService])
      .overrides(bind[BeaconLogService].to[MockBeaconLogService])
      .build()

  describe("BeaconController") {
    describe("route of BeaconController#createFinishedProductInspection") {
      it("should be valid") {
        val result = route(app, FakeRequest(POST, routes.BeaconController.createFinishedProductInspection.toString).withFormUrlEncodedBody("serial" -> "exists", "bleAddress" -> "exists", "ng" -> "0")).get
        status(result) mustBe OK
      }
    }
    describe("route of BeaconController#updateFinishedProductInspection") {
      it("should be valid") {
        val result = route(app, FakeRequest(POST, routes.BeaconController.updateFinishedProductInspection.toString).withFormUrlEncodedBody("serial" -> "exists", "bleAddress" -> "exists", "ng" -> "0")).get
        status(result) mustBe OK
      }
    }
    describe("route of BeaconController#updateVisualInspection") {
      it("should be valid") {
        val result = route(app, FakeRequest(POST, routes.BeaconController.updateVisualInspection.toString).withFormUrlEncodedBody("serial" -> "exists")).get
        status(result) mustBe OK
      }
    }
    describe("route of BeaconController#updatePackaging") {
      it("should be valid") {
        val result = route(app, FakeRequest(POST, routes.BeaconController.updatePackaging.toString).withFormUrlEncodedBody("serial" -> "exists")).get
        status(result) mustBe OK
      }
    }
    describe("route of BeaconController#confirmFinishedProductInspection") {
      it("should be valid") {
        val result = route(app, FakeRequest(GET, routes.BeaconController.confirmFinishedProductInspection("exists", "exists").toString)).get
        status(result) mustBe OK
      }
    }
    describe("route of BeaconController#confirmPackaging") {
      it("should be valid") {
        val result = route(app, FakeRequest(GET, routes.BeaconController.confirmPackaging("exists", "exists").toString)).get
        status(result) mustBe OK
      }
    }
    describe("route of BeaconController#index") {
      it("should be valid") {
        val result = route(app, FakeRequest(GET, routes.BeaconController.index.toString)).get
        status(result) mustBe OK
      }
    }
//    describe("route of BeaconController#show") {
//      it("should be valid") {
//        val result = route(app, FakeRequest(POST, routes.BeaconController.show().toString).withFormUrlEncodedBody(form, None)).get
//        status(result) mustBe OK
//      }
//    }
  }
}