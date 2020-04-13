package com.lti.recruitment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IScreeningOneDao;
import com.lti.recruitment.models.ScreeningOne;
import com.lti.recruitment.services.IScreeningOneService;



@Service("service3")
public class ScreeningOneServiceImpl implements IScreeningOneService {

	@Autowired
	private IScreeningOneDao dao;

	@Override
	public List<ScreeningOne> findAllScreeningOneDetails() {
		return dao.readAllScreeningOneDetails();
	}

	@Override
	public void addScreeningOneDetails(ScreeningOne screeningOne) {
		dao.createScreeningOneDetails(screeningOne);
	}


	
	

	

}
