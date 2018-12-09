// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Kosuke/Desktop/sample/conf/routes
// @DATE:Sun Dec 09 20:55:25 JST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseBeaconController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def updateVisualInspection(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateVisualInspection")
    }
  
    // @LINE:9
    def confirmFinishedProductInspection(serial:String, bleAddress:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "confirmFinishedProductInspection" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("serial", serial)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bleAddress", bleAddress)))))
    }
  
    // @LINE:8
    def show(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "show")
    }
  
    // @LINE:10
    def confirmPackaging(serial:String, bleAddress:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "confirmPackaging" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("serial", serial)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bleAddress", bleAddress)))))
    }
  
    // @LINE:12
    def updateFinishedProductInspection(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateFinishedProductInspection")
    }
  
    // @LINE:14
    def updatePackaging(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatePackaging")
    }
  
    // @LINE:11
    def createFinishedProductInspection(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createFinishedProductInspection")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
