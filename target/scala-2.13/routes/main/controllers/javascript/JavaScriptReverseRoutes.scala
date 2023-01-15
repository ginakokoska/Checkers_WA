// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/conf/routes
// @DATE:Wed Jan 11 22:09:17 CET 2023

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers.javascript {

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def processRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.processRequest",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "command"})
        }
      """
    )
  
    // @LINE:12
    def new10Grid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.new10Grid",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "new10Grid"})
        }
      """
    )
  
    // @LINE:13
    def instructions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.instructions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instructions"})
        }
      """
    )
  
    // @LINE:22
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "websocket"})
        }
      """
    )
  
    // @LINE:14
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.test",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
    // @LINE:21
    def current: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.current",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "current"})
        }
      """
    )
  
    // @LINE:9
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:10
    def new8Grid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.new8Grid",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "new8Grid"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
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
