package com.timothyisaiah.loanapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.timothyisaiah.loanapi.models.Client;

public interface GenericRepository extends CrudRepository<Client, Integer> {

}
