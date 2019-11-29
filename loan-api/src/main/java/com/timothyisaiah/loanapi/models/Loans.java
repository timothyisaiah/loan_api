package com.timothyisaiah.loanapi.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loans")
public class Loans {

	public Loans() {
	}
	@Id
	private int loanid;
	private Double principal;
	private Double interest;
	private Double interestrate;
	private Double installment;
	private int period;
	private int clientid;
	private Date returndate;
	
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
	public Double getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(Double interestrate) {
		this.interestrate = interestrate;
	}
	public Double getInstallment() {
		return installment;
	}
	public void setInstallment(Double installment) {
		this.installment = installment;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	public Loans(int loanid, Double principal, Double interest, Double interestrate, Double installment, int period,
			int clientid, Date returndate) {
		super();
		this.loanid = loanid;
		this.principal = principal;
		this.interest = interest;
		this.interestrate = interestrate;
		this.installment = installment;
		this.period = period;
		this.clientid = clientid;
		this.returndate = returndate;
	}
	public Loans(Double principal, Double interest, Double interestrate, Double installment, int period, int clientid,
			Date returndate) {
		super();
		this.principal = principal;
		this.interest = interest;
		this.interestrate = interestrate;
		this.installment = installment;
		this.period = period;
		this.clientid = clientid;
		this.returndate = returndate;
	}
	@Override
	public String toString() {
		return "Loans [loanid=" + loanid + ", principal=" + principal + ", interest=" + interest + ", interestrate="
				+ interestrate + ", installment=" + installment + ", period=" + period + ", clientid=" + clientid
				+ ", returndate=" + returndate + "]";
	}
	
	
	
	
}
