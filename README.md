# Student Course Management System

## Overview
This is a Spring Boot web application that manages Students and Courses. It supports creating, reading, and updating student records, along with displaying their associated courses.

## Features
- **Populate Database**: Automatically populates 10 courses and 10 students on startup.
- **Create Operation**: Add new students via a web form.
- **Read Operation**: View a list of all students with an INNER JOIN to their respective courses.
- **Update Operation**: Modify existing student details.
- **Premium UI**: Modern, responsive design using custom CSS.

## Technologies Used
- Java 17
- Spring Boot 3.2
- Spring Data JPA
- Jakarta JSP & JSTL
- MySQL

## Architecture
The application follows a standard layered architecture:
- **Model**: Entity definitions (`Student`, `Course`).
- **Repository**: Database operations using JPA.
- **Service**: Business logic.
- **Controller**: HTTP request handling.
- **View**: JSP templates with premium styling.

## How to Run
1. **Configure Database**: Update `src/main/resources/application.properties` with your MySQL credentials.
2. **Create Schema**: Run `CREATE DATABASE student_db;` in your MySQL client.
3. **Run Application**: Execute `DemoApplication.java` from your IDE.
4. **Access**: Navigate to `http://localhost:8080/students`.

## Testing
Unit tests are implemented using **JUnit 5** and **Mockito**. Run them using:
```bash
mvn test
```

## Author
Aditya Prasad

