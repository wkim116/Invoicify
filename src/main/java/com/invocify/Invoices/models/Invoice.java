package com.invocify.Invoices.models;

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
	
	public int createdOn;
	public String invoiceDescription; 
	
	@OneToMany(mappedBy="invoices", cascade=CascadeType.ALL)
	
	
	@ManyToOne
	Company company; 
	
	
	

}
