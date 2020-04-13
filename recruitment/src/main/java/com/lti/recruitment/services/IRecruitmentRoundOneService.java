package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.RecruitmentRoundOne;

public interface IRecruitmentRoundOneService {
public  List<RecruitmentRoundOne> findAllRecruitmentRoundOne();
	
	
	public void addRecruitmentRoundOne(RecruitmentRoundOne recruitmentRoundOne);
}
