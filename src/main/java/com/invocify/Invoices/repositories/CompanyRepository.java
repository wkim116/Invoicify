package com.invocify.Invoices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invocify.Invoices.models.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{
	
}
