package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.AssembleData;

public interface IAssembleDataDao {
	//Select details
	public List<AssembleData> readAllAssembleData();
	
	
	//Insert details
	public void createAssembleData(AssembleData assembleData);
}
