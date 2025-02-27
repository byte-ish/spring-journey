# Payment Processing System using Sealed Classes in Java & Spring Boot

## 📌 Overview
This project demonstrates the use of **Sealed Classes** in Java 21 with **Spring Boot 3.5.0** to create a **Payment Processing System**. The system allows users to process payments via **Credit Card, PayPal, or Bank Transfer**, enforcing a strict hierarchy and ensuring type safety.

## 🚀 Features
- **Sealed Classes** to define a **restricted inheritance hierarchy**.
- **Pattern Matching with Switch Expressions** for clean and efficient processing.
- **Spring Boot REST API** for handling payment requests.
- **Unit Testing** using JUnit 5.
- **Jackson Serialization** to handle JSON requests for sealed classes.

## 🛠️ Tech Stack
- **Java 21**
- **Spring Boot 3.5.0**
- **Maven**
- **Jackson** (for JSON serialization)
- **JUnit 5** (for testing)
- **Lombok** (to reduce boilerplate code)

---

## 📂 Project Structure
```
├── src/main/java/com/example/payment
│   ├── controller
│   │   ├── PaymentController.java
│   ├── model
│   │   ├── Payment.java (Sealed Interface)
│   │   ├── CreditCard.java (Final Class)
│   │   ├── PayPal.java (Final Class)
│   │   ├── BankTransfer.java (Final Class)
│   ├── service
│   │   ├── PaymentService.java
│   ├── Application.java
├── src/test/java/com/example/payment
│   ├── service
│   │   ├── PaymentServiceTest.java
└── pom.xml
```

---

## ⚙️ Installation & Setup
### **Prerequisites**
- **Java 21** (Ensure Java 21 is installed)
- **Maven** (Build tool for Java projects)
- **Spring Boot**

### **Clone the Repository**
```sh
git clone https://github.com/your-repo/payment-system.git
cd payment-system
```

### **Build & Run the Application**
```sh
mvn spring-boot:run
```

---

## 📡 API Endpoints
### **🔹 Process Payment**
**Endpoint:** `POST /api/payment/process`

#### **1️⃣ Credit Card Payment**
**Request Body:**
```json
{
  "type": "CREDIT_CARD",
  "cardNumber": "1234-5678-9012-3456",
  "amount": 250.0
}
```
**Response:**
```json
"✅ Processing Credit Card Payment of $250.0"
```

#### **2️⃣ PayPal Payment**
**Request Body:**
```json
{
  "type": "PAYPAL",
  "email": "user@example.com",
  "amount": 100.0
}
```
**Response:**
```json
"✅ Processing PayPal Payment of $100.0"
```

#### **3️⃣ Bank Transfer Payment**
**Request Body:**
```json
{
  "type": "BANK_TRANSFER",
  "iban": "DE12345678901234567890",
  "amount": 500.0
}
```
**Response:**
```json
"✅ Processing Bank Transfer Payment of $500.0"
```

---

## ✅ Running Unit Tests
To run the tests, execute:
```sh
mvn test
```

Unit test coverage ensures each payment method is handled correctly.

---

## 📖 Key Concepts Used
### **🔹 Sealed Classes Implementation**
```java
public sealed interface Payment permits CreditCard, PayPal, BankTransfer {
    String process();
}
```

### **🔹 Pattern Matching for Processing**
```java
public String processPayment(Payment payment) {
    return switch (payment) {
        case CreditCard c -> "✅ " + c.process();
        case PayPal p -> "✅ " + p.process();
        case BankTransfer b -> "✅ " + b.process();
    };
}
```

### **🔹 Spring Boot REST Controller**
```java
@PostMapping("/process")
public ResponseEntity<String> processPayment(@RequestBody Payment payment) {
    return ResponseEntity.ok(paymentService.processPayment(payment));
}
```

---

## 📌 Next Steps
✅ Extend the project by:
- Adding **Database Integration (JPA + PostgreSQL)**
- Implementing **JWT Authentication** for secured payments
- Integrating **Prometheus + Grafana** for monitoring

Would you like help in implementing these features? 🚀

---

## 📜 License
This project is licensed under the MIT License.

