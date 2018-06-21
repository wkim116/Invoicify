package com.invocify.Invoices.models;

import java.util.Date;

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
	InvoiceLineItem  lineItems; 
	
	@ManyToOne
	Company company; 
	
	
	

}
