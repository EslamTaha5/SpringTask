package com.example.SpringTask.Employee;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class EmployeeRepository {
    HashMap<Integer, Employee> employees = new HashMap<>();

    public void add(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public void remove(Integer id) {
        employees.remove(id);
    }

    public HashMap<Integer, Employee> findAll() {
        return employees;
    }
}
