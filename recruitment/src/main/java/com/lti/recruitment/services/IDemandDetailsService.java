package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.DemandDetails;

public interface IDemandDetailsService {
	
	public  List<DemandDetails> findAllDemandDetails();
	
	
	public void addDemandDetails(DemandDetails demandDetails);
}
