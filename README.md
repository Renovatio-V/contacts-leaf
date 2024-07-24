# Task Management System

This project is a Task Management System that stores information about contacts in a table. The table includes columns for an auto-incremented ID, name, phone number, email, and two buttons for editing and deleting entries. The application also features a navigation bar with options for Home and Add Contact.

## Architecture

- **Presentation Layer**: Thymeleaf and Spring MVC
- **Service Layer**: Spring
- **Repository Layer**: Spring Data
- **Entity Layer**: JPA Entities
- **Database**: MySQL

  ![image](https://github.com/user-attachments/assets/4c9bbe69-70cc-4574-9d0b-38d0030b26f6)

### Technologies Used

- **Backend**: 
  - Java
  - Spring Boot
  - Spring MVC
  - Spring Data JPA

- **Frontend**: 
  - Thymeleaf
  - Bootstrap
    
- **Database**: 
  - MySQL
 
## General View
![image](https://github.com/user-attachments/assets/b3e80ad6-a80c-4664-9996-b91e2e3152c8)


### Features

- **Contact Management**:
  - Add new contacts
  - Edit existing contacts
  - Delete contacts
  - View list of contacts

#### Prerequisites

- Java 22
- Maven
- MySQL


### Aplication Properties
  ```xml
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```



