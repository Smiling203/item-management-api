🛒 Item Management REST API
A simple Spring Boot REST API for managing items.

This project demonstrates backend development skills including:

RESTful API design

Input validation

Global exception handling

Layered architecture implementation

📌 Project Overview
This application allows users to:

✅ Add new items

✅ Retrieve all items

✅ Retrieve item by ID

✅ Handle validation errors properly

✅ Handle resource not found exceptions

⚠️ Note: Data is stored in memory using a List. No database is connected.

🛠 Tech Stack
Java 17+

Spring Boot

Spring Web

Jakarta Validation

Maven

Embedded Tomcat Server

📁 Project Structure
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
🚀 API Endpoints
1️⃣ Add Item
POST /api/items

Request Body
{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000
}
Response
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000
}
2️⃣ Get Item By ID
GET /api/items/{id}

Example
GET http://localhost:8080/api/items/1
Response
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000
}
If the item is not found, a proper error response is returned.

3️⃣ Get All Items
GET /api/items

Response
[
  {
    "id": 1,
    "name": "Laptop",
    "description": "Gaming Laptop",
    "price": 75000
  }
]
✅ Validation Rules
Name must not be blank

Description must not be blank

Price must not be null

Price must be greater than 0

Validation errors are handled using GlobalExceptionHandler and return structured error responses.

▶️ How to Run the Application
1️⃣ Clone the Repository
git clone https://github.com/your-username/item-management-api.git
2️⃣ Navigate to the Project Folder
cd item-management-api
3️⃣ Run the Application
Using Maven:

mvn spring-boot:run
Or run ItemapiApplication.java directly from your IDE.

🌐 Access the API
Once the application starts:

Base URL

http://localhost:8080
API Base Path

http://localhost:8080/api/items
You can test the APIs using:

Postman

Browser (for GET requests)

🧠 Implementation Details
Layered Architecture (Controller → Service → Model → Exception)

In-memory data storage using List

Auto-generated ID using counter logic

RESTful API design principles followed

Clean and scalable code structure

🔮 Future Enhancements
Add update and delete operations

Connect to MySQL database

Add pagination

Implement JWT authentication

Deploy to cloud platform

👩‍💻 Author
Pallavi Kattimani
Java Backend Developer

