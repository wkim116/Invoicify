package com.invocify.Invoices.models;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company {
	 @Id
	 @GeneratedValue
	 private int id;
	 
	 private String name;

	 @OneToMany(mappedBy="company")
	 private List<Invoice> invoice;
	 
	 
	 public Company() {}
	 
	 public Company (String name, List<Invoice> invoice) {
			this.name = name;
			this.invoice = invoice;
			
		}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Invoice> getInvoice() {
		return invoice;
	}

	public void setInvoice(List<Invoice> invoice) {
		this.invoice = invoice;
	}
	 
	 
	 
}
