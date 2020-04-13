package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.AssembleData;

public interface IAssembleDataService {

public  List<AssembleData> findAllAssembleData();
	
	
	public void addAssembleData(AssembleData assembleData);
}
