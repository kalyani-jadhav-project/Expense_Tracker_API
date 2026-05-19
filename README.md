# Expense Tracker REST API

A simple Expense Tracker REST API built using Java and Spring Boot.

## Features

* Add new expenses
* View all expenses
* Calculate total expenses
* Filter expenses by category
* Delete expenses

## Technologies Used

* Java
* Spring Boot
* REST API
* Maven
* Eclipse IDE

## API Endpoints

### Add Expense

POST /expenses

### Get All Expenses

GET /expenses

### Get Total Expense

GET /expenses/total

### Get Expenses By Category

GET /expenses/category/{category}

### Delete Expense

DELETE /expenses/{id}

## Example Categories

* Food
* Travel
* Shopping

## Sample JSON

```json
{
  "id": 1,
  "title": "Pizza",
  "category": "Food",
  "amount": 500
}
```

## How To Run

1. Clone the repository
2. Open project in Eclipse
3. Run as Spring Boot App
4. Test APIs using Postman

## Author

Kalyani Jadhav
