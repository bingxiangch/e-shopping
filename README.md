# Online Shop Application

#### A full-stack Online Shop web application using Spring Boot, Hibernate and Angular 7. 

## Features
- REST API
- Docker
- Docker Compose
- JWT authentication
- Cookie based visitors' shopping cart
- Persistent customers' shopping cart
- Cart & order management
- Checkout
- Catalogue
- Order management

## Technology Stacks
**Backend**
  - Java 11
  - Spring Boot
  - Spring Security
  - JWT Authentication
  - Spring Data JPA
  - Hibernate
  - PostgreSQL
  - Maven

## Usage instructions

Start the backend server before the frontend client.  

**Backend**

  1. Install Postgresql
  2. Configure datasource in `application.yml`.
  3. `cd backend`.
  4. Run `mvn install`.
  5. Run `mvn spring-boot:run`.
  6. Spring Boot will import mock data into database by executing `import.sql` automatically.
  7. The backend server is running on localhost:8080.

**Frontend**
  1. Install Node.js and npm
  2. `cd frontend`.
  3. Run `npm install`.
  4. Run `ng serve`
  5. The frontend client is running on localhost:4200.


