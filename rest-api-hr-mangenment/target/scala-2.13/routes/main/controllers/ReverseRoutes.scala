// @GENERATOR:play-routes-compiler
// @SOURCE:/home/tushar/Desktop/xenon/rest-api-hr-mangenment/conf/routes
// @DATE:Mon Jun 20 07:01:03 IST 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:2
  class ReverseEmployeeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Employees")
    }
  
    // @LINE:3
    def findOne(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Employees/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:2
    def findAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Employees")
    }
  
    // @LINE:6
    def delete(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "Employees/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:5
    def update(id:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "Employees/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }


}
