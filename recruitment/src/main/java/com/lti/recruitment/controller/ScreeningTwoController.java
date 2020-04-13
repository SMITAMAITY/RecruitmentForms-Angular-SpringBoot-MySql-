package com.lti.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.recruitment.models.ScreeningTwo;
import com.lti.recruitment.services.IScreeningTwoService;

@RestController
@RequestMapping(path = "ScreeningTwo")
@CrossOrigin
public class ScreeningTwoController {
	@Autowired
	private IScreeningTwoService service5;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ScreeningTwo> viewAllScreeningOne() {
		List<ScreeningTwo> screeningTwo = service5.findAllScreeningTwoDetails();
		System.out.println(screeningTwo);
		return screeningTwo;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addScreeningTwo(@RequestBody ScreeningTwo screeningTwo) {
		service5.addScreeningTwoDetails(screeningTwo);
		
	}
}
