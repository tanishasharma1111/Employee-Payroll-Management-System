package com.payroll.repository;

import com.payroll.model.Employee;
import com.payroll.model.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long> {
    
    List<Salary> findByEmployee(Employee employee);
    
    List<Salary> findByEmployeeId(Long employeeId);
    
    List<Salary> findByPaymentDateBetween(LocalDate startDate, LocalDate endDate);
    
    List<Salary> findByPaymentPeriod(String paymentPeriod);
    
    List<Salary> findByPaymentStatus(String paymentStatus);
} 
