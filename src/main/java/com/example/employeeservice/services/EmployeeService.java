package com.example.employeeservice.services;

import com.example.employeeservice.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    void createEmployee(Employee employee);

    List<Employee> fetchAllEmployees();
}
