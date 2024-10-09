TrainingCenterManagement</br>

This README provides a step-by-step guide to the TrainingCenterManagement project, detailing how to set up, configure, and run the project.</br>

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Set Up</br>
Ensure that you have the following installed before proceeding:</br>
1.Java 8 or higher</br>
2.Maven 3.6+ (for dependency management and building the project)</br>
3.MySQL or any other relational database</br>
4.An IDE such as IntelliJ IDEA or Eclipse with Spring Boot support</br>
5.Postman to test APIs

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Database Configurations as per MySQL : please make changes here as per your choice of DB </br>
File name : application.properties</br>

spring.datasource.url=jdbc:mysql://localhost:3306/TC?useSSL=false&serverTimezone=UTC</br>
spring.datasource.username=give_here_your_user_name</br>
spring.datasource.password=give_here_your_password</br>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver</br>

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Accessing the Application</br>
Execute with intelliji or </br>
with terminal --> mvn spring-boot:run</br>
Open your browser and navigate to http://localhost:8080 (or the port your application is running on).</br>

API Endpoints</br>

POST /trainingcenterpost: Create a new training center.</br>
GET /trainingcenters: Retrieve all training centers.</br>
GET http://localhost:8080/centercode?centercode=1234567801</br>

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Project Overview</br>

TrainingCenterManagement is a Spring Boot application designed to manage training centers and their related information.</br> 
The project includes:</br>
1.Management of training center details (name, code, contact info, etc.).</br>
2.Integration with a database for persistent data storage.</br>
3.Implementation of data validation and error handling.</br>
