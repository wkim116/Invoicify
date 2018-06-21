package com.invocify.Invoices.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Invoice")

public class Invoice {
	
	@Id
	@GeneratedValue
	private int id; 
	private Date createdOn;
	private String invoiceDescription; 
	
	@OneToMany(mappedBy="invoices", cascade=CascadeType.ALL)
	Set <InvoiceLineItem> lineItems; 
	
	@ManyToOne
	Company company; 
	
	public Invoice () {}
	
	public Invoice( Date createdOn, String invoiceDescription, Set <InvoiceLineItem> lineItems, Company company) {
		this.createdOn = createdOn;
		this.invoiceDescription = invoiceDescription;
		this.lineItems = lineItems;
		this.company = company;
	}

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

	public String getInvoiceDescription() {
		return invoiceDescription;
	}

	public void setInvoiceDescription(String invoiceDescription) {
		this.invoiceDescription = invoiceDescription;
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
