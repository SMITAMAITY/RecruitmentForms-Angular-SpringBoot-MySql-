package com.lti.recruitment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IFinalExceptionApprovalDao;
import com.lti.recruitment.models.FinalExceptionApproval;
import com.lti.recruitment.services.IFinalExceptionApprovalService;

@Service("service12")
public class FinalExceptionApprovalServiceImpl implements IFinalExceptionApprovalService {
	@Autowired
	private IFinalExceptionApprovalDao dao;
	@Override
	public List<FinalExceptionApproval> findAllFinalExceptionApproval() {
		return dao.readAllFinalExceptionApprovalDetails();
	}

	@Override
	public void addFinalExceptionApproval(FinalExceptionApproval finalExceptionApproval) {
		dao.createFinalExceptionApprovalDetails(finalExceptionApproval);

	}
	
}
