package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.L2Panel;

public interface IL2PanelDao {
	//Select details
	public List<L2Panel> readAllL2PanelDetails();
	
	
	//Insert details
	public void createL2PanelDetails(L2Panel l2Panel);
}
