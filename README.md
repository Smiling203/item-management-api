Item Management REST API
A simple Spring Boot REST API for managing items.
This project demonstrates backend development skills including RESTful API design, input validation, exception handling, and layered architecture.

Project Overview
This application allows users to:

Add new items

Retrieve all items

Retrieve item by ID

Handle validation errors properly

Handle resource not found exceptions

The data is stored in memory using a list (no database connected).

Tech Stack
Java 17+

Spring Boot

Spring Web

Jakarta Validation

Maven

Embedded Tomcat Server

Project Structure
item-management-api
│
├── src/main/java/com/example/itemapi
│   ├── controller
│   │     └── ItemController.java
│   ├── service
│   │     └── ItemService.java
│   ├── model
│   │     └── Item.java
│   ├── exception
│   │     ├── ResourceNotFoundException.java
│   │     └── GlobalExceptionHandler.java
│   └── ItemapiApplication.java
│
├── src/main/resources
│   └── application.properties
│
└── pom.xml
API Endpoints
1. Add Item
POST /api/items

Request Body:

{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000
}
Response:

{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000
}
2. Get Item By ID
GET /api/items/{id}

Example:

GET http://localhost:8080/api/items/1
Response:

{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000
}
If item is not found, a proper error response is returned.

3. Get All Items
GET /api/items

Response:

[
  {
    "id": 1,
    "name": "Laptop",
    "description": "Gaming Laptop",
    "price": 75000
  }
]
Validation Rules
Name must not be blank

Description must not be blank

Price must not be null

Price must be greater than 0

Validation errors return structured error responses using GlobalExceptionHandler.

How to Run the Application
Clone the repository:

git clone https://github.com/your-username/item-management-api.git
Navigate into the project folder:

cd item-management-api
Run the application:

Using Maven:

mvn spring-boot:run
Or run ItemapiApplication.java from your IDE.

Access the API
Once the application starts:

Base URL:

http://localhost:8080
API Base Path:

http://localhost:8080/api/items
You can test using:

Postman

Browser (for GET requests)

Implementation Details
Layered Architecture (Controller → Service → Model → Exception)

In-memory data storage using List

Auto-generated ID using counter

RESTful API standards followed

Clean code structure for scalability

Future Enhancements
Add update and delete operations

Connect to MySQL database

Add pagination

Implement JWT authentication

Deploy to cloud platform

Author
Pallavi Kattimani
Java Backend Developer
