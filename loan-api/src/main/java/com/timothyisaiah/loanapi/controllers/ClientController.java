package com.timothyisaiah.loanapi.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timothyisaiah.loanapi.models.Client;
import com.timothyisaiah.loanapi.service.GenericServiceImpl;


@CrossOrigin(origins={ "http://localhost:3000"})
@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private GenericServiceImpl genericService;

    @PostMapping("/saveclient")
    public String saveClient(HttpServletRequest request) {
    	
    	String firstname = request.getParameter("firstname");
    	String lastname = request.getParameter("lastname");
    	String address = request.getParameter("address");
    	String telephone = request.getParameter("telephone");
    	String occupation = request.getParameter("occupation");
    	String security = request.getParameter("security");
    	    	
    	Client client = new Client(address, firstname, lastname, occupation, security, telephone);
        
        genericService.saveClient(client);
        return "Client saved successfully";
    } 
	@GetMapping("/fetchAllClients")
	public List<Client> fetchAllClients(){
	
		return genericService.fetchAllClients();
	}
	
}
