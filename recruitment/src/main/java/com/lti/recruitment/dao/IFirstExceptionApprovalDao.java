package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.FirstExceptionApproval;

public interface IFirstExceptionApprovalDao {
	//Select details
	public List<FirstExceptionApproval> readAllFirstExceptionApprovalDetails();
	
	
	//Insert details
	public void createFirstExceptionApprovalDetails(FirstExceptionApproval firstExceptionApproval);
}
