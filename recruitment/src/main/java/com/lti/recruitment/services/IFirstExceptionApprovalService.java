package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.FirstExceptionApproval;

public interface IFirstExceptionApprovalService {
	public  List<FirstExceptionApproval> findAllFirstExceptionApproval();
	
	
	public void addFirstExceptionApproval(FirstExceptionApproval firstExceptionApproval);
}
