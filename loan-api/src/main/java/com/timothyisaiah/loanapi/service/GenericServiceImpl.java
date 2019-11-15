package com.timothyisaiah.loanapi.service;

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
}