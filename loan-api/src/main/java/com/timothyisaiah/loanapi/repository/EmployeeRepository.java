package com.timothyisaiah.loanapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.timothyisaiah.loanapi.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
