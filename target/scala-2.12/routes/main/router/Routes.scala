// @GENERATOR:play-routes-compiler
// @SOURCE:C:/tools/cygwin/home/Kosuke/sources/sample/conf/routes
// @DATE:Sat Dec 01 13:41:08 JST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:11
  BeaconController_2: controllers.BeaconController,
  // @LINE:19
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:11
    BeaconController_2: controllers.BeaconController,
    // @LINE:19
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, BeaconController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, BeaconController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """beacons/show""", """controllers.HomeController.show"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listPlaces""", """controllers.HomeController.listPlaces"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirmFinishedProductInspection""", """controllers.BeaconController.confirmFinishedProductInspection(serial:String, bleAddress:String)"""),
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
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_show1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("beacons/show")))
  )
  private[this] lazy val controllers_HomeController_show1_invoker = createInvoker(
    HomeController_0.show,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "show",
      Nil,
      "POST",
      this.prefix + """beacons/show""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_listPlaces2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listPlaces")))
  )
  private[this] lazy val controllers_HomeController_listPlaces2_invoker = createInvoker(
    HomeController_0.listPlaces,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listPlaces",
      Nil,
      "GET",
      this.prefix + """listPlaces""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_BeaconController_confirmFinishedProductInspection3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirmFinishedProductInspection")))
  )
  private[this] lazy val controllers_BeaconController_confirmFinishedProductInspection3_invoker = createInvoker(
    BeaconController_2.confirmFinishedProductInspection(fakeValue[String], fakeValue[String]),
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

  // @LINE:12
  private[this] lazy val controllers_BeaconController_createFinishedProductInspection4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createFinishedProductInspection")))
  )
  private[this] lazy val controllers_BeaconController_createFinishedProductInspection4_invoker = createInvoker(
    BeaconController_2.createFinishedProductInspection,
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

  // @LINE:13
  private[this] lazy val controllers_BeaconController_updateFinishedProductInspection5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateFinishedProductInspection")))
  )
  private[this] lazy val controllers_BeaconController_updateFinishedProductInspection5_invoker = createInvoker(
    BeaconController_2.updateFinishedProductInspection,
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

  // @LINE:14
  private[this] lazy val controllers_BeaconController_updateVisualInspection6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateVisualInspection")))
  )
  private[this] lazy val controllers_BeaconController_updateVisualInspection6_invoker = createInvoker(
    BeaconController_2.updateVisualInspection,
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

  // @LINE:15
  private[this] lazy val controllers_BeaconController_updatePackaging7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatePackaging")))
  )
  private[this] lazy val controllers_BeaconController_updatePackaging7_invoker = createInvoker(
    BeaconController_2.updatePackaging,
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

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_HomeController_show1_route(params@_) =>
      call { 
        controllers_HomeController_show1_invoker.call(HomeController_0.show)
      }
  
    // @LINE:10
    case controllers_HomeController_listPlaces2_route(params@_) =>
      call { 
        controllers_HomeController_listPlaces2_invoker.call(HomeController_0.listPlaces)
      }
  
    // @LINE:11
    case controllers_BeaconController_confirmFinishedProductInspection3_route(params@_) =>
      call(params.fromQuery[String]("serial", None), params.fromQuery[String]("bleAddress", None)) { (serial, bleAddress) =>
        controllers_BeaconController_confirmFinishedProductInspection3_invoker.call(BeaconController_2.confirmFinishedProductInspection(serial, bleAddress))
      }
  
    // @LINE:12
    case controllers_BeaconController_createFinishedProductInspection4_route(params@_) =>
      call { 
        controllers_BeaconController_createFinishedProductInspection4_invoker.call(BeaconController_2.createFinishedProductInspection)
      }
  
    // @LINE:13
    case controllers_BeaconController_updateFinishedProductInspection5_route(params@_) =>
      call { 
        controllers_BeaconController_updateFinishedProductInspection5_invoker.call(BeaconController_2.updateFinishedProductInspection)
      }
  
    // @LINE:14
    case controllers_BeaconController_updateVisualInspection6_route(params@_) =>
      call { 
        controllers_BeaconController_updateVisualInspection6_invoker.call(BeaconController_2.updateVisualInspection)
      }
  
    // @LINE:15
    case controllers_BeaconController_updatePackaging7_route(params@_) =>
      call { 
        controllers_BeaconController_updatePackaging7_invoker.call(BeaconController_2.updatePackaging)
      }
  
    // @LINE:19
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
