package com.lti.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.recruitment.models.HRDiscussion;
import com.lti.recruitment.services.IHRDiscussionService;

@RestController
@RequestMapping(path = "HR")
@CrossOrigin
public class HRDiscussionController {
	@Autowired
	private IHRDiscussionService service8;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<HRDiscussion> viewAllAssembleData() {
		List<HRDiscussion> hrDiscussion = service8.findAllHRDiscussion();
		System.out.println(hrDiscussion);
		return hrDiscussion;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addHRDiscussion(@RequestBody HRDiscussion hrDiscussion) {
		service8.addHRDiscussion(hrDiscussion);
		
	}
}
