package com.lti.recruitment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IHRDiscussionDao;
import com.lti.recruitment.dao.IL2PanelDao;
import com.lti.recruitment.models.HRDiscussion;
import com.lti.recruitment.models.L2Panel;
import com.lti.recruitment.services.IHRDiscussionService;

@Service("service8")
public class HRDiscussionServiceImpl implements IHRDiscussionService {
	@Autowired
	private IHRDiscussionDao dao;
	
	
	@Override
	public List<HRDiscussion> findAllHRDiscussion() {
		return dao.readAllHRDiscussionDetails();
	}

	@Override
	public void addHRDiscussion(HRDiscussion hrDiscussion) {
		dao.createHRDiscussionDetails(hrDiscussion	);
		
	}

}
