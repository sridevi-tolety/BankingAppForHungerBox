package com.myorg.banking.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BankTransaction {
	
	@Id
	@GeneratedValue
	private Long id;
	private Long fromacct;
	public BankTransaction() {}
	public BankTransaction(Long id, Long fromacct, Long toacct, Double amounttransfered, Date dateoftransfer) {
		super();
		this.id = id;
		this.fromacct = fromacct;
		this.toacct = toacct;
		this.amounttransfered = amounttransfered;
		this.dateoftransfer = dateoftransfer;
	}
	private Long toacct;
	private Double amounttransfered;
	private Date dateoftransfer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFromacct() {
		return fromacct;
	}
	public void setFromacct(Long fromacct) {
		this.fromacct = fromacct;
	}
	public Long getToacct() {
		return toacct;
	}
	public void setToacct(Long toacct) {
		this.toacct = toacct;
	}
	public Double getAmounttransfered() {
		return amounttransfered;
	}
	public void setAmounttransfered(Double amounttransfered) {
		this.amounttransfered = amounttransfered;
	}
	public Date getDateoftransfer() {
		return dateoftransfer;
	}
	public void setDateoftransfer(Date dateoftransfer) {
		this.dateoftransfer = dateoftransfer;
	}

}
