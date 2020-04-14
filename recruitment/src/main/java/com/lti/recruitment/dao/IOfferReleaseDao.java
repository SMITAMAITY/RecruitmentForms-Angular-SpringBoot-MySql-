package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.OfferRelease;

public interface IOfferReleaseDao {
	//Select details
	public List<OfferRelease> readAllOfferReleaseDetails();
	
	
	//Insert details
	public void createOfferReleaseDetails(OfferRelease offerRelease);
}
