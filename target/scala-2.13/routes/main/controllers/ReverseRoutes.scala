// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/conf/routes
// @DATE:Tue Oct 25 08:58:48 CEST 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def new10Grid(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "new10Grid")
    }
  
    // @LINE:11
    def instructions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "instructions")
    }
  
    // @LINE:13
    def move(start:String, dest:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "move/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("start", start)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("dest", dest)))
    }
  
    // @LINE:12
    def test(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
    // @LINE:7
    def home(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "index")
    }
  
    // @LINE:9
    def new8Grid(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "new8Grid")
    }
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
