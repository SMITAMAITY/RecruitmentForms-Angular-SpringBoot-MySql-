package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.OfferRelease;

public interface IOfferReleaseService {
	public  List<OfferRelease> findAllOfferRelease();
	
	
	public void addOfferRelease(OfferRelease offerRelease);
}
