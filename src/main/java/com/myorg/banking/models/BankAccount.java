package com.myorg.banking.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BankAccount {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Double balanceamount;
	private Long accountnumber;
	public BankAccount() {}
	public BankAccount(Long id, String name, Double balanceamount, Long accountnumber, Long cardnumber, Long cvvnumber,
			Date expirydate) {
		super();
		this.id = id;
		this.name = name;
		this.balanceamount = balanceamount;
		this.accountnumber = accountnumber;
		this.cardnumber = cardnumber;
		this.cvvnumber = cvvnumber;
		this.expirydate = expirydate;
	}
	private Long cardnumber;
	private Long cvvnumber;
	private Date expirydate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalanceamount() {
		return balanceamount;
	}
	public void setBalanceamount(Double balanceamount) {
		this.balanceamount = balanceamount;
	}
	public Long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Long getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(Long cardnumber) {
		this.cardnumber = cardnumber;
	}
	public Long getCvvnumber() {
		return cvvnumber;
	}
	public void setCvvnumber(Long cvvnumber) {
		this.cvvnumber = cvvnumber;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}

}
