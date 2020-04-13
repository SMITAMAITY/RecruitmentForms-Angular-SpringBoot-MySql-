package com.lti.recruitment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IScreeningOneDao;
import com.lti.recruitment.dao.IScreeningTwoDao;
import com.lti.recruitment.models.ScreeningOne;
import com.lti.recruitment.models.ScreeningTwo;
import com.lti.recruitment.services.IScreeningTwoService;

@Service("service5")
public  class ScreeningTwoServiceImpl implements IScreeningTwoService {
	@Autowired
	private IScreeningTwoDao dao;


	
	@Override
	public List<ScreeningTwo> findAllScreeningTwoDetails() {
		return dao.readAllScreeningTwoDetails();
	}



	@Override
	public void addScreeningTwoDetails(ScreeningTwo screeningTwo) {
		dao.createScreeningTwoDetails(screeningTwo);
		
	}

	

}
