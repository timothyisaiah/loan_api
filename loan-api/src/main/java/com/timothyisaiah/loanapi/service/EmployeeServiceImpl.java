package com.timothyisaiah.loanapi.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timothyisaiah.loanapi.models.Employee;
import com.timothyisaiah.loanapi.repository.EmployeeRepository;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

		@Autowired
	    private final EmployeeRepository employeeRepository;
	    
	    public EmployeeServiceImpl (EmployeeRepository employeeRepository){
	        this.employeeRepository = employeeRepository;
	    }
	    public void saveEmployee(Employee employee){
	    	employeeRepository.save(employee);
	    }
}
