package com.timothyisaiah.loanapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timothyisaiah.loanapi.models.Employee;
import com.timothyisaiah.loanapi.models.Loans;
import com.timothyisaiah.loanapi.repository.EmployeeRepository;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

		@Autowired
	    private final EmployeeRepository employeeRepository;
	    
	    public EmployeeServiceImpl (EmployeeRepository employeeRepository){
	        this.employeeRepository = employeeRepository;
	    }
	    public Employee saveEmployee(Employee employee){
	    	return employeeRepository.save(employee);
	    }
	    
		public void deleteLoanById(Integer employeeid) {
			employeeRepository.deleteById(employeeid);
		}
		public void deleteLoan(Employee employee) {
			employeeRepository.delete(employee);
		}
		public void updateLoan(Employee employee) {
			employeeRepository.save(employee);
		}
		public void fetchEmployee(Integer employeeid) {
			employeeRepository.findById(employeeid);
		}
		public List<Employee> fetchAllEmployees() {
			List<Employee> allEmployees = (List<Employee>) employeeRepository.findAll();
			
			return allEmployees;
		}
}
