package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.FinanceApproval;

public interface IFinanceApprovalService {

public  List<FinanceApproval> findAllFinanceApproval();
	
	
	public void addFinanceApproval(FinanceApproval financeApproval);
}