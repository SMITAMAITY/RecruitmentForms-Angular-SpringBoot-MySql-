package com.lti.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.recruitment.models.RecruitmentRoundTwo;
import com.lti.recruitment.services.IRecruitmentRoundTwoService;

@RestController
@RequestMapping(path = "RecruitmentRoundTwo")
@CrossOrigin
public class RecruitmentRoundTwoController {
	@Autowired
	private IRecruitmentRoundTwoService service9;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<RecruitmentRoundTwo> viewAllAssembleData() {
		List<RecruitmentRoundTwo> recruitmentRoundTwo = service9.findAllRecruitmentRoundTwo();
		System.out.println(recruitmentRoundTwo);
		return recruitmentRoundTwo;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addRecruitmentRoundTwo(@RequestBody RecruitmentRoundTwo recruitmentRoundTwo) {
		service9.addRecruitmentRoundTwo(recruitmentRoundTwo);
		
	}
}
