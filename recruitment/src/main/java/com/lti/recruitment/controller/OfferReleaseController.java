package com.lti.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.recruitment.models.OfferRelease;
import com.lti.recruitment.services.IOfferReleaseService;

@RestController
@RequestMapping(path = "OfferRelease")
@CrossOrigin
public class OfferReleaseController {
	@Autowired
	private IOfferReleaseService service13;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OfferRelease> viewAllAssembleData() {
		List<OfferRelease> offerRelease = service13.findAllOfferRelease();
		System.out.println(offerRelease);
		return offerRelease;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addOfferRelease(@RequestBody OfferRelease offerRelease) {
		service13.addOfferRelease(offerRelease);
		
	}
}
