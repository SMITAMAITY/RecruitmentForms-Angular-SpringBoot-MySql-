package com.lti.recruitment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IOfferReleaseDao;
import com.lti.recruitment.models.OfferRelease;
import com.lti.recruitment.services.IOfferReleaseService;

@Service("service13")
public class OfferReleaseServiceImpl implements IOfferReleaseService {
	@Autowired
	private IOfferReleaseDao dao;
	
	
	@Override
	public List<OfferRelease> findAllOfferRelease() {
		return dao.readAllOfferReleaseDetails();
	}

	@Override
	public void addOfferRelease(OfferRelease offerRelease) {
		dao.createOfferReleaseDetails(offerRelease);

}
}
