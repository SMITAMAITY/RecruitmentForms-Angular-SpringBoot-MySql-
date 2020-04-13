package com.lti.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.recruitment.models.L1Panel;
import com.lti.recruitment.services.IL1PanelSevice;

@RestController
@RequestMapping(path = "L1Panel")
@CrossOrigin
public class L1PanelController {
	@Autowired
	private IL1PanelSevice service6;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<L1Panel> viewAllAssembleData() {
		List<L1Panel> l1Panel = service6.findAllL1Panel();
		System.out.println(l1Panel);
		return l1Panel;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addL1Panel(@RequestBody L1Panel l1Panel) {
		service6.addL1Panel(l1Panel);
		
	}
}
