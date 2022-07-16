//contains queries for CRUD operations.
package repositories

import models.Employee
import javax.inject._
import reactivemongo.api.bson.collection.BSONCollection
import play.modules.reactivemongo.ReactiveMongoApi
import scala.concurrent.{ExecutionContext, Future}
import reactivemongo.api.{Cursor, ReadPreference}
import reactivemongo.bson.{BSONDocument, BSONObjectID}
import org.joda.time.DateTime
import reactivemongo.api.commands.WriteResult



@Singleton
class EmployeeRepository @Inject()(
                                 implicit executionContext: ExecutionContext,
                                 reactiveMongoApi: ReactiveMongoApi
                               ) {
                               
  //The `collection` is a function to avoid potential problems in development with play auto reloading.
  def collection: Future[BSONCollection] = reactiveMongoApi.database.map(db => db.collection("Employees"))

  //for returning full list
  def findAll(limit: Int = 100): Future[Seq[Employee]] = {

    collection.flatMap(
      _.find(BSONDocument(), Option.empty[Employee])
        .cursor[Employee](ReadPreference.Primary)
        .collect[Seq](limit, Cursor.FailOnError[Seq[Employee]]())
    )
  }

  //for returning only one based on Id
  def findOne(id: BSONObjectID): Future[Option[Employee]] = {
    collection.flatMap(_.find(BSONDocument("_id" -> id), Option.empty[Employee]).one[Employee])
  }

  //for inserting data in the database
  def create(employee: Employee): Future[Option[Employee]] = 
  {
    collection.flatMap(_.insert(ordered = false)
      .one(employee.copy(_JoiningDate = Some(new DateTime()), _LeavingDate = Some(new DateTime()))))
      
      var c:Option[BSONObjectID] =employee._id
      
      collection.flatMap(_.find(BSONDocument("_id" -> c), Option.empty[Employee]).one[Employee])
      
      
    
  }

  //for updating already stored data on the basis of id
  def update(id: BSONObjectID, employee: Employee):Future[Option[Employee]] = {

    collection.flatMap(
      _.update(ordered = false).one(BSONDocument("_id" -> id),
        employee.copy(
          _LeavingDate = Some(new DateTime())))
    )
    collection.flatMap(_.find(BSONDocument("_id" -> id), Option.empty[Employee]).one[Employee])
  }

  //for deletion in a record
  def delete(id: BSONObjectID):Future[WriteResult] = {
    collection.flatMap(
      _.delete().one(BSONDocument("_id" -> id), Some(1))
    )
  }


}
