package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.FinalExceptionApproval;

public interface IFinalExceptionApprovalDao {
	//Select details
		public List<FinalExceptionApproval> readAllFinalExceptionApprovalDetails();
		
		
		//Insert details
		public void createFinalExceptionApprovalDetails(FinalExceptionApproval finalExceptionApproval);
}
