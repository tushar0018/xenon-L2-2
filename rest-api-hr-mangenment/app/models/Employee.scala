package models

import org.joda.time.DateTime
import play.api.libs.json.{Format, Json}
import reactivemongo.play.json._
import reactivemongo.bson.BSONObjectID
import reactivemongo.bson._
import play.api.libs.json.JodaWrites._
import play.api.libs.json.JodaReads._

//defination of employee
case class Employee(
                  _id:Option[BSONObjectID],
                  _JoiningDate: Option[DateTime],
                  _LeavingDate: Option[DateTime],
                  name:String,
                  role:String
                )
                
// JSON-BSON serializers                
object Employee{
  implicit val fmt : Format[Employee] = Json.format[Employee]  //JSON serialization using automated mapping
  
  implicit object EmployeeBSONReader extends BSONDocumentReader[Employee] {
    def read(doc: BSONDocument): Employee = {
      Employee(
        doc.getAs[BSONObjectID]("_id"),
        doc.getAs[BSONDateTime]("_JoiningDate").map(dt => new DateTime(dt.value)),
        doc.getAs[BSONDateTime]("_LeavingDate").map(dt => new DateTime(dt.value)),
        doc.getAs[String]("name").get,
        doc.getAs[String]("role").get)
    }
  }

  implicit object EmployeeBSONWriter extends BSONDocumentWriter[Employee] {
    def write(Employee: Employee): BSONDocument = {
      BSONDocument(
        "_id" -> Employee._id,
        "_JoiningDate" -> Employee._JoiningDate.map(date => BSONDateTime(date.getMillis)),
        "_LeavingDate" -> Employee._LeavingDate.map(date => BSONDateTime(date.getMillis)),
        "name" -> Employee.name,
        "role" -> Employee.role


      )
    }
  }
}
