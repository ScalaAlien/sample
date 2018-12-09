// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Kosuke/Desktop/sample/conf/routes
// @DATE:Sun Dec 09 20:55:25 JST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
