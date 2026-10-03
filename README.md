# Console Calculator App


**Console Calculator App** - Console-based calculator built with Java 17, Maven 3.9.6 and JUnit as a learning project to practice Layered Architecture and SOLID principles, with 44 unit tests covering every class.

---


## About the project

Console Calculator is a console-based application built with Java 17, Maven 3.9.6, and JUnit as a learning project to practice Layered Architecture and SOLID principles.

- What does the app do first when it starts? (e.g., prompts the user to enter the first number)
- What happens next? (e.g., prompts for the second number)
- What happens on invalid input? (e.g., shows a validation error if the input is not a number or not one of the allowed symbols)

---


## Features

| Function | Description |
|----------|-------------|
| Add numbers | Prompts the user to enter two numbers, adds them together, and displays the result. |
| Enter numbers | Prompts the user to input the first number and then the second number. |
| Choose operation | Prompts the user to select one of the four operations (+, -, *, /). |
| Continue prompt | After showing the result, asks the user whether they want to continue (yes/no). |

---


## Project objective

The main objective of this project is to gain hands-on experience in designing and building a Java application using Layered Architecture and SOLID principles.

- Practice Layered Architecture by separating the application into controller, service, model, exception, util, and common layers.
- Apply SOLID principles in a real codebase, including Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, and Dependency Inversion.
- Improve Java 17 skills by using modern language features such as records, switch expressions, and sealed classes where appropriate.
- Learn to handle invalid user input gracefully using custom exceptions and a dedicated validation layer.

---


## Technologies

| Technology | Version | Objective |
|------------|---------|-----------|
| Java  |  17  |  main programming language |
| Maven  |  3.9.6  |  project build and dependency management |
| JUnit  |  5  |  unit testing of all classes |

---


## Installation and Execution

### Windows
```cmd
 git clone https://github.com/masharipov2105/console-calculator-app.git

 cd console-calculator-app

 mvn clean package

 java -jar target/simple-java-project-1.0-SNAPSHOT.jar

```
---


### Linux/Mac
```bash
 git clone https://github.com/masharipov2105/console-calculator-app.git

 cd console-calculator-app

 mvn clean package

 java -jar target/simple-java-project-1.0-SNAPSHOT.jar

```
---


## Project view

