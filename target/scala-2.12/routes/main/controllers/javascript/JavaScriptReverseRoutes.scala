// @GENERATOR:play-routes-compiler
// @SOURCE:C:/tools/cygwin/home/Kosuke/sources/sample/conf/routes
// @DATE:Sun Dec 09 23:04:33 JST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
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
  
    // @LINE:9
    def selectByItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BeaconController.selectByItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "selectByItem"})
        }
      """
    )
  
    // @LINE:10
    def confirmFinishedProductInspection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BeaconController.confirmFinishedProductInspection",
      """
        function(serial0,bleAddress1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confirmFinishedProductInspection" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("serial", serial0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bleAddress", bleAddress1)])})
        }
      """
    )
  
    // @LINE:11
    def confirmPackaging: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BeaconController.confirmPackaging",
      """
        function(serial0,bleAddress1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confirmPackaging" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("serial", serial0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bleAddress", bleAddress1)])})
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
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BeaconController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def selectByDate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BeaconController.selectByDate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "selectByDate"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
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
