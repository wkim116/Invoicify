package com.invocify.Invoices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invocify.Invoices.models.InvoiceLineItem;

public interface InvoiceLineItemRepository extends JpaRepository<InvoiceLineItem, Integer>{

}
