package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.RecruitmentRoundTwo;

public interface IRecruitmentRoundTwoService {
public  List<RecruitmentRoundTwo> findAllRecruitmentRoundTwo();
	
	
	public void addRecruitmentRoundTwo(RecruitmentRoundTwo recruitmentRoundTwo);
}
