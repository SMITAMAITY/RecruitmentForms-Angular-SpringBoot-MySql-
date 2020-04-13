package com.lti.recruitment.services.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IAssembleDataDao;
import com.lti.recruitment.models.AssembleData;
import com.lti.recruitment.services.IAssembleDataService;

@Service("service2")
public class AssembleDataServiceImpl implements IAssembleDataService {

	@Autowired
	private IAssembleDataDao dao;
	
	@Override
	public List<AssembleData> findAllAssembleData() {
		return dao.readAllAssembleData();
	}

	@Override
	public void addAssembleData(AssembleData assembleData) {
		dao.createAssembleData(assembleData);
		
	}

}