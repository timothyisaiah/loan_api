package com.timothyisaiah.loanapi.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loans")
public class Loans {

	@Id
	private int loanid;
	private String principal;
	private String interest;
	private String interestrate;
	private String installment;
	private String period;
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(String interestrate) {
		this.interestrate = interestrate;
	}
	public String getInstallment() {
		return installment;
	}
	public void setInstallment(String installment) {
		this.installment = installment;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public Loans(String principal, String interest, String interestrate, String installment, String period) {
		super();
		this.principal = principal;
		this.interest = interest;
		this.interestrate = interestrate;
		this.installment = installment;
		this.period = period;
	}
	
	public Loans(int loanid, String principal, String interest, String interestrate, String installment,
			String period) {
		super();
		this.loanid = loanid;
		this.principal = principal;
		this.interest = interest;
		this.interestrate = interestrate;
		this.installment = installment;
		this.period = period;
	}
	@Override
	public String toString() {
		return "Loans [loanid=" + loanid + ", principal=" + principal + ", interest=" + interest + ", interestrate="
				+ interestrate + ", installment=" + installment + ", period=" + period + "]";
	}
	
	
}
