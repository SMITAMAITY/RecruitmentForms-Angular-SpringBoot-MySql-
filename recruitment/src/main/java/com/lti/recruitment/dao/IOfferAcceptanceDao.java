package com.lti.recruitment.dao;

import java.util.List;

import com.lti.recruitment.models.OfferAcceptance;

public interface IOfferAcceptanceDao {
	//Select details
		public List<OfferAcceptance> readAllOfferAcceptanceDetails();
		
		
		//Insert details
		public void createOfferAcceptanceDetails(OfferAcceptance offerAcceptance);
}
