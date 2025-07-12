# Spring Boot Projects Collection
## 📘 `spring-rest-api`
A minimal Spring Boot project built with **Spring Web** and **Lombok**. This application handles HTTP requests from Postman and performs basic CRUD (Create, Read, Update, Delete) operations on an in-memory `ArrayList`, simulating a lightweight RESTful API without a database.

##  🗃️ `spring-data-jpa`
 This project expands on the previous one by adding **Spring Data JPA** and **PostgreSQL** to enable persistence using **Hibernate ORM**. It demonstrates:
- Full CRUD operations on a `Employee` entity
- Use of DTOs and the `@Query` annotation
- Input validation with **Spring Validation**
- Global exception handling for standardized error responses
- Real-world entity relationships: `@ManyToMany`, `@ManyToOne`, `@OneToOne`, `@OneToMany`
---
## ⚠️ `exception-management`
Built using **Spring Web**, **Spring Data JPA**, **PostgreSQL**, and **Lombok**, this project focuses on centralized exception handling. It features:
- Custom error messages for different exception types
- Global exception handling with uniform response structure (Postman/React-compatible)
- Scheduled tasks via `@Scheduled`
- Unit testing setup using `@Test` and **JUnit 5**
---
## 🔐 `jwt` – Authentication & Authorization
This project demonstrates a full authentication and authorization workflow using:
- **Spring Security** with **JWT**
- Custom filters integrated into Spring MVC
- User registration, login, access token, and refresh token flows
- Global exception handling
- **Swagger UI** for interactive API documentation
---
## 📊 `pageable` – Pagination & Sorting
This project demonstrates how to implement pagination and sorting in a REST API using:
- **Spring Data JPA**, **Spring Web**, and **PostgreSQL**
- `Pageable` and `Sort` interfaces for clean data navigation
- Practical GET requests with paginated and sorted responses
---
## 🧾 Prerequisites
To run and develop this project, the following tools and environments are required:
- **Java** (version 17)
- **Spring Tools for Eclipse** (version 4.30)
- **PostgreSQL** (version 14)
- **DBeaver** (version 25.0.5)
- **Postman**
- **JUnit 5**
---
## ⚙️ Installations
Before getting started, ensure that the following tools are installed:
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) — Required to compile and run the project.
- [Spring Tools for Eclipse 4.30](https://spring.io/tools) — IDE used for developing and managing Spring Boot projects.
- [PostgreSQL 14](https://www.postgresql.org/download/) — The relational database used in this project.
- [DBeaver 25.0.5](https://dbeaver.io/download/) — Database management tool used to interact with PostgreSQL.
- [Postman](https://www.postman.com/downloads/) — For testing API endpoints and HTTP requests.
- [JUnit 5](https://junit.org/junit5/) — Used for writing and running unit tests.
---
## 🛠️ Project Configuration
All projects were created using the following setup:
- **Project Type:** Maven
- **Programming Language:** Java 17
- **Spring Boot Version:** 3.5.0
- **Packaging:** `.jar`
---
## 🧾 Prerequisites
To run and develop this project, the following tools and environments are required:
- **Java** (version 17)
- **Spring Tools for Eclipse** (version 4.30)
- **PostgreSQL** (version 14)
- **DBeaver** (version 25.0.5)
- **Postman**
- **JUnit 5**
---
## ⚙️ Installations
Before getting started, ensure that the following tools are installed:
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) — Required to compile and run the project.
- [Spring Tools for Eclipse 4.30](https://spring.io/tools) — IDE used for developing and managing Spring Boot projects.
- [PostgreSQL 14](https://www.postgresql.org/download/) — The relational database used in this project.
- [DBeaver 25.0.5](https://dbeaver.io/download/) — Database management tool used to interact with PostgreSQL.
- [Postman](https://www.postman.com/downloads/) — For testing API endpoints and HTTP requests.
- [JUnit 5](https://junit.org/junit5/) — Used for writing and running unit tests.
---
## 🛠️ Project Configuration
All projects were created using the following setup:
- **Project Type:** Maven
- **Programming Language:** Java 17
- **Spring Boot Version:** 3.5.0
- **Packaging:** `.jar`---
