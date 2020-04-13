package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.L1Panel;

public interface IL1PanelDao {
	//Select details
			public List<L1Panel> readAllL1PanelDetails();
			
			
			//Insert details
			public void createDemandDetails(L1Panel l1Panel);
}
