package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.HRDiscussion;

public interface IHRDiscussionService {
	public  List<HRDiscussion> findAllHRDiscussion();
	
	
	public void addHRDiscussion(HRDiscussion hrDiscussion);
}
