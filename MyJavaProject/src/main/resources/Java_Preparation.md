


Core Java
    - OOPS Concepts
	- Exceptions
	- Collections
    - Java version Features
	
Spring
   - modules
   - Spring core
     Spring Framwork is buit on IOC principle
     Dependency Injection is a technique to implement IOC in applications.	 
	 
   - Srpring MVC
   - Spring JDBC

Web Services 
   - SOAP Concepts
   - REST Concepts
   - Spring REST Example

   JPA 
   - JPA Concepts
   - Hibernate JPA Concepts
   - Hibernate Example
  
 -------------------------------------------------------------------------------------------------------------- 
 JMS,JAXB,XML Concepts
 --------------------------
  
 SQL 
   - Basics
   - Joins
   - Important Queries
   
----------------------------------------------------------------------------------------------------------------

Spring Security

Spring boot

    
-------------------------------------------------------------------------------------------------------------------------------

Web services:

http://www.javajee.com/overview-of-top-down-and-bottom-up-soap-web-service-development

Security mechanisms:
https://howtodoinjava.com/security/restful-web-services-security-guide/

examples:
https://java2blog.com/spring-restful-web-services-crud-example/


Secure Spring REST API using OAuth2::
http://websystique.com/springmvc/spring-mvc-requestbody-responsebody-example/


 eclipse - wildfly
 http://www.ejbtutorial.com/j2ee/getting-started-with-j2ee-installing-wildfly-on-eclipse
 
 http://www.baeldung.com/apache-cxf-rest-api
 
 
 EJB with rest services
 http://www.wideskills.com/ejb/building-ejb-based-restful-web-services
 
 Eclipse JRE version issue
 https://stackoverflow.com/questions/2030434/eclipse-no-java-jre-jdk-no-virtual-machine
 
 Simple EJB project:
 http://www.javawebtutor.com/articles/ejb/ejb3_project_in_eclipse.php
 
 
 
 Wild fly
 
 https://github.com/wildfly/quickstart
 
 
 Wildfly deployment CXF Rest issues
 https://stackoverflow.com/questions/35434293/java-wildfly-10-cxf-native-dependency-module-issues
 
 
 org.apache.cxf,org.springframework.spring,
 
 http://localhost:8080/RestAppCXFDemo/rservice/accountservice/accounts/2
 http://localhost:8080/RestAppCXFDemo/rservice/employeeservice/emplist/1
 
  http://localhost:8888/RestAppCXFDemo/rservice/employeeservice/addEmployee
  
  {
    "name": "Padisetti",
    "empId": 3
  }
 
 ------------------------------------------------------------------------------------
 RESTful CRUD operations using Apache CXF
 
 
 http://www.javainterviewpoint.com/spring-restful-web-services-crud-example/
 http://www.benchresources.net/apache-cxf-jax-rs-restful-web-service-integrating-with-spring-hibernate/
 http://www.benchresources.net/web-services/apache-cxf-soap-tutorials/
 
 ----------------------------------------------------------------------------------
 
 http://localhost:8888/RestfulCXFApp/services/employeeservice/addEmployee
 http://localhost:8888/RestfulCXFApp/services/employeeservice/getemployee/1
 http://localhost:8888/RestfulCXFApp/services/employeeservice/updateemployee
 http://localhost:8888/RestfulCXFApp/services/employeeservice/deleteemployee
 http://localhost:8888/RestfulCXFApp/services/employeeservice/getallemployees
 
 SOAP request in Postman
 -------------------------------
 http://blog.getpostman.com/wp-content/uploads/2014/08/SOAP-requests-using-Postman.png?x38712
 
 
 
 ====================================================================
 Hashmap
 https://www.linkedin.com/pulse/how-hashmap-internally-works-java-anshudeep-bajpai/
 
 ====================================================================================================
 
Spring Boot and Kafka
Spring Cloud
Spring Security

Micro services concepts on Cloud
Basic lev


===============================================================
Data structures -  Stack

https://howtodoinjava.com/data-structure/java-stack-implementation-array/

https://makeinjava.com/create-implement-stack-using-array-java-example/   *** basic

Heap dumps
------------------
https://dzone.com/articles/how-to-capture-java-heap-dumps-7-options


core java - anonymous inner class
https://www.javatpoint.com/anonymous-inner-class

Java 8
https://www.javatpoint.com/java-lambda-expressions
https://www.javatpoint.com/java-8-functional-interfaces


Java interview questions:
https://java2blog.com/system-out-println-java/

===============================================================================
what-is-the-difference-between-microservices-and-webservices?

A microservice is a software architecture, which can be implemented with webservices.

A webservice is just a technology (one of many) for providing services over "web" or HTTP.

Micro Service Concepts:
https://www.tatvasoft.com/blog/the-difference-between-micro-services-and-web-services/

==================================================================

youtube videos  - Micro Services
https://www.youtube.com/watch?v=gfWr2_H39N0

Micro service - Interview questions:
https://www.youtube.com/watch?v=zWWgKlMEDUU

==================================================
Hinernate
https://javarevisited.blogspot.com/2012/09/difference-hibernate-save-vs-persist-and-saveOrUpdate.html


OAuth2 for REST API
https://dzone.com/articles/secure-spring-rest-api-using-oauth2

Spring REST API -example
https://howtodoinjava.com/spring-restful/spring-rest-crud-jpa-example/
https://dzone.com/articles/whats-new-in-spring-framework-5


 By annotating the controller class with @RestController annotation, you no longer need to add @ResponseBody to all the request mapping methods. The @ResponseBody annotation is active by default.

@RestController
@RequestMapping("employees")

@RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
    public Employee getEmployeeInJSON(@PathVariable String name)

----------------------------------
Add the <context:component-scan> and <mvc:annotation-driven /> tags to the Spring configuration file.
â€¢ <context:component-scan> activates the annotations and scans the packages to find and register beans within the application context. 
â€¢ <mvc:annotation-driven/> adds support for reading and writing JSON/XML if the Jackson/JAXB libraries are on the classpath. 
------------------------------------------------------------------

Spring Restful Web services

https://www.javainterviewpoint.com/spring-restful-web-services-crud-example/

We have annotated our â€œStudentControllerâ€� class with @RestController, In Spring 4 @RestController annotation is introduced it is a combination of @Controller + @ResponseBody. So when using @RestController, you do not need to use @ResponseBody it is optional now
@RequestBody: This annotation tells Spring to bind the incoming HTTP request body( object passed in the request). HTTP Message converters convert the HTTP request body into domain object based on Accept header present in the request.
@PathVariable: This annotation will bind method argument to the URI template variable.
We have added the â€œjackson-databindâ€� as our dependency, Spring invokes inbuilt MappingJackson2HttpMessageConverter to convert the response into JSON.

--------------------------------------------------------------

n this example, we are using @GetMapping, @PostMapping, @PutMapping and @DeleteMapping annotations, these annotations are introduced from Spring 4.3 version in parallel of @RequestMapping with Http Methods annotation as below.

@GetMapping = @RequestMapping + Http GET method
-----------------------------------------------------------------------

Java based spring mvc configuration
https://www.dineshonjava.com/spring-restful-web-services-json-crud-example/


Spring Rest OAuth2
===========================
https://dzone.com/articles/secure-spring-rest-with-spring-security-and-oauth2


Spring Batch
https://www.journaldev.com/17119/spring-batch

Spring 5 - features:
https://www.journaldev.com/20714/spring-5

Spring basic level interview questions:
https://www.greycampus.com/blog/programming/top-spring-interview-questions-and-answers

Spring core components:
The SpEL module provides a powerful expression language for manipulating objects during execution.
Context is built on the basis of Beans and Core and allows you to access any object that is defined in the settings. The key element of the Context module is the ApplicationContext interface.
The Core module provides key parts of the framework including IoC and DI properties.
The Bean module is responsible for creating and managing Spring Beans â€“ is application context structure unit.

Spring Bean life cycle:
https://www.javainterviewpoint.com/spring-bean-life-cycle/



Design Patterns:

1. Creational Design pattern : deals with initializing and configuring classes
	-Singleton
	-Factory Pattern
2. Structural Design pattern : to separate the interface and implementation of class
    - Composite Pattern
	- Fasade Pattern
	
3. Behavioral Design pattern : deals with interaction among group of classes
     - Command Pattern
	 - Observer Pattern

Composite Design pattern:

Observer Design pattern:
https://www.baeldung.com/java-observer-pattern

==================================================================

Java 8 - Method References:

https://howtodoinjava.com/java8/lambda-method-references-example/





Facade design pattern:
 facade encapsulates a complex subsystem behind a simple interface.
 It hides much of the complexity and makes the subsystem easy to use.
 
 Design pattern
 https://codepumpkin.com/design-patterns/
 

Spring - prototype and singleton difference
https://dzone.com/articles/an-interview-question-on-spring-singletons
https://stackoverflow.com/questions/16058365/what-is-difference-between-singleton-and-prototype-bean

Spring AOP
https://howtodoinjava.com/spring-aop-tutorial/


Producer Consumer Problem
https://dzone.com/articles/the-evolution-of-producer-consumer-problem-in-java

String questions:
https://dzone.com/articles/top-10-questions-java-strings

https://javaconceptoftheday.com/java-string-interview-questions-and-answers/

Java memory management:
https://www.baeldung.com/java-stack-heap

java locks:
https://www.baeldung.com/java-concurrent-locks


