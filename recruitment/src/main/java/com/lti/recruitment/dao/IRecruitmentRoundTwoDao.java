package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.RecruitmentRoundTwo;

public interface IRecruitmentRoundTwoDao {
			//Select details
			public List<RecruitmentRoundTwo> readAllRecruitmentRoundTwo();
			
			
			//Insert details
			public void createRecruitmentRoundTwo(RecruitmentRoundTwo recruitmentRoundTwo);
}
