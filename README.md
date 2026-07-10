# Spring Boot Blog API

A RESTful Blog API built with **Spring Boot**, **Spring Security**, **JWT Authentication**, and **Postgres**. This project represents my hands-on journey of learning backend development by implementing core Spring Boot concepts through a complete blog management application.

Unlike small isolated examples, this project combines authentication, authorization, database integration, layered architecture, and REST API development into a single application.

---

# Project Overview

This application allows authenticated users to manage blog content through REST APIs while applying modern backend development practices such as layered architecture, DTO mapping, dependency injection, and secure authentication using JSON Web Tokens (JWT).

The primary objective of this project was to gain practical experience with Spring Boot by implementing each component myself while understanding how the different layers of a backend application work together.

---

# Features

* User Registration
* User Authentication using JWT
* Spring Security Configuration
* RESTful API Design
* CRUD Operations for Blog Posts
* MySQL Database Integration
* Spring Data JPA
* DTO-Based Request and Response Mapping
* Exception Handling
* Bean Validation
* Dependency Injection
* Layered Backend Architecture

---

# Technologies Used

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* JWT Authentication
* Maven
* MySQL
* REST APIs

---

# Project Structure

```text
spring-boot-blog-api
│
├── src
│   ├── controller
│   ├── service
│   ├── repository
│   ├── entity
│   ├── dto
│   ├── mapper
│   ├── config
│   ├── security
│   ├── exception
│   └── ...
│
├── pom.xml
├── README.md
├── LICENSE
└── .gitignore
```

---

# Architecture

The application follows a layered architecture.

```text
Client
    │
    ▼
REST Controller
    │
    ▼
Service Layer
    │
    ▼
Repository Layer
    │
    ▼
MySQL Database
```

Each layer has a single responsibility, making the codebase easier to maintain and extend.

---

# Authentication

The application uses **JWT (JSON Web Tokens)** for authentication.

Authentication Flow:

1. User registers.
2. User logs in using valid credentials.
3. The server generates a JWT.
4. The client includes the JWT in future requests.
5. Spring Security validates the token before allowing access to protected endpoints.

---

# API Endpoints

## Authentication

| Method | Endpoint             | Description         |
| ------ | -------------------- | ------------------- |
| POST   | `/api/auth/register` | Register a new user |
| POST   | `/api/auth/login`    | Authenticate a user |

## Blog Posts

| Method | Endpoint          | Description                   |
| ------ | ----------------- | ----------------------------- |
| GET    | `/api/posts`      | Retrieve all blog posts       |
| GET    | `/api/posts/{id}` | Retrieve a specific blog post |
| POST   | `/api/posts`      | Create a new blog post        |
| PUT    | `/api/posts/{id}` | Update an existing blog post  |
| DELETE | `/api/posts/{id}` | Delete a blog post            |

> Update the endpoint paths if they differ in your implementation.

---

# Installation

Clone the repository

```bash
git clone https://github.com/Hifza-155/spring-boot-blog-api.git
```

Navigate to the project directory

```bash
cd spring-boot-blog-api
```

Install dependencies

```bash
mvn clean install
```

Configure the database in `application.properties`.

Run the application

```bash
mvn spring-boot:run
```

---

# Database Configuration

Before running the project, configure your MySQL database inside:

```text
src/main/resources/application.properties
```

Update the following values according to your local database configuration:

* Database URL
* Username
* Password

---

# What I Learned

Through this project I gained practical experience with:

* Spring Boot fundamentals
* Dependency Injection
* Spring Security
* JWT Authentication
* REST API Design
* DTO Mapping
* Spring Data JPA
* Hibernate ORM
* MySQL Integration
* Bean Validation
* Exception Handling
* Layered Application Architecture
* Maven Project Management

---

# Future Improvements

* Role-Based Authorization
* Refresh Tokens
* Swagger/OpenAPI Documentation
* Docker Support
* Unit and Integration Testing
* API Rate Limiting
* CI/CD Pipeline
* Cloud Deployment

---

# Acknowledgement

This project was developed as part of my Spring Boot learning journey. While the application follows concepts taught through structured learning resources, every component—including project configuration, entities, repositories, services, controllers, security configuration, DTOs, and database integration—was implemented by me to gain practical backend development experience.

---

# Author

**Hafsa Usman**

Computer Science Undergraduate

Backend Development • Java • Spring Boot • REST APIs
