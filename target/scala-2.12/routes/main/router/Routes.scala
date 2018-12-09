// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Kosuke/Desktop/sample/conf/routes
// @DATE:Sun Dec 09 20:55:25 JST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  BeaconController_1: controllers.BeaconController,
  // @LINE:17
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    BeaconController_1: controllers.BeaconController,
    // @LINE:17
    Assets_0: controllers.Assets
  ) = this(errorHandler, BeaconController_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, BeaconController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.BeaconController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """show""", """controllers.BeaconController.show"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirmFinishedProductInspection""", """controllers.BeaconController.confirmFinishedProductInspection(serial:String, bleAddress:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirmPackaging""", """controllers.BeaconController.confirmPackaging(serial:String, bleAddress:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createFinishedProductInspection""", """controllers.BeaconController.createFinishedProductInspection"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateFinishedProductInspection""", """controllers.BeaconController.updateFinishedProductInspection"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateVisualInspection""", """controllers.BeaconController.updateVisualInspection"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatePackaging""", """controllers.BeaconController.updatePackaging"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_BeaconController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_BeaconController_index0_invoker = createInvoker(
    BeaconController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BeaconController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_BeaconController_show1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("show")))
  )
  private[this] lazy val controllers_BeaconController_show1_invoker = createInvoker(
    BeaconController_1.show,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BeaconController",
      "show",
      Nil,
      "POST",
      this.prefix + """show""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_BeaconController_confirmFinishedProductInspection2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirmFinishedProductInspection")))
  )
  private[this] lazy val controllers_BeaconController_confirmFinishedProductInspection2_invoker = createInvoker(
    BeaconController_1.confirmFinishedProductInspection(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BeaconController",
      "confirmFinishedProductInspection",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """confirmFinishedProductInspection""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_BeaconController_confirmPackaging3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirmPackaging")))
  )
  private[this] lazy val controllers_BeaconController_confirmPackaging3_invoker = createInvoker(
    BeaconController_1.confirmPackaging(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BeaconController",
      "confirmPackaging",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """confirmPackaging""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_BeaconController_createFinishedProductInspection4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createFinishedProductInspection")))
  )
  private[this] lazy val controllers_BeaconController_createFinishedProductInspection4_invoker = createInvoker(
    BeaconController_1.createFinishedProductInspection,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BeaconController",
      "createFinishedProductInspection",
      Nil,
      "POST",
      this.prefix + """createFinishedProductInspection""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BeaconController_updateFinishedProductInspection5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateFinishedProductInspection")))
  )
  private[this] lazy val controllers_BeaconController_updateFinishedProductInspection5_invoker = createInvoker(
    BeaconController_1.updateFinishedProductInspection,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BeaconController",
      "updateFinishedProductInspection",
      Nil,
      "POST",
      this.prefix + """updateFinishedProductInspection""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BeaconController_updateVisualInspection6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateVisualInspection")))
  )
  private[this] lazy val controllers_BeaconController_updateVisualInspection6_invoker = createInvoker(
    BeaconController_1.updateVisualInspection,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BeaconController",
      "updateVisualInspection",
      Nil,
      "POST",
      this.prefix + """updateVisualInspection""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BeaconController_updatePackaging7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatePackaging")))
  )
  private[this] lazy val controllers_BeaconController_updatePackaging7_invoker = createInvoker(
    BeaconController_1.updatePackaging,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BeaconController",
      "updatePackaging",
      Nil,
      "POST",
      this.prefix + """updatePackaging""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_BeaconController_index0_route(params@_) =>
      call { 
        controllers_BeaconController_index0_invoker.call(BeaconController_1.index)
      }
  
    // @LINE:8
    case controllers_BeaconController_show1_route(params@_) =>
      call { 
        controllers_BeaconController_show1_invoker.call(BeaconController_1.show)
      }
  
    // @LINE:9
    case controllers_BeaconController_confirmFinishedProductInspection2_route(params@_) =>
      call(params.fromQuery[String]("serial", None), params.fromQuery[String]("bleAddress", None)) { (serial, bleAddress) =>
        controllers_BeaconController_confirmFinishedProductInspection2_invoker.call(BeaconController_1.confirmFinishedProductInspection(serial, bleAddress))
      }
  
    // @LINE:10
    case controllers_BeaconController_confirmPackaging3_route(params@_) =>
      call(params.fromQuery[String]("serial", None), params.fromQuery[String]("bleAddress", None)) { (serial, bleAddress) =>
        controllers_BeaconController_confirmPackaging3_invoker.call(BeaconController_1.confirmPackaging(serial, bleAddress))
      }
  
    // @LINE:11
    case controllers_BeaconController_createFinishedProductInspection4_route(params@_) =>
      call { 
        controllers_BeaconController_createFinishedProductInspection4_invoker.call(BeaconController_1.createFinishedProductInspection)
      }
  
    // @LINE:12
    case controllers_BeaconController_updateFinishedProductInspection5_route(params@_) =>
      call { 
        controllers_BeaconController_updateFinishedProductInspection5_invoker.call(BeaconController_1.updateFinishedProductInspection)
      }
  
    // @LINE:13
    case controllers_BeaconController_updateVisualInspection6_route(params@_) =>
      call { 
        controllers_BeaconController_updateVisualInspection6_invoker.call(BeaconController_1.updateVisualInspection)
      }
  
    // @LINE:14
    case controllers_BeaconController_updatePackaging7_route(params@_) =>
      call { 
        controllers_BeaconController_updatePackaging7_invoker.call(BeaconController_1.updatePackaging)
      }
  
    // @LINE:17
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
