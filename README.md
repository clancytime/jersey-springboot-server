# Spring Boot Server with Asynchronous Jersey

Simple application demonstrating Spring Boot integration using asynchronous Jersey calls and Spring's TaskExecutor to handle separate threads.

Installation:

  - pull down locally
  - mvn clean install
  - move created war to tomcat directory
  - start tomcat
  
go to [http://localhost:8080/resources/myresource](http://localhost:8080/resources/myresource) on a browser to call server synchronously, page will load in 20 seconds.

To test asynchronous calls and queue management (currently only two threads will process at one time) you will need to create a client side app.