package com.lti.recruitment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IFirstExceptionApprovalDao;
import com.lti.recruitment.models.FirstExceptionApproval;
import com.lti.recruitment.services.IFirstExceptionApprovalService;

@Service("service11")
public class FirstExceptionApprovalServiceImpl implements IFirstExceptionApprovalService {
	@Autowired
	private IFirstExceptionApprovalDao dao;
	
	@Override
	public List<FirstExceptionApproval> findAllFirstExceptionApproval() {
		return dao.readAllFirstExceptionApprovalDetails();
	}

	@Override
	public void addFirstExceptionApproval(FirstExceptionApproval firstExceptionApproval) {
		dao.createFirstExceptionApprovalDetails(firstExceptionApproval);

	}

}
