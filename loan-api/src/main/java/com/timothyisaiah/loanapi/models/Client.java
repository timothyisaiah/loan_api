/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timothyisaiah.loanapi.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author timothy isaiah
 */
@Entity
@Table(name="client")
public class Client {
    
    @Id
    private int clientid;
    private String firstname;
    private String lastname;
    private String security;
    private String occupation;
    private String address;
    private String telephone;     
    
    public Client() {
    }

    
    
    public Client(String firstname, String lastname, String security, String occupation, String address, String telephone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.security = security;
        this.occupation = occupation;
        this.address = address;
        this.telephone = telephone;
    }

    
    
    
    public int getId() {
        return clientid;
    }

    public void setId(int clientid) {
        this.clientid = clientid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    



    
}
