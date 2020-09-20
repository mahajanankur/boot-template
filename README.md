## Spring boot template
This is a **spring-boot rest web-service** template for beginners.
Spring Boot is a project that is built on the top of the Spring Framework. It provides an easier and faster way to set up, configure, and run both simple and web-based applications.

It is a Spring module that provides the RAD (Rapid Application Development) feature to the Spring Framework. It is used to create a stand-alone Spring-based application that you can just run because it needs minimal Spring configuration.

#### Why should we use Spring Boot Framework?
- The dependency injection approach is used in Spring Boot.
- It contains powerful database transaction management capabilities.
- It simplifies integration with other Java frameworks like JPA/Hibernate ORM, Struts, etc.
- It reduces the cost and development time of the application.
- Along with the Spring Boot Framework, many other Spring sister projects help to build applications addressing modern business needs.

#### Spring other projects
- **Spring Data**: It simplifies data access from the relational and NoSQL databases.
- **Spring Batch**: It provides powerful batch processing.
- **Spring Security**: It is a security framework that provides robust security to applications.
- **Spring Social**: It supports integration with social networking like LinkedIn.
- **Spring Integration**: It is an implementation of Enterprise Integration Patterns. It facilitates integration with other enterprise applications using lightweight messaging and declarative adapters.

### Build

Maven is used as the dependency management platform. Download and install the dependecies by running the below command.
```
mvn clean install -DskipTests
```
### Run
Run `BootStarter` class as **Java application** by eclipse or run the below command from terminal inside the **root folder of the repository**.
```
mvn spring-boot:run
```
You can check **sample status api** for reference.
```
curl --location --request GET 'http://localhost:8080/api/status'
```
