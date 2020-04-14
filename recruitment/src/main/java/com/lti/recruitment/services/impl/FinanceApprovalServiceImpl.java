package com.lti.recruitment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IFinanceApprovalDao;
import com.lti.recruitment.models.FinanceApproval;
import com.lti.recruitment.services.IFinanceApprovalService;

@Service("service10")
public class FinanceApprovalServiceImpl implements IFinanceApprovalService {
	@Autowired
	private IFinanceApprovalDao dao;
	
	


	@Override
	public List<FinanceApproval> findAllFinanceApproval() {
		return dao.readAllFinanceApprovalDetails();

	}

	@Override
	public void addFinanceApproval(FinanceApproval financeApproval) {
		dao.createFinanceApprovalDetails(financeApproval);
		
	}

}
