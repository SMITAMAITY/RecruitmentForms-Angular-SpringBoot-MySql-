package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.ScreeningTwo;

public interface IScreeningTwoDao {
	//Select details
	public List<ScreeningTwo> readAllScreeningTwoDetails();
	
	
	//Insert details
	public void createScreeningTwoDetails(ScreeningTwo screeningTwo);
}
