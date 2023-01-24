// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/petri/Desktop/Checkers_WA/conf/routes
// @DATE:Tue Jan 24 09:13:02 CET 2023

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers {

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def processRequest(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "command")
    }
  
    // @LINE:12
    def new10Grid(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "new10Grid")
    }
  
    // @LINE:13
    def instructions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "instructions")
    }
  
    // @LINE:22
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "websocket")
    }
  
    // @LINE:14
    def test(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
    // @LINE:21
    def current(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "current")
    }
  
    // @LINE:9
    def home(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:10
    def new8Grid(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "new8Grid")
    }
  
  }

  // @LINE:30
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
