package com.timothyisaiah.loanapi.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timothyisaiah.loanapi.models.Loans;
import com.timothyisaiah.loanapi.models.Searchloans;
import com.timothyisaiah.loanapi.service.LoanService;
import com.timothyisaiah.loanapi.service.SearchLoanService;

@CrossOrigin(origins={ "http://localhost:3000"})
@RestController
//@RequestMapping("/api")
public class loanController {
//     DateFormat formatter = 
	@Autowired
	private LoanService loanService;
	
	@Autowired
	private SearchLoanService searchloanservice;
	
	
    @RequestMapping("/fetchAllLoans")
    public List<Loans> home() {
        return loanService.fetchAllLoans();
    }

    @GetMapping("/fetchAllLoanDetails")
    public List<Searchloans> root() {
        return searchloanservice.fetchAllLoanDetails();
    }

    @PostMapping("/saveLoan")
    public Loans saveLoan(HttpServletRequest request) {
        
    	Double principal = Double.valueOf(request.getParameter("principle"));
    	Double installment =Double.valueOf( request.getParameter("installments"));
    	int period = Integer.valueOf(request.getParameter("period"));
    	Double interest = Double.valueOf(request.getParameter("interest"));
//    	String total = request.getParameter("total");
    	Date returndate = new Date();
    	Double interestrate = Double.valueOf(request.getParameter("rate"));
    	Integer clientid = Integer.valueOf(request.getParameter("clientid"));

    	
        Loans loan = new Loans(principal,interest,interestrate,installment,period,clientid,returndate);
        
        loanService.saveLoan(loan);
       return loan;
//         "Employee <h2>" +username+ "</h2> saved successfully";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "Admin Page";
    }

    @RequestMapping("/loan")
    public String calcualateloan() {
        return "Your interest is %)";
    }


    

    
//    @PostMapping("/saveloan")
//    public String saveClient(@RequestParam String firstname,@RequestParam String lastname,@RequestParam String address,@RequestParam String telephone,@RequestParam String occupation,@RequestParam String security) {
//        
//        Client client = new Client(firstname,lastname,security,occupation,address,telephone);
//        
//        genericService.saveClient(client);
//        return "Client saved successfully";
//    }
}
