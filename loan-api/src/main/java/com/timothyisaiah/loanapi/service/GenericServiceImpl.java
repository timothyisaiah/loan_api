package com.timothyisaiah.loanapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timothyisaiah.loanapi.models.Client;
import com.timothyisaiah.loanapi.repository.GenericRepository;

@Service
@Transactional
public class GenericServiceImpl implements GenericService {
    @Autowired
    private final GenericRepository genericRepository;
    
    public GenericServiceImpl (GenericRepository genericRepository){
        this.genericRepository = genericRepository;
    }
    public void saveClient(Client client){
        genericRepository.save(client);
    }
    public List<Client> fetchAllClients() {
    	return (List<Client>) genericRepository.findAll();
    }
    public Client fetchClientById(int clientid) {
    	return genericRepository.findById(clientid).get();
    }

}