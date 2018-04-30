Spring Boot:

Spring Boot is a framework that makes it easier to quickly create standalone web applications by allowing servers to be embedded within the application. This leads to containerless deployment, being able to run the application 'out of the bag' and requires less setup to run the application as a different user. Spring Boot also reduces the amount of configuration required from the developer by carrying out auto-configuration.

Maven:

Maven is a project management tool used for building projects and dependency management. Maven was used due to it's popularity and the amount of documentation and support available.

H2:

The application uses a H2 database which is free to use and open-source. Any popular DBMS can be easily interchanged due to Spring Boot's auto-configuration. 

Mockito:

Mockito is a testing framework and allows developers to mock objects for easier unit testing on methods that require external services.

Steps to run project:

- Install JDK 8 and Maven
- Clone repo
- Import project as a Maven project in IDE (e.g. Eclipse/Spring STS)
- Right click Project > Run As > Maven Install
- Right click 'App.java' > Run As > Java Application
- Go to http://localhost:8080/index.html
