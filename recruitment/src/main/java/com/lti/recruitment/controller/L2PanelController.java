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
import com.lti.recruitment.models.L2Panel;
import com.lti.recruitment.services.IL1PanelSevice;
import com.lti.recruitment.services.IL2PanelService;

@RestController
@RequestMapping(path = "L2Panel")
@CrossOrigin
public class L2PanelController {
	@Autowired
	private IL2PanelService service7;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<L2Panel> viewAllAssembleData() {
		List<L2Panel> l2Panel = service7.findAllL2Panel();
		System.out.println(l2Panel);
		return l2Panel;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addL2Panel(@RequestBody L2Panel l2Panel) {
		service7.addL2Panel(l2Panel);
		
	}
}
