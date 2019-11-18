package com.timothyisaiah.loanapi.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Employee saveEmployee(@RequestParam String firstname,@RequestParam String lastname,@RequestParam String username,@RequestParam String password,@RequestParam String role) {
        
        Employee employee = new Employee(firstname,lastname,username,password,role);
        
        return employeeService.saveEmployee(employee);
//         "Employee <h2>" +username+ "</h2> saved successfully";
    }
    
    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam Integer employeeid) {
    	
    	employeeService.deleteLoanById(employeeid);
    	return "Emmployee Successfully deleted";
    }
	
	@GetMapping("/fetchEmployeeById")
	public String fetchEmployee(@RequestParam Integer employeeid) {
		employeeService.fetchEmployee(employeeid);
		return "+++++++++++++++++++>>>>>>>>>>>>>>>>>>>>>>";
	}
	@GetMapping("/fetchAllEmployees")
	public  List<Employee> fetchAllEmployees() {
		List<Employee> employees =employeeService.fetchAllEmployees();

		return employees;
	}
}
