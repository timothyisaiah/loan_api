package com.timothyisaiah.loanapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timothyisaiah.loanapi.models.Loans;
import com.timothyisaiah.loanapi.repository.LoanRepository;

@Service
@Transactional
public class LoanService {

	@Autowired
	private LoanRepository loanRepository;
	
	public LoanService(LoanRepository loanRepository) {
		this.loanRepository =loanRepository;
	}
	
	public void saveLoan(Loans loans) {
		loanRepository.save(loans);
	}
	public void deleteLoanById(Integer loanid) {
		loanRepository.deleteById(loanid);
	}
	public void deleteLoan(Loans loan) {
		loanRepository.delete(loan);
	}
	public void updateLoan(Loans loan) {
		loanRepository.save(loan);
	}
	public void fetchLoan(Integer loanid) {
		loanRepository.findById(loanid);
	}
	public List<Loans> fetchAllLoans() {
		List<Loans> allLoans = (List<Loans>) loanRepository.findAll();
		
		return allLoans;
	}
}
