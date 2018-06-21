package com.invocify.Invoices.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="rate_based_billing_records")
public class RateBasedBillingRecord extends BillingRecord {

	public RateBasedBillingRecord(Date creationDate, String description, Set <InvoiceLineItem> lineItems, Company company){
		super(creationDate, description, lineItems, company);
	}
	
	private int rate;
	private int quantity;
	
	public RateBasedBillingRecord() {};
	
	public RateBasedBillingRecord(Date creationDate, String description, Set <InvoiceLineItem> lineItems, Company company, int rate, int quantity){
		super(creationDate, description, lineItems, company);
		this.rate = rate;
		this.quantity = quantity;
	}
	
	
	@Override
	double getTotal() {
		
		return rate*quantity;
	}


	public int getRate() {
		return rate;
	}


	public void setRate(int rate) {
		this.rate = rate;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
