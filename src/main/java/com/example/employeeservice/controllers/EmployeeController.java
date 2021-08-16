package com.example.employeeservice.controllers;

import com.example.employeeservice.models.Employee;
import com.example.employeeservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String homePage (Model model) {
        model.addAttribute("employee", new Employee());
        return "home";
    }

    @PostMapping("/employees")
    public String createEmployee(@ModelAttribute("employee") Employee employeeData, Model model) {
        employeeService.createEmployee(employeeData);
        model.addAttribute("employee", new Employee());
        return "home";
    }

    @GetMapping("/employees")
    public String fetchAllEmployees(Model model) {
        List<Employee> employees = employeeService.fetchAllEmployees();
        model.addAttribute("employees", employees);
        return "all_employees";
    }

}
