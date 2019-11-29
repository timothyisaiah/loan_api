package com.timothyisaiah.loanapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timothyisaiah.loanapi.models.Searchloans;
import com.timothyisaiah.loanapi.repository.SearchloanRepository;

@Service
@Transactional
public class SearchLoanService {
	@Autowired
	private SearchloanRepository searchloanrepository;

	public SearchLoanService(SearchloanRepository searchloanrepository) {
		this.searchloanrepository = searchloanrepository;
	}
	
	public void fetchLoanDetails(Integer clientid) {
		searchloanrepository.findById(clientid).get();
	}
	public List<Searchloans> fetchAllLoanDetails() {
		List<Searchloans> allLoans = (List<Searchloans>) searchloanrepository.findAll();
		
		return allLoans;
	}
}
