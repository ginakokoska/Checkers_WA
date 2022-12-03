// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/conf/routes
// @DATE:Sat Dec 03 13:03:52 CET 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def processRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.processRequest",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "command"})
        }
      """
    )
  
    // @LINE:9
    def new10Grid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.new10Grid",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "new10Grid"})
        }
      """
    )
  
    // @LINE:10
    def instructions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.instructions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instructions"})
        }
      """
    )
  
    // @LINE:12
    def move: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.move",
      """
        function(start0,dest1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "move/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("start", start0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("dest", dest1))})
        }
      """
    )
  
    // @LINE:14
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "websocket"})
        }
      """
    )
  
    // @LINE:11
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.test",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
    // @LINE:13
    def current: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.current",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "current"})
        }
      """
    )
  
    // @LINE:7
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def new8Grid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.new8Grid",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "new8Grid"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
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
