# Spring XML Configuration

This repository demonstrates **Spring Framework configuration using XML**, which is one of the **three core ways** to configure Spring applications.

This project focuses on understanding **Spring Core fundamentals**, especially **Dependency Injection (DI)** using XML configuration.  
It serves as a strong foundation before moving to **Annotation-based configuration** and **Java-based configuration**.

---

## 📌 Why XML Configuration?

XML-based configuration is considered a **legacy but fundamental approach** in Spring.  
Understanding it helps in:
- Maintaining legacy Spring applications
- Gaining clarity on how Spring internally manages beans
- Understanding Dependency Injection at a low level
- Transitioning smoothly to annotations and Spring Boot

---

## 🧠 Concepts Covered

### 🔹 Spring Core
- Inversion of Control (IoC)
- Dependency Injection (DI)
- Bean lifecycle
- ApplicationContext

---

### 🔹 Bean Configuration using XML
- Defining beans in `beans.xml`
- Bean creation and management by Spring container
- Understanding default bean scope (Singleton)
- Prototype bean scope

---

## 🔗 Dependency Injection Techniques Used

### 1️⃣ Constructor Injection
- Injecting primitive values using `<constructor-arg>`
- Injecting object references using `ref`
- Using constructor argument indexing

### 2️⃣ Setter Injection
- Injecting values using `<property>`
- Injecting object references between beans
- Understanding when setter injection is preferred

---

## 🧩 Object Reference Injection

This project demonstrates **injecting one bean into another**, for example:
- Injecting a `Laptop` object into an `Alien` class
- Managing dependencies via Spring container instead of manual object creation

---

## 📂 Project Structure
SpringXmlConfiguration/
│
├── src/
│ ├── main/
│ │ ├── java/com/karthik/demo/
│ │ │ ├── Alien.java
│ │ │ ├── Laptop.java
│ │ │ └── DemoApplication.java
│ │ │
│ │ └── resources/
│ │ └── beans.xml
│
├── pom.xml
├── README.md


---

## 🛠️ Technologies Used

- Java
- Spring Framework (Core)
- XML Configuration
- Maven
- VS Code

---

## ⚙️ How the Application Works

1. Spring container is initialized using `ClassPathXmlApplicationContext`
2. Beans are defined inside `beans.xml`
3. Dependencies are injected using:
   - Constructor injection
   - Setter injection
4. Spring manages object creation and lifecycle
5. Beans are retrieved using `getBean()` method

---

## 🚀 Sample Code Flow

```java
ApplicationContext context =
    new ClassPathXmlApplicationContext("beans.xml");

Alien alien = context.getBean("alien", Alien.class);
alien.code();


