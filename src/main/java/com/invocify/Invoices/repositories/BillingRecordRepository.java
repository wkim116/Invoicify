package com.invocify.Invoices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invocify.Invoices.models.BillingRecord;


public interface BillingRecordRepository extends JpaRepository<BillingRecord, Integer>{

}
