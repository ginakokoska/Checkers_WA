// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Yannick/IdeaProjects/Checkers_WA/conf/routes
// @DATE:Sat Dec 03 03:36:19 CET 2022


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
