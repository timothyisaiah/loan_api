package com.timothyisaiah.loanapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timothyisaiah.loanapi.models.Client;
import com.timothyisaiah.loanapi.service.GenericServiceImpl;

@RestController
public class ClientController {

    @Autowired
    private GenericServiceImpl genericService;

    @GetMapping("/saveclient")
    public String saveClient(@RequestParam String firstname,@RequestParam String lastname,@RequestParam String address,@RequestParam String telephone,@RequestParam String occupation,@RequestParam String security) {
        
        Client client = new Client(firstname,lastname,security,occupation,address,telephone);
        
        genericService.saveClient(client);
        return "Client saved successfully";
    } 
	
	
}
