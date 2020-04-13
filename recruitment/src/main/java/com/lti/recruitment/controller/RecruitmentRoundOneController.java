package com.lti.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.recruitment.models.RecruitmentRoundOne;
import com.lti.recruitment.services.IRecruitmentRoundOneService;

@RestController
@RequestMapping(path = "RecruitmentRoundOne")
@CrossOrigin
public class RecruitmentRoundOneController {

	@Autowired
	private IRecruitmentRoundOneService service4;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<RecruitmentRoundOne> viewAllAssembleData() {
		List<RecruitmentRoundOne> recruitmentRoundOne = service4.findAllRecruitmentRoundOne();
		System.out.println(recruitmentRoundOne);
		return recruitmentRoundOne;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addRecruitmentRoundOne(@RequestBody RecruitmentRoundOne recruitmentRoundOne) {
		service4.addRecruitmentRoundOne(recruitmentRoundOne);
		
	}
}
