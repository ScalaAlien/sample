// @GENERATOR:play-routes-compiler
// @SOURCE:C:/tools/cygwin/home/Kosuke/sources/sample/conf/routes
// @DATE:Mon Nov 19 23:57:16 JST 2018


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
