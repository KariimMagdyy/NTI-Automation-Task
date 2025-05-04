# NTI Automation Task

This project is part of the National Telecommunication Institute (NTI) Automation Task, focusing on automating tasks using Java. It leverages Maven for project management and follows standard Java project structures.

## Table of Contents

* [Project Overview](#project-overview)
* [Technologies Used](#technologies-used)
* [Getting Started](#getting-started)

    * [Prerequisites](#prerequisites)
    * [Installation](#installation)
    * [Running the Application](#running-the-application)
* [Project Structure](#project-structure)
* [Contributing](#contributing)
* [License](#license)

## Project Overview

The NTI Automation Task project aims to automate specific tasks using Java. The project is structured using Maven, which simplifies dependency management and project building. The `src` directory contains the main application code, adhering to standard Java conventions.

## Technologies Used

* **Java**: Programming language used for development.
* **Maven**: Build automation tool used for project management.
* **JUnit** (if applicable): Framework for unit testing Java applications.

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

* **Java Development Kit (JDK)**: Version 8 or higher.
* **Maven**: For building and managing the project.

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/KariimMagdyy/NTI-Automation-Task.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd NTI-Automation-Task
   ```

3. **Build the project using Maven:**

   ```bash
   mvn clean install
   ```

### Running the Application

After building the project, you can run the application using the following command:

```bash
mvn exec:java -Dexec.mainClass="com.yourpackage.MainClass"
```

*Note: Replace `com.yourpackage.MainClass` with the actual fully qualified name of your main class.*

## Project Structure

```
NTI-Automation-Task/
├── .idea/                 # IntelliJ IDEA project files
├── src/                   # Source code directory
│   └── main/
│       └── java/
│           └── com/
│               └── yourpackage/
│                   └── MainClass.java
├── pom.xml                # Maven project file
└── README.md              # Project documentation
```


## License

This project is licensed under the [MIT License](LICENSE).
