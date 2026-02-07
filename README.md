# Item REST API – Spring Boot Project

## 📌 Project Overview

This project is a simple RESTful API built using Spring Boot to manage a collection of items (similar to an e-commerce product system).

The API allows users to:

* Add a new item
* Retrieve an item by ID
* Validate input fields before storing data

The project demonstrates backend fundamentals including REST APIs, validation, service layer logic, and in-memory data handling.

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Jakarta Validation
* Maven
* Swagger (API Testing)

---

## 📦 Features Implemented

### 1. Add Item

**POST** `/items`

Adds a new item to the system.

Required Fields:

* name (Not Blank)
* description (Not Blank)
* price (Positive value)

---

### 2. Get Item by ID

**GET** `/items/{id}`

Fetches item details by its ID.

If item is not found, a proper exception message is returned.

---

## 🧠 Implementation Details

* Data is stored using an in-memory ArrayList.
* IDs are auto-generated using an internal counter.
* Input validation is handled using `@NotBlank`, `@NotNull`, and `@Positive`.
* Clean layered architecture:

  * Controller
  * Service
  * Model

---

## 🚀 How to Run the Application

1. Clone the repository
2. Open in IntelliJ / STS
3. Run `ItemapiApplication.java`
4. Access API at:
   [http://localhost:8080](http://localhost:8080)

---

## 📬 Author

Pallavi Kattimani
Java Backend Developer (Fresher)
