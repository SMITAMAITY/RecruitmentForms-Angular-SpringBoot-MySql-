package com.lti.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.recruitment.models.OfferAcceptance;
import com.lti.recruitment.services.IOfferAcceptanceService;

@RestController
@RequestMapping(path = "OfferAcceptance")
@CrossOrigin
public class OfferAcceptanceController {
	@Autowired
	private IOfferAcceptanceService service14;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OfferAcceptance> viewAllAssembleData() {
		List<OfferAcceptance> offerAcceptance = service14.findAllOfferAcceptance();
		System.out.println(offerAcceptance);
		return offerAcceptance;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addOfferAcceptance(@RequestBody OfferAcceptance offerAcceptance) {
		service14.addOfferAcceptance(offerAcceptance);
		
	}
}
