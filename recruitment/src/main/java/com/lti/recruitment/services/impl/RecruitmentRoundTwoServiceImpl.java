package com.lti.recruitment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IRecruitmentRoundTwoDao;
import com.lti.recruitment.models.RecruitmentRoundTwo;
import com.lti.recruitment.services.IRecruitmentRoundTwoService;

@Service("service9")
public class RecruitmentRoundTwoServiceImpl implements IRecruitmentRoundTwoService {
	@Autowired
	private IRecruitmentRoundTwoDao dao;


	@Override
	public List<RecruitmentRoundTwo> findAllRecruitmentRoundTwo() {
		return dao.readAllRecruitmentRoundTwo();
	}

	@Override
	public void addRecruitmentRoundTwo(RecruitmentRoundTwo recruitmentRoundTwo) {
		dao.createRecruitmentRoundTwo(recruitmentRoundTwo);
		
	}
	


	
}
