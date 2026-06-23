package com.example.employee_management_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee_management_api.model.Employee;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee(1, "Senthur", "DevOps", 500000));
        employees.add(new Employee(2, "John", "Testing", 400000));
        employees.add(new Employee(3, "Miguel", "Sales", 250000));
        employees.add(new Employee(4, "Wang", "Marketing", 300000));
        employees.add(new Employee(5, "Shabib", "HR", 325000));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}