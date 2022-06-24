Reactivemongo for Play 2.8 Example
=======================
This is a Play CRUD Example using reactiveMongo driver. It demontrates:
<ul>
<li>MongoDb Connection using reactiveMongoDb in Play</li>
<li>BSONReader and BSONWriter Implementation</li>
<li>CRUD using different data type</li>
</ul>

This example use the following:
<ul>
<li>Play Framework 2.8.0</li>
<li>Reactive Scala Driver for MongoDB 0.20.13-play28</li>
<li>Scala 2.13.3</li>
<li>Mongodb</li>
</ul>

### How to run
Setup a local mongo server using docker:
```shell script
mkdir ~/data
docker run --name local-mongodb -d -p 27017:27017 -v ~/data:/data/db mongo
```
Test and run the application:
```shell script
sbt test
sbt run
```
for POST :
```
curl --verbose --header "Content-Type: application/json"  --request POST  --data '{ "name":"Deep Rajput", "role":"Design manager" }' http://localhost:9000/Employees
```
for GET:
```
curl --verbose --request GET http://localhost:9000/Employees
curl -X GET "http://localhost:9000/Employees/<id>"
```
FOR DELETE:
```
curl -X DELETE "http://localhost:9000/Employees/<id>"
```
FOR UPDATE:
```
curl --verbose --header "Content-Type: application/json" --request PUT --data '{ "name":"Tushar Lakhotia", "role":"intern" }' http://localhost:9000/Employees/<id>
```
