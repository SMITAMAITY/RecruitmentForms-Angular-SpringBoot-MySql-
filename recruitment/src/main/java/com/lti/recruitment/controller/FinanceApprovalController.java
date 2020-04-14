package com.lti.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.recruitment.models.FinanceApproval;
import com.lti.recruitment.services.IFinanceApprovalService;

@RestController
@RequestMapping(path = "FinanceApproval")
@CrossOrigin
public class FinanceApprovalController {
	@Autowired
	private IFinanceApprovalService service10;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FinanceApproval> viewAllAssembleData() {
		List<FinanceApproval> financeApproval = service10.findAllFinanceApproval();
		System.out.println(financeApproval);
		return financeApproval;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addFinanceApproval(@RequestBody FinanceApproval financeApproval) {
		service10.addFinanceApproval(financeApproval);
		
	}
}
