package com.invocify.Invoices.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.invocify.Invoices.repositories.RateBasedBillingRecordRepository;

@Controller
public class RateBasedBillingController {

	private RateBasedBillingRecordRepository rbBillingRecordRepo;
	
	//Default constructor
	public RateBasedBillingRecord() {}
	
	
	public List<RateBasedBillingRecord> list(){
		List<RateBasedBillingRecord> rbBillingRecords = new ArrayList<RateBasedBillingRecord>();
		rbBillingRecords = rbBillingRecordRepo.findAll();
		
		return rbBillingRecords;
	}
	
}
