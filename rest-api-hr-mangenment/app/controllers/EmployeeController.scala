//Controller listens for HTTP requests, extracts relevant data from the 'event',request headers and applies changes to the underlying model objects.
package controllers

import javax.inject._
import play.api.mvc._
import repositories.EmployeeRepository
import reactivemongo.bson.BSONObjectID
import play.api.libs.json.{Json, __}
import scala.util.{Failure, Success}
import scala.concurrent.{ExecutionContext, Future}

import models.Employee
import play.api.libs.json.JsValue



@Singleton
class EmployeeController @Inject()(
                                    implicit executionContext: ExecutionContext,
                                    val employeeRepository: EmployeeRepository,
                                    val controllerComponents: ControllerComponents)
  extends BaseController {
  
  //call the findall function in the repository
  def findAll():Action[AnyContent] = Action.async { implicit request: Request[AnyContent] =>
    employeeRepository.findAll().map {
      employees => Ok(Json.toJson(employees))
    }
  }

  //checks the id given ,if present call the findone function in repository 
  def findOne(id:String):Action[AnyContent] = Action.async { implicit request: Request[AnyContent] =>
    val objectIdTryResult = BSONObjectID.parse(id)
    objectIdTryResult match {
      case Success(objectId) => employeeRepository.findOne(objectId).map {
        employee => Ok(Json.toJson(employee))
      }
      case Failure(_) => Future.successful(BadRequest("Cannot parse the employee id"))
    }
  }
  
  //create an employee based on the values passed in correct format by passing values to create function in the repository
  def create():Action[JsValue] = Action.async(controllerComponents.parsers.json) { implicit request => {

    request.body.validate[Employee].fold(
      _ => Future.successful(BadRequest("Cannot parse request body")),
      employee =>
        employeeRepository.create(employee).map {
          _ => Created(Json.toJson(employee))
        }
    )
  }}

  //checks the body for correct format then match the id in the database and if match then call update in the repository
  def update(
              id: String):Action[JsValue]  = Action.async(controllerComponents.parsers.json) { implicit request => {
    request.body.validate[Employee].fold(
      _ => Future.successful(BadRequest("Cannot parse request body")),
      employee =>{
        val objectIdTryResult = BSONObjectID.parse(id)
        objectIdTryResult match {
          case Success(objectId) => employeeRepository.update(objectId, employee).map {
            result => Ok(Json.toJson(result.ok))
          }
          case Failure(_) => Future.successful(BadRequest("Cannot parse the Employee id"))
        }
      }
    )
  }}
 
 //matches the id and call delete to delete the object in the database
  def delete(id: String):Action[AnyContent]  = Action.async { implicit request => {
    val objectIdTryResult = BSONObjectID.parse(id)
    objectIdTryResult match {
      case Success(objectId) => employeeRepository.delete(objectId).map {
        _ => NoContent
      }
      case Failure(_) => Future.successful(BadRequest("Cannot parse the Employee id"))
    }
  }}
}
