package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.L2Panel;

public interface IL2PanelService {
	public  List<L2Panel> findAllL2Panel();
	
	
	public void addL2Panel(L2Panel l2Panel);
}
