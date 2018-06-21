package com.invocify.Invoices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invocify.Invoices.models.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{

}
