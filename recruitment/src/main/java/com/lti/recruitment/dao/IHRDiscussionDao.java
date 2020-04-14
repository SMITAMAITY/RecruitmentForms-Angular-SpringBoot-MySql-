package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.HRDiscussion;

public interface IHRDiscussionDao {
	//Select details
		public List<HRDiscussion> readAllHRDiscussionDetails();
		
		
		//Insert details
		public void createHRDiscussionDetails(HRDiscussion hrDiscussion);
}
