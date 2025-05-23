# BitcubeAssessment

This repository contains automated UI tests using **Playwright with Java** and **TestNG**, structured using the **Page Object Model (POM)**.  
It tests the [Factorial Calculator Web App](https://qainterview.pythonanywhere.com/).

---

## 🚀 Features

- ✅ Tests structured using Page Object Model (POM)
- 🧪 TestNG for assertions and test management
- 📡 Supports API request assertions via Playwright’s network inspection
  
---

## 🔧 Prerequisites

Make sure you have the following installed:

- **Java 11 or newer**
- **Maven 3.6+**

---

## Project Structure

- src
- ├── test
- │   └── java
- │       ├── pages
- │       │   └── FactorialHomePage.java   # Page Object class
- │       └── tests
- │           └── FactorialTests.java      # TestNG test cases
- pom.xml                                  # Maven configuration
- README.md                                # Project documentation

---

1. Clone the Repository

git clone (https://github.com/AbdulAbrahams/BitcubeAssessment.git)

---

2. Build the Project
Use Maven to install dependencies:

mvn clean install

---

3. Install Playwright Browsers
Playwright uses browser binaries that must be installed once:

mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"

---

4. Run the Tests
