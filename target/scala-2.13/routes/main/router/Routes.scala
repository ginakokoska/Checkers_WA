// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ginakokoska/IdeaProjects/HTWG/AIN5/Webapplikation/checkers_wa/conf/routes
// @DATE:Sun Jan 15 20:10:49 CET 2023

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  HomeController_1: controllers.HomeController,
  // @LINE:30
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    HomeController_1: controllers.HomeController,
    // @LINE:30
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.home()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """new8Grid""", """controllers.HomeController.new8Grid"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """new10Grid""", """controllers.HomeController.new10Grid"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """instructions""", """controllers.HomeController.instructions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.HomeController.test"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """command""", """controllers.HomeController.processRequest"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """current""", """controllers.HomeController.current"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """websocket""", """controllers.HomeController.socket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_HomeController_home0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_home0_invoker = createInvoker(
    HomeController_1.home(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "home",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_new8Grid1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("new8Grid")))
  )
  private[this] lazy val controllers_HomeController_new8Grid1_invoker = createInvoker(
    HomeController_1.new8Grid,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "new8Grid",
      Nil,
      "GET",
      this.prefix + """new8Grid""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_new10Grid2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("new10Grid")))
  )
  private[this] lazy val controllers_HomeController_new10Grid2_invoker = createInvoker(
    HomeController_1.new10Grid,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "new10Grid",
      Nil,
      "GET",
      this.prefix + """new10Grid""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_instructions3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("instructions")))
  )
  private[this] lazy val controllers_HomeController_instructions3_invoker = createInvoker(
    HomeController_1.instructions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "instructions",
      Nil,
      "GET",
      this.prefix + """instructions""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_test4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_HomeController_test4_invoker = createInvoker(
    HomeController_1.test,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "test",
      Nil,
      "GET",
      this.prefix + """test""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_processRequest5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("command")))
  )
  private[this] lazy val controllers_HomeController_processRequest5_invoker = createInvoker(
    HomeController_1.processRequest,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "processRequest",
      Nil,
      "POST",
      this.prefix + """command""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_current6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("current")))
  )
  private[this] lazy val controllers_HomeController_current6_invoker = createInvoker(
    HomeController_1.current,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "current",
      Nil,
      "GET",
      this.prefix + """current""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_socket7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("websocket")))
  )
  private[this] lazy val controllers_HomeController_socket7_invoker = createInvoker(
    HomeController_1.socket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "socket",
      Nil,
      "GET",
      this.prefix + """websocket""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_HomeController_home0_route(params@_) =>
      call { 
        controllers_HomeController_home0_invoker.call(HomeController_1.home())
      }
  
    // @LINE:10
    case controllers_HomeController_new8Grid1_route(params@_) =>
      call { 
        controllers_HomeController_new8Grid1_invoker.call(HomeController_1.new8Grid)
      }
  
    // @LINE:12
    case controllers_HomeController_new10Grid2_route(params@_) =>
      call { 
        controllers_HomeController_new10Grid2_invoker.call(HomeController_1.new10Grid)
      }
  
    // @LINE:13
    case controllers_HomeController_instructions3_route(params@_) =>
      call { 
        controllers_HomeController_instructions3_invoker.call(HomeController_1.instructions)
      }
  
    // @LINE:14
    case controllers_HomeController_test4_route(params@_) =>
      call { 
        controllers_HomeController_test4_invoker.call(HomeController_1.test)
      }
  
    // @LINE:19
    case controllers_HomeController_processRequest5_route(params@_) =>
      call { 
        controllers_HomeController_processRequest5_invoker.call(HomeController_1.processRequest)
      }
  
    // @LINE:21
    case controllers_HomeController_current6_route(params@_) =>
      call { 
        controllers_HomeController_current6_invoker.call(HomeController_1.current)
      }
  
    // @LINE:22
    case controllers_HomeController_socket7_route(params@_) =>
      call { 
        controllers_HomeController_socket7_invoker.call(HomeController_1.socket)
      }
  
    // @LINE:30
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
