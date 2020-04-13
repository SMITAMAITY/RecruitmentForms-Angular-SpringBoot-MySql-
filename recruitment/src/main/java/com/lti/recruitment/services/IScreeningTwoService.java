package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.ScreeningTwo;

public interface IScreeningTwoService {
	public  List<ScreeningTwo> findAllScreeningTwoDetails();
	
	
	public void addScreeningTwoDetails(ScreeningTwo screeningTwo);
}
