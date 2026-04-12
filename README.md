#  Book System 

##  Overview

**Book System** is a backend application built using a **microservices architecture** with **Java + Spring Boot**, designed to manage:

(The backend part might not be the only one i still thinking if i should include some frontend tech here.)
- Books
-  Authors
-  Orders (in progress)
-  Payments

What i use in this code from architecture to tech:

- Microservices separation
- Java (Of course XD jaja)
- Spring Boot (thinking to use Quarkus on other project, havent decided yet)
- Docker containerization
- PostgreSQL
- Clean architecture on each services by applying some layers
- I include PGAdmin to manage postgreSQL

I use must of the knowledge i acquire over the years for a clean architecture and
applying several patterns to make the project maintainable.
---

## 🧠 Architecture

The system is divided into independent services:
```declarative
book-system/
│
├── author-service/
├── book-service/
├── order-service/
├── docker-compose.yml
└── README.md

```
Again i might include a "web" or "frontend" directory in the future to develop
the frontend as well (probably will be using reactjs)

### 🧩 Services

| Service            | Responsibility                       |
|--------------------|--------------------------------------|
| 📚 book-service    | Manage books   (WIP)                 |
| 👤 author-service  | Manage authors   (not yet)           |
| 🛒 order-service   | Handle book orders (not yet)         |
| 🛒 payment-service | Handle payment with paypal (not yet) |

PLEASE NOTCE: payment has not been develop or even create package yet.