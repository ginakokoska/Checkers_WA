// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/conf/routes
// @DATE:Wed Nov 30 16:06:30 CET 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def toJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.toJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "toJson"})
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
  
    // @LINE:11
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.test",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
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
