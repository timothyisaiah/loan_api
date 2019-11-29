package com.timothyisaiah.loanapi.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="searchloans")
public class Searchloans {

	@Id
	private int clientid;
	private String firstname;
	private String lastname;
	private String telephone;
	private int loanid;
	private Double principal;
	private Double interest;
	private Double installment;
	private Date returndate;
	private String permutation1;
	private String permutation2;
	
	public Searchloans() {}
	
	public Searchloans(int clientid, String firstname, String lastname, String telephone, int loanid, Double principal,
			Double interest, Double installment, Date returndate, String permutation1, String permutation2) {
		super();
		this.clientid = clientid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.loanid = loanid;
		this.principal = principal;
		this.interest = interest;
		this.installment = installment;
		this.returndate = returndate;
		this.permutation1 = permutation1;
		this.permutation2 = permutation2;
	}


	public int getClientid() {
		return clientid;
	}


	public void setClientid(int clientid) {
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


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public int getLoanid() {
		return loanid;
	}


	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}


	public Double getPrincipal() {
		return principal;
	}


	public void setPrincipal(Double principal) {
		this.principal = principal;
	}


	public Double getInterest() {
		return interest;
	}


	public void setInterest(Double interest) {
		this.interest = interest;
	}


	public Double getInstallment() {
		return installment;
	}


	public void setInstallment(Double installment) {
		this.installment = installment;
	}


	public Date getReturndate() {
		return returndate;
	}


	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}


	public String getPermutation1() {
		return permutation1;
	}


	public void setPermutation1(String permutation1) {
		this.permutation1 = permutation1;
	}


	public String getPermutation2() {
		return permutation2;
	}


	public void setPermutation2(String permutation2) {
		this.permutation2 = permutation2;
	}


	@Override
	public String toString() {
		return "Searchloans [clientid=" + clientid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", telephone=" + telephone + ", loanid=" + loanid + ", principal=" + principal + ", interest="
				+ interest + ", installment=" + installment + ", returndate=" + returndate + ", permutation1="
				+ permutation1 + ", permutation2=" + permutation2 + "]";
	}
	
	
	
	
}
