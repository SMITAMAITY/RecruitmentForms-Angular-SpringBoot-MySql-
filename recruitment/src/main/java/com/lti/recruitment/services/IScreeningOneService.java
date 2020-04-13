package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.ScreeningOne;

public interface IScreeningOneService {

	public  List<ScreeningOne> findAllScreeningOneDetails();
	
	
	public void addScreeningOneDetails(ScreeningOne screeningOne);
}
