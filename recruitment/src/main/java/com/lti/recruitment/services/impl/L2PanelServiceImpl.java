package com.lti.recruitment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IL2PanelDao;
import com.lti.recruitment.models.L2Panel;
import com.lti.recruitment.services.IL2PanelService;

@Service("service7")
public class L2PanelServiceImpl implements IL2PanelService {
	@Autowired
	private IL2PanelDao dao;
	
	
	@Override
	public List<L2Panel> findAllL2Panel() {
		return dao.readAllL2PanelDetails();
	}

	@Override
	public void addL2Panel(L2Panel l2Panel) {
		dao.createL2PanelDetails(l2Panel);
		
	}

}
