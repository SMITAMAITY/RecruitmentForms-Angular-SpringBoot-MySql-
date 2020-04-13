package com.lti.recruitment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IRecruitmentRoundOneDao;
import com.lti.recruitment.models.RecruitmentRoundOne;
import com.lti.recruitment.services.IRecruitmentRoundOneService;

@Service("service4")
public class RecruitmentRoundOneServiceImpl implements IRecruitmentRoundOneService {
	@Autowired
	private IRecruitmentRoundOneDao dao;
	
	
	@Override
	public List<RecruitmentRoundOne> findAllRecruitmentRoundOne() {
		return dao.readAllRecruitmentRoundOne();
	}

	@Override
	public void addRecruitmentRoundOne(RecruitmentRoundOne recruitmentRoundOne) {
		dao.createRecruitmentRoundOne(recruitmentRoundOne);
		
	}

}
