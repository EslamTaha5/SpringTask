package com.example.SpringTask;

import com.example.SpringTask.Employee.EmployeeRepository;
import com.example.SpringTask.Employee.EmployeeService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTaskApplication {


    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext("com.example.SpringTask");
        EmployeeService employeeService = ctx.getBean(EmployeeService.class);
        employeeService.addEmployee("Eslam", 1, 20, 100000);
        employeeService.addEmployee("Ahmed", 2, 25, 100000);
        employeeService.addEmployee("Mohamed", 3, 25, 100000);
        employeeService.listEmployees();
        employeeService.deleteEmployee(3);
        employeeService.listEmployees();
        ctx.close();
    }


}
