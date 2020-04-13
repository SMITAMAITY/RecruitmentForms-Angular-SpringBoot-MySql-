package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.RecruitmentRoundOne;

public interface IRecruitmentRoundOneDao {
	//Select details
		public List<RecruitmentRoundOne> readAllRecruitmentRoundOne();
		
		
		//Insert details
		public void createRecruitmentRoundOne(RecruitmentRoundOne recruitmentRoundOne);
}
