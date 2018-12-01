// @GENERATOR:play-routes-compiler
// @SOURCE:C:/tools/cygwin/home/Kosuke/sources/sample/conf/routes
// @DATE:Sat Dec 01 13:41:08 JST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:11
  class ReverseBeaconController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def updateVisualInspection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BeaconController.updateVisualInspection",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateVisualInspection"})
        }
      """
    )
  
    // @LINE:11
    def confirmFinishedProductInspection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BeaconController.confirmFinishedProductInspection",
      """
        function(serial0,bleAddress1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confirmFinishedProductInspection" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("serial", serial0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bleAddress", bleAddress1)])})
        }
      """
    )
  
    // @LINE:13
    def updateFinishedProductInspection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BeaconController.updateFinishedProductInspection",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateFinishedProductInspection"})
        }
      """
    )
  
    // @LINE:15
    def updatePackaging: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BeaconController.updatePackaging",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatePackaging"})
        }
      """
    )
  
    // @LINE:12
    def createFinishedProductInspection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BeaconController.createFinishedProductInspection",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createFinishedProductInspection"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.show",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "beacons/show"})
        }
      """
    )
  
    // @LINE:10
    def listPlaces: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.listPlaces",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listPlaces"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