![Home](https://raw.githubusercontent.com/masharipov2105/console-calculator-app/refs/heads/main/screenshots/c1.png)
![Home](https://raw.githubusercontent.com/masharipov2105/console-calculator-app/refs/heads/main/screenshots/c2.png)

---


## Project Structure

```cmd
console-calculator-app/
├── screenshots/
│   ├── c1.png
│   └── c2.png
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── masharipov2105/
│   │   │           └── systems/
│   │   │               ├── exceptions/
│   │   │               │   ├── CalculatorException.java
│   │   │               │   ├── DivisionByZeroException.java
│   │   │               │   ├── InvalidCommandException.java
│   │   │               │   └── InvalidNumberException.java
│   │   │               ├── models/
│   │   │               │   └── CalculatorModel.java
│   │   │               ├── service/
│   │   │               │   ├── CalculatorService.java
│   │   │               │   └── CalculatorServiceImpl.java
│   │   │               ├── utils/
│   │   │               │   └── InputValidator.java
│   │   │               ├── App.java
│   │   │               └── Main.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── masharipov2105/
│                   └── systems/
│                       ├── exceptions/
│                       │   ├── CalculatorExceptionTest.java
│                       │   ├── DivisionByZeroExceptionTest.java
│                       │   ├── InvalidCommandExceptionTest.java
│                       │   └── InvalidNumberExceptionTest.java
│                       ├── models/
│                       │   └── CalculatorModelTest.java
│                       ├── service/
│                       │   └── CalculatorServiceImplTest.java
│                       ├── utils/
│                       │   └── InputValidatorTest.java
│                       └── MainTest.java
├── target/
│   ├── classes/
│   │   ├── com/
│   │   │   └── masharipov2105/
│   │   │       └── systems/
│   │   │           ├── exceptions/
│   │   │           │   ├── CalculatorException.class
│   │   │           │   ├── DivisionByZeroException.class
│   │   │           │   ├── InvalidCommandException.class
│   │   │           │   └── InvalidNumberException.class
│   │   │           ├── models/
│   │   │           │   └── CalculatorModel.class
│   │   │           ├── service/
│   │   │           │   ├── CalculatorService.class
│   │   │           │   └── CalculatorServiceImpl.class
│   │   │           ├── utils/
│   │   │           │   └── InputValidator.class
│   │   │           ├── App.class
│   │   │           └── Main.class
│   │   └── application.properties
│   ├── generated-sources/
│   │   └── annotations/
│   ├── generated-test-sources/
│   │   └── test-annotations/
│   ├── maven-archiver/
│   │   └── pom.properties
│   ├── maven-status/
│   │   └── maven-compiler-plugin/
│   │       ├── compile/
│   │       │   └── default-compile/
│   │       │       ├── createdFiles.lst
│   │       │       └── inputFiles.lst
│   │       └── testCompile/
│   │           └── default-testCompile/
│   │               ├── createdFiles.lst
│   │               └── inputFiles.lst
│   ├── surefire-reports/
│   │   ├── com.masharipov2105.systems.exceptions.CalculatorExceptionTest.txt
│   │   ├── com.masharipov2105.systems.exceptions.DivisionByZeroExceptionTest.txt
│   │   ├── com.masharipov2105.systems.exceptions.InvalidCommandExceptionTest.txt
│   │   ├── com.masharipov2105.systems.exceptions.InvalidNumberExceptionTest.txt
│   │   ├── com.masharipov2105.systems.MainTest.txt
│   │   ├── com.masharipov2105.systems.models.CalculatorModelTest.txt
│   │   ├── com.masharipov2105.systems.service.CalculatorServiceImplTest.txt
│   │   ├── com.masharipov2105.systems.utils.InputValidatorTest.txt
│   │   ├── TEST-com.masharipov2105.systems.exceptions.CalculatorExceptionTest.xml
│   │   ├── TEST-com.masharipov2105.systems.exceptions.DivisionByZeroExceptionTest.xml
│   │   ├── TEST-com.masharipov2105.systems.exceptions.InvalidCommandExceptionTest.xml
│   │   ├── TEST-com.masharipov2105.systems.exceptions.InvalidNumberExceptionTest.xml
│   │   ├── TEST-com.masharipov2105.systems.MainTest.xml
│   │   ├── TEST-com.masharipov2105.systems.models.CalculatorModelTest.xml
│   │   ├── TEST-com.masharipov2105.systems.service.CalculatorServiceImplTest.xml
│   │   └── TEST-com.masharipov2105.systems.utils.InputValidatorTest.xml
│   ├── test-classes/
│   │   └── com/
│   │       └── masharipov2105/
│   │           └── systems/
│   │               ├── exceptions/
│   │               │   ├── CalculatorExceptionTest.class
│   │               │   ├── DivisionByZeroExceptionTest.class
│   │               │   ├── InvalidCommandExceptionTest.class
│   │               │   └── InvalidNumberExceptionTest.class
│   │               ├── models/
│   │               │   └── CalculatorModelTest.class
│   │               ├── service/
│   │               │   └── CalculatorServiceImplTest.class
│   │               ├── utils/
│   │               │   └── InputValidatorTest.class
│   │               └── MainTest.class
│   └── simple-java-project-1.0-SNAPSHOT.jar
├── pom.xml
└── README.md
```
---


## License

This project is open source and released under the MIT License.

---


## Author

- Github : [masharipov2105](https://github.com/masharipov2105)

- Telegram : [masharipov2105](https://t.me/masharipov2105)

- Gmail : masharipov2105@gmail.com


