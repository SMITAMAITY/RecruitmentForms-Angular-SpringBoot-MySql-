package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.RecruitmentUnderstanding;

public interface IRecruitmentUnderstandingService {
public  List<RecruitmentUnderstanding> findAllRecruitmentUnderstandingDetails();
	
	public void addRecruitmentUnderstanding(RecruitmentUnderstanding recruitmentUnderstanding);
}
