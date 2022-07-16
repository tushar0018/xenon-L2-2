// @GENERATOR:play-routes-compiler
// @SOURCE:/home/tushar/Desktop/xenon/rest-api-hr-mangenment/conf/routes
// @DATE:Tue Jun 28 21:08:54 IST 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  EmployeeController_0: controllers.EmployeeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    EmployeeController_0: controllers.EmployeeController
  ) = this(errorHandler, EmployeeController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, EmployeeController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.EmployeeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Employees""", """controllers.EmployeeController.findAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Employees/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.findOne(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Employees""", """controllers.EmployeeController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Employees/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.update(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Employees/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.delete(id:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_EmployeeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_EmployeeController_index0_invoker = createInvoker(
    EmployeeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Routes""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_EmployeeController_findAll1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Employees")))
  )
  private[this] lazy val controllers_EmployeeController_findAll1_invoker = createInvoker(
    EmployeeController_0.findAll(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "findAll",
      Nil,
      "GET",
      this.prefix + """Employees""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_EmployeeController_findOne2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Employees/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_findOne2_invoker = createInvoker(
    EmployeeController_0.findOne(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "findOne",
      Seq(classOf[String]),
      "GET",
      this.prefix + """Employees/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_EmployeeController_create3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Employees")))
  )
  private[this] lazy val controllers_EmployeeController_create3_invoker = createInvoker(
    EmployeeController_0.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "create",
      Nil,
      "POST",
      this.prefix + """Employees""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_EmployeeController_update4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Employees/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_update4_invoker = createInvoker(
    EmployeeController_0.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "update",
      Seq(classOf[String]),
      "POST",
      this.prefix + """Employees/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_EmployeeController_delete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Employees/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_delete5_invoker = createInvoker(
    EmployeeController_0.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """Employees/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_EmployeeController_index0_route(params@_) =>
      call { 
        controllers_EmployeeController_index0_invoker.call(EmployeeController_0.index)
      }
  
    // @LINE:3
    case controllers_EmployeeController_findAll1_route(params@_) =>
      call { 
        controllers_EmployeeController_findAll1_invoker.call(EmployeeController_0.findAll())
      }
  
    // @LINE:4
    case controllers_EmployeeController_findOne2_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_EmployeeController_findOne2_invoker.call(EmployeeController_0.findOne(id))
      }
  
    // @LINE:5
    case controllers_EmployeeController_create3_route(params@_) =>
      call { 
        controllers_EmployeeController_create3_invoker.call(EmployeeController_0.create())
      }
  
    // @LINE:6
    case controllers_EmployeeController_update4_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_EmployeeController_update4_invoker.call(EmployeeController_0.update(id))
      }
  
    // @LINE:7
    case controllers_EmployeeController_delete5_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_EmployeeController_delete5_invoker.call(EmployeeController_0.delete(id))
      }
  }
}
