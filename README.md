# Student and Course Management System

A Spring Boot web application designed to manage student records and their associated courses. This project was built to demonstrate full-stack development using Spring Boot, JPA, and JSP with a custom-styled user interface.

## Key Features
- **Automated Data Population**: The system automatically generates 10 courses and 10 student records upon startup for testing purposes.
- **Student Management**: Full support for adding, viewing, and updating student information.
- **Relational Data**: Implements an INNER JOIN between Students and Courses to display related information in a single view.
- **Custom UI**: A responsive and modern interface built using vanilla CSS.
- **Unit Testing**: Core service logic is validated using JUnit 5 and Mockito.

## Technology Stack
- **Backend**: Java 17, Spring Boot 3.2, Spring Data JPA
- **Database**: MySQL
- **Frontend**: Jakarta JSP, JSTL, Vanilla CSS
- **Testing**: JUnit 5, Mockito

## Installation and Setup

### 1. Database Configuration
Ensure MySQL is installed and running on your system. Create the required database using:
```sql
CREATE DATABASE student_db;
```

### 2. Application Properties
Update the database credentials in `src/main/resources/application.properties` to match your local MySQL setup:
```properties
spring.datasource.username=root
spring.datasource.password=root
```

### 3. Execution
Run the application using your IDE or via the command line:
```bash
mvn spring-boot:run
```

### 4. Access
The application will be available at:
`http://localhost:8080/students`

## Author
Aditya Prasad

---
Spring Boot Assignment - May 2026
