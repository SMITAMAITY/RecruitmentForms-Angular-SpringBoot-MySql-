package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.RecruitmentUnderstanding;


public interface IRecruitmentUnderstandingDao {
	//select
		public List<RecruitmentUnderstanding> readAllRecruitmentUnderstandingDetails();
		
		//insert
		public void createRecruitmentUnderstandingDetails(RecruitmentUnderstanding recruitmentUnderstandingDetails);
	}




	