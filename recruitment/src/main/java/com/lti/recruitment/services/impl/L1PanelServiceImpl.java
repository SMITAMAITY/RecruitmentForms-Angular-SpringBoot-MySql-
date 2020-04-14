package com.lti.recruitment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IL1PanelDao;
import com.lti.recruitment.models.L1Panel;
import com.lti.recruitment.services.IL1PanelSevice;

@Service("service6")
public class L1PanelServiceImpl implements IL1PanelSevice {
	@Autowired
	private IL1PanelDao dao;
	
	
	@Override
	public List<L1Panel> findAllL1Panel() {
		return dao.readAllL1PanelDetails();
	}

	@Override
	public void addL1Panel(L1Panel l1Panel) {
		dao.createL1PanelDetails(l1Panel);
		
	}

}
