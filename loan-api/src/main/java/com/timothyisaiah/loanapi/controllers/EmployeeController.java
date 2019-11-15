package com.timothyisaiah.loanapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timothyisaiah.loanapi.models.Employee;
import com.timothyisaiah.loanapi.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

    
    @Autowired
    private EmployeeServiceImpl employeeService;
	
	
    @GetMapping("/saveEmployee")
    public String saveEmployee(@RequestParam String firstname,@RequestParam String lastname,@RequestParam String username,@RequestParam String password,@RequestParam String role) {
        
        Employee employee = new Employee(firstname,lastname,username,password,role);
        
        employeeService.saveEmployee(employee);
        return "Employee <h2>" +username+ "</h2> saved successfully";
    }
	
	
}
