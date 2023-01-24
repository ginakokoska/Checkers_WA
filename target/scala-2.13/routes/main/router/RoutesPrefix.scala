// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/petri/Desktop/Checkers_WA/conf/routes
// @DATE:Tue Jan 24 09:13:02 CET 2023


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
