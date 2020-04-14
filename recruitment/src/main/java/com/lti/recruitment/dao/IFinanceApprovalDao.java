package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.FinanceApproval;

public interface IFinanceApprovalDao {
			//Select details
			public List<FinanceApproval> readAllFinanceApprovalDetails();
			
			
			//Insert details
			public void createFinanceApprovalDetails(FinanceApproval financeApproval);
}
