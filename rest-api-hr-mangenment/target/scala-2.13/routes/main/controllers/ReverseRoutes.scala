// @GENERATOR:play-routes-compiler
// @SOURCE:/home/tushar/Desktop/xenon/rest-api-hr-mangenment/conf/routes
// @DATE:Tue Jun 28 21:08:54 IST 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:2
  class ReverseEmployeeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Employees")
    }
  
    // @LINE:4
    def findOne(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Employees/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:3
    def findAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Employees")
    }
  
    // @LINE:7
    def delete(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "Employees/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:6
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Employees/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:2
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
