package com.lti.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.recruitment.models.FirstExceptionApproval;
import com.lti.recruitment.services.IFirstExceptionApprovalService;

@RestController
@RequestMapping(path = "FirstExceptionApproval")
@CrossOrigin
public class FirstExceptionApprovalController {
	@Autowired
	private IFirstExceptionApprovalService service11;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FirstExceptionApproval> viewAllAssembleData() {
		List<FirstExceptionApproval> firstExceptionApproval = service11.findAllFirstExceptionApproval();
		System.out.println(firstExceptionApproval);
		return firstExceptionApproval;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addFirstExceptionApproval(@RequestBody FirstExceptionApproval firstExceptionApproval) {
		service11.addFirstExceptionApproval(firstExceptionApproval);
		
	}
}
