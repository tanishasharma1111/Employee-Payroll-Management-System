# Employee-Payroll-Management-System
This system is designed to manage payroll operations for both full-time and part-time employees within an organization. It simplifies the process of adding, removing, and maintaining employee records, while automatically calculating salaries based on employment type and specific parameters such as fixed monthly salary or hourly wages. 
# Employee Payroll System

A comprehensive Java-based web application for managing employee payroll, built with Spring Boot, Spring Data JPA, Thymeleaf, and Bootstrap.

## Features

- **Employee Management**
  - Add, edit, view, and delete employee records
  - Search employees by last name
  - View employee details and salary history

- **Payroll Management**
  - Create and manage salary records for employees
  - Calculate net salary based on basic salary, allowances, deductions, and tax
  - Search salary records by payment period or date range
  - View detailed salary information and calculations

- **Dashboard**
  - Overview of employees and salary records
  - Quick access to key functions
  - Recent employees and salary records

## Technologies Used

- **Backend**
  - Java 11
  - Spring Boot 2.7.9
  - Spring Data JPA
  - Spring MVC
  - H2 Database (for development)
  - Lombok

- **Frontend**
  - Thymeleaf template engine
  - Bootstrap 5
  - HTML5, CSS3, JavaScript
  - Font Awesome icons

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/payroll-system.git
   cd payroll-system
   ```

2. Build and run the project using the provided PowerShell script:
   ```
   powershell -ExecutionPolicy Bypass -File run.ps1
   ```
   This script will:
   - Look for a Java 11 installation on your system
   - Set the necessary environment variables
   - Download Maven if needed
   - Build and run the application

   Alternatively, if you have Maven installed, you can run:
   ```
   mvn spring-boot:run
   ```

3. Access the application:
   Open your browser and navigate to `http://localhost:8080`

### Database

The application uses an H2 in-memory database by default. You can access the H2 console at `http://localhost:8080/h2-console` with the following credentials:
- JDBC URL: `jdbc:h2:mem:payrolldb`
- Username: `sa`
- Password: `password`

## Project Structure

```
payroll-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── payroll/
│   │   │           ├── controller/
│   │   │           ├── model/
│   │   │           ├── repository/
│   │   │           ├── service/
│   │   │           └── PayrollApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   └── js/
│   │       ├── templates/
│   │       │   ├── employees/
│   │       │   ├── salaries/
│   │       │   ├── index.html
│   │       │   └── layout.html
│   │       └── application.properties
│   └── test/
└── pom.xml
```

## Future Enhancements

- User authentication and role-based access control
- Export payroll data to PDF or Excel
- Email notifications for salary payments
- Integration with external payment systems
- Advanced reporting and analytics
- Department management
- Leave management integration

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- Spring Boot team for the excellent framework
- Bootstrap team for the responsive UI components
- All open-source contributors whose libraries were used in this project 
