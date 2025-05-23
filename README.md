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
- (Optional) **Git**

---

✅ 2. Clone the Repository

git clone https://github.com/your-username/playwright-java-tests.git
cd playwright-java-tests

---

✅ 3. Build the Project
Use Maven to install dependencies:

mvn clean install

---

✅ 4. Install Playwright Browsers
Playwright uses browser binaries that must be installed once:

mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"

---

✅ 5. Run the Tests
To run all tests:

mvn test
