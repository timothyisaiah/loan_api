package com.timothyisaiah.loanapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.timothyisaiah.loanapi.models.Loans;

public interface LoanRepository extends CrudRepository<Loans, Integer> {

}
