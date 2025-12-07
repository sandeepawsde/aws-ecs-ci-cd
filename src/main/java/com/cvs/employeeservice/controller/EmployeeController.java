package com.cvs.employeeservice.controller;

import com.cvs.employeeservice.dto.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final List<Employee> employees = new ArrayList<>();

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    @GetMapping("{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employees.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employees;
    }
}
