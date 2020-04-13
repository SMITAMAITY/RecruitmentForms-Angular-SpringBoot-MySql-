package com.lti.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.recruitment.models.ScreeningOne;
import com.lti.recruitment.services.IScreeningOneService;

@RestController
@RequestMapping(path = "ScreeningOne")
@CrossOrigin
public class ScreeningOneController {
	@Autowired
	private IScreeningOneService service3;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ScreeningOne> viewAllScreeningOne() {
		List<ScreeningOne> screeningOne = service3.findAllScreeningOneDetails();
		System.out.println(screeningOne);
		return screeningOne;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addAssembleData(@RequestBody ScreeningOne screeningOne) {
		service3.addScreeningOneDetails(screeningOne);
		
	}
}
