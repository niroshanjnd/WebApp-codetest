# WebApp-codetest
web application / Springboot, REST, HSQL

This application can be tested with advance rest client once deployed.
# add employee
POST http://localhost:8080/employee
{"id":"1","firstname":" Janaka","lastname":" Dassanayake"}
# view employees
GET http://localhost:8080/employee
# edit employee
PUT http://localhost:8080/employee/1
{"id":"1","firstname":" Janaka","lastname":" Niroshan"}
# delete employee
DELETE http://localhost:8080/employee/1
