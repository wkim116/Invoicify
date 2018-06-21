package com.invocify.Invoices.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="flat_fee_billing_records")
public class FlatFeeBillingRecord extends BillingRecord {
	
	public FlatFeeBillingRecord(Date creationDate, String description, Set <InvoiceLineItem> lineItems, Company company){
		super(creationDate, description, lineItems, company);
	}
	
	int amount;
	
	public FlatFeeBillingRecord() {};
	
	public FlatFeeBillingRecord(Date creationDate, String description, Set <InvoiceLineItem> lineItems, Company company, int amount){
		super(creationDate, description, lineItems, company);
		this.amount = amount;
	}
	
	@Override
	double getTotal() {
		return amount;
	}

}
