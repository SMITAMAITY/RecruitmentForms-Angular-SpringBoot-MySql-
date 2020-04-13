package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.ScreeningOne;

public interface IScreeningOneDao {

	//Select details
			public List<ScreeningOne> readAllScreeningOneDetails();
			
			
			//Insert details
			public void createScreeningOneDetails(ScreeningOne screeningOne);
	}