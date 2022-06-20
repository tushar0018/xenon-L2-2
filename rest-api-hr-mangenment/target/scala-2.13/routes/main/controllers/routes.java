// @GENERATOR:play-routes-compiler
// @SOURCE:/home/tushar/Desktop/xenon/rest-api-hr-mangenment/conf/routes
// @DATE:Mon Jun 20 07:01:03 IST 2022

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseEmployeeController EmployeeController = new controllers.ReverseEmployeeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseEmployeeController EmployeeController = new controllers.javascript.ReverseEmployeeController(RoutesPrefix.byNamePrefix());
  }

}
