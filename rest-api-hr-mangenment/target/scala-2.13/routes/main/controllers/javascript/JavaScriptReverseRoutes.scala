// @GENERATOR:play-routes-compiler
// @SOURCE:/home/tushar/Desktop/xenon/rest-api-hr-mangenment/conf/routes
// @DATE:Mon Jun 20 07:01:03 IST 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {

  // @LINE:2
  class ReverseEmployeeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Employees"})
        }
      """
    )
  
    // @LINE:3
    def findOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.findOne",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Employees/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:2
    def findAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.findAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Employees"})
        }
      """
    )
  
    // @LINE:6
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "Employees/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:5
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "Employees/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
