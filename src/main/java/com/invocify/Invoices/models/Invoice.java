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

}
