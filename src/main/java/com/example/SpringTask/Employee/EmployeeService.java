package com.example.SpringTask.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee(String name, int id, int age, int salary) {
        Employee employee = new Employee(name, id, age, salary);
        employeeRepository.add(employee);
        System.out.printf("Employee %s has been added to the repository\n", employee.getName());

    }

    public void deleteEmployee(Integer id) {
        employeeRepository.remove(id);
        System.out.printf("Employee %s has been deleted from the repository\n", id);
    }

    public void listEmployees() {
        System.out.println("** Employee List **");
        var employees = employeeRepository.findAll();
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }
}

