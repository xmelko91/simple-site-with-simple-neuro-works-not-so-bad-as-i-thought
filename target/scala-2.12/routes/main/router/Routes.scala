// @GENERATOR:play-routes-compiler
// @SOURCE:/home/serge/projexts/neurosite/conf/routes
// @DATE:Tue Apr 30 17:20:13 MSK 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_3: controllers.HomeController,
  // @LINE:8
  getDirection_1: controllers.getDirection,
  // @LINE:9
  getArr_2: controllers.getArr,
  // @LINE:12
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_3: controllers.HomeController,
    // @LINE:8
    getDirection_1: controllers.getDirection,
    // @LINE:9
    getArr_2: controllers.getArr,
    // @LINE:12
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_3, getDirection_1, getArr_2, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, getDirection_1, getArr_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main""", """controllers.getDirection.doNow"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """arr""", """controllers.getArr.getRes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_getDirection_doNow1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main")))
  )
  private[this] lazy val controllers_getDirection_doNow1_invoker = createInvoker(
    getDirection_1.doNow,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.getDirection",
      "doNow",
      Nil,
      "GET",
      this.prefix + """main""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_getArr_getRes2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("arr")))
  )
  private[this] lazy val controllers_getArr_getRes2_invoker = createInvoker(
    getArr_2.getRes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.getArr",
      "getRes",
      Nil,
      "POST",
      this.prefix + """arr""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
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
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:8
    case controllers_getDirection_doNow1_route(params@_) =>
      call { 
        controllers_getDirection_doNow1_invoker.call(getDirection_1.doNow)
      }
  
    // @LINE:9
    case controllers_getArr_getRes2_route(params@_) =>
      call { 
        controllers_getArr_getRes2_invoker.call(getArr_2.getRes)
      }
  
    // @LINE:12
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
