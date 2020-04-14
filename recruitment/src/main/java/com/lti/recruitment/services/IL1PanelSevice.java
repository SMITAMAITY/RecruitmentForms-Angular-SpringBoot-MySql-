package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.L1Panel;

public interface IL1PanelSevice {
	public  List<L1Panel> findAllL1Panel();
	
	
	public void addL1Panel(L1Panel l1Panel);
}
