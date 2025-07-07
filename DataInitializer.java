package com.payroll.config;

import com.payroll.model.Employee;
import com.payroll.model.Salary;
import com.payroll.repository.EmployeeRepository;
import com.payroll.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;
    private final SalaryRepository salaryRepository;

    @Autowired
    public DataInitializer(EmployeeRepository employeeRepository, SalaryRepository salaryRepository) {
        this.employeeRepository = employeeRepository;
        this.salaryRepository = salaryRepository;
    }

    @Override
    public void run(String... args) {
        // Create sample employees
        Employee john = new Employee(
                null,
                "John",
                "Doe",
                "john.doe@example.com",
                "9876543210",
                LocalDate.of(2022, 1, 15),
                "Software Developer",
                "IT",
                new BigDecimal("5000.00"),
                new BigDecimal("15.00"),
                new BigDecimal("500.00"),
                new BigDecimal("200.00")
        );

        Employee jane = new Employee(
                null,
                "Jane",
                "Smith",
                "jane.smith@example.com",
                "8765432109",
                LocalDate.of(2022, 3, 10),
                "HR Manager",
                "HR",
                new BigDecimal("6000.00"),
                new BigDecimal("18.00"),
                new BigDecimal("800.00"),
                new BigDecimal("300.00")
        );

        Employee robert = new Employee(
                null,
                "Robert",
                "Johnson",
                "robert.johnson@example.com",
                "7654321098",
                LocalDate.of(2021, 11, 5),
                "Financial Analyst",
                "Finance",
                new BigDecimal("5500.00"),
                new BigDecimal("17.00"),
                new BigDecimal("600.00"),
                new BigDecimal("250.00")
        );

        Employee sarah = new Employee(
                null,
                "Sarah",
                "Williams",
                "sarah.williams@example.com",
                "6543210987",
                LocalDate.of(2023, 1, 20),
                "Marketing Specialist",
                "Marketing",
                new BigDecimal("4800.00"),
                new BigDecimal("14.00"),
                new BigDecimal("450.00"),
                new BigDecimal("180.00")
        );

        Employee michael = new Employee(
                null,
                "Michael",
                "Brown",
                "michael.brown@example.com",
                "5432109876",
                LocalDate.of(2022, 6, 12),
                "Sales Representative",
                "Sales",
                new BigDecimal("4500.00"),
                new BigDecimal("13.00"),
                new BigDecimal("1200.00"),
                new BigDecimal("150.00")
        );

        // Save employees
        List<Employee> employees = Arrays.asList(john, jane, robert, sarah, michael);
        employeeRepository.saveAll(employees);

        // Create sample salaries
        Salary johnMay = new Salary(
                null,
                john,
                LocalDate.of(2023, 5, 28),
                "May 2023",
                new BigDecimal("5000.00"),
                10,
                new BigDecimal("25.00"),
                new BigDecimal("500.00"),
                new BigDecimal("200.00"),
                new BigDecimal("750.00"),
                new BigDecimal("4800.00"),
                "PAID",
                "Bank Transfer",
                "Regular monthly salary"
        );

        Salary johnJune = new Salary(
                null,
                john,
                LocalDate.of(2023, 6, 28),
                "June 2023",
                new BigDecimal("5000.00"),
                15,
                new BigDecimal("25.00"),
                new BigDecimal("500.00"),
                new BigDecimal("200.00"),
                new BigDecimal("750.00"),
                new BigDecimal("4925.00"),
                "PAID",
                "Bank Transfer",
                "Includes overtime payment"
        );

        Salary janeMay = new Salary(
                null,
                jane,
                LocalDate.of(2023, 5, 28),
                "May 2023",
                new BigDecimal("6000.00"),
                0,
                new BigDecimal("30.00"),
                new BigDecimal("800.00"),
                new BigDecimal("300.00"),
                new BigDecimal("1080.00"),
                new BigDecimal("5420.00"),
                "PAID",
                "Bank Transfer",
                "Regular monthly salary"
        );

        Salary janeJune = new Salary(
                null,
                jane,
                LocalDate.of(2023, 6, 28),
                "June 2023",
                new BigDecimal("6000.00"),
                5,
                new BigDecimal("30.00"),
                new BigDecimal("800.00"),
                new BigDecimal("300.00"),
                new BigDecimal("1080.00"),
                new BigDecimal("5570.00"),
                "PENDING",
                "Bank Transfer",
                "Includes performance bonus"
        );

        Salary robertMay = new Salary(
                null,
                robert,
                LocalDate.of(2023, 5, 28),
                "May 2023",
                new BigDecimal("5500.00"),
                0,
                new BigDecimal("27.50"),
                new BigDecimal("600.00"),
                new BigDecimal("250.00"),
                new BigDecimal("935.00"),
                new BigDecimal("4915.00"),
                "PAID",
                "Bank Transfer",
                "Regular monthly salary"
        );

        Salary robertJune = new Salary(
                null,
                robert,
                LocalDate.of(2023, 6, 28),
                "June 2023",
                new BigDecimal("5500.00"),
                8,
                new BigDecimal("27.50"),
                new BigDecimal("600.00"),
                new BigDecimal("250.00"),
                new BigDecimal("935.00"),
                new BigDecimal("5135.00"),
                "PENDING",
                "Bank Transfer",
                "Includes project completion bonus"
        );

        // Save salaries
        List<Salary> salaries = Arrays.asList(johnMay, johnJune, janeMay, janeJune, robertMay, robertJune);
        salaryRepository.saveAll(salaries);
    }
} 
