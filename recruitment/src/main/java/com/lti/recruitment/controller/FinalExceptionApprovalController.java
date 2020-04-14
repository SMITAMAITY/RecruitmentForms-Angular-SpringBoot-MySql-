package com.lti.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.recruitment.models.FinalExceptionApproval;
import com.lti.recruitment.services.IFinalExceptionApprovalService;

@RestController
@RequestMapping(path = "FinalExceptionApproval")
@CrossOrigin
public class FinalExceptionApprovalController {
	@Autowired
	private IFinalExceptionApprovalService service12;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FinalExceptionApproval> viewAllAssembleData() {
		List<FinalExceptionApproval> finalExceptionApproval = service12.findAllFinalExceptionApproval();
		System.out.println(finalExceptionApproval);
		return finalExceptionApproval;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addFinalExceptionApproval(@RequestBody FinalExceptionApproval finalExceptionApproval) {
		service12.addFinalExceptionApproval(finalExceptionApproval);
		
}
}
