package com.invocify.Invoices.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="billing_records")
abstract class BillingRecord {
	
	@Id
    @GeneratedValue
    private int id;
	
	protected Date createdOn;
	protected String description;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy="billingRecord")
	protected Set <InvoiceLineItem> lineItems;
	
	@ManyToOne
	protected Company company;
	
	public BillingRecord() {};
	
	public BillingRecord( Date createdOn, String description, Set <InvoiceLineItem> lineItems, Company company) {
		this.createdOn = createdOn;
		this.description = description;
		this.lineItems = lineItems;
		this.company = company;
	}
	
	abstract double getTotal();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<InvoiceLineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(Set<InvoiceLineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
