// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/petri/Desktop/Checkers_WA/conf/routes
// @DATE:Mon Oct 24 18:23:20 CEST 2022


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
