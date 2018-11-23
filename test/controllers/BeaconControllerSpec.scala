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
        val result = route(app, FakeRequest(POST, routes.BeaconController.createFinishedProductInspection.toString).withFormUrlEncodedBody("serial" -> "a", "bleAddress" -> "b", "ng" -> "0")).get
        status(result) mustBe OK
      }
    }
    describe("route of BeaconController#updateFinishedProductInspection") {
      it("should be valid") {
        val result = route(app, FakeRequest(POST, routes.BeaconController.updateFinishedProductInspection.toString).withFormUrlEncodedBody("serial" -> "a", "bleAddress" -> "b", "ng" -> "0")).get
        status(result) mustBe OK
      }
    }
  }
  describe("route of BeaconController#updateVisualInspection") {
    it("should be valid") {
      val result = route(app, FakeRequest(POST, routes.BeaconController.updateVisualInspection.toString).withFormUrlEncodedBody("serial" -> "a")).get
      status(result) mustBe OK
    }
  }
  describe("route of BeaconController#updatePackaging") {
    it("should be valid") {
      val result = route(app, FakeRequest(POST, routes.BeaconController.updatePackaging.toString).withFormUrlEncodedBody("serial" -> "a")).get
      status(result) mustBe OK
    }
  }
  describe("route of BeaconController#confirmFinishedProductInspection") {
    it("should be valid") {
      val result = route(app, FakeRequest(GET, routes.BeaconController.confirmFinishedProductInspection("a", "b").toString)).get
      status(result) mustBe OK
    }
  }
  describe("route of BeaconController#confirmFinishedProductInspection \"BleAddress is not exists\"") {
    it("should be valid") {
      val result = route(app, FakeRequest(GET, routes.BeaconController.confirmFinishedProductInspection("exists", "exists").toString)).get
      status(result) mustBe OK
    }
  }
  describe("route of BeaconController#confirmFinishedProductInspection \"Serial is not exists\"") {
    it("should be valid") {
      val result = route(app, FakeRequest(GET, routes.BeaconController.confirmFinishedProductInspection("not_exists", "exists").toString)).get
      status(result) mustBe OK
    }
  }
    /*describe("route of CreateMessageController#index") {
      it("should be valid") {
        val result = route(app, FakeRequest(GET, routes.CreateMessageController.index().toString)).get
        status(result) mustBe OK
      }
     */
}