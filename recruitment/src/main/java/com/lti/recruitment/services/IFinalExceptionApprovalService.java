package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.FinalExceptionApproval;

public interface IFinalExceptionApprovalService {
	public  List<FinalExceptionApproval> findAllFinalExceptionApproval();
	
	
	public void addFinalExceptionApproval(FinalExceptionApproval finalExceptionApproval);
}
