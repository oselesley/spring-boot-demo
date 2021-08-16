package com.example.employeeservice.services;

import org.springframework.stereotype.Component;


@Component
public class AttendanceService {
    private EmployeeService employeeService;

    public AttendanceService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
