package com.lti.recruitment.services;

import java.util.List;

import com.lti.recruitment.models.OfferAcceptance;

public interface IOfferAcceptanceService {
	public  List<OfferAcceptance> findAllOfferAcceptance();
	
	
	public void addOfferAcceptance(OfferAcceptance offerAcceptance);
}
