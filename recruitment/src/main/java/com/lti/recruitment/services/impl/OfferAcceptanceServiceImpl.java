package com.lti.recruitment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.recruitment.dao.IOfferAcceptanceDao;
import com.lti.recruitment.models.OfferAcceptance;
import com.lti.recruitment.services.IOfferAcceptanceService;

@Service("service14")
public class OfferAcceptanceServiceImpl implements IOfferAcceptanceService {
	@Autowired
	private IOfferAcceptanceDao dao;

	@Override
	public List<OfferAcceptance> findAllOfferAcceptance() {
		return dao.readAllOfferAcceptanceDetails();
	}

	@Override
	public void addOfferAcceptance(OfferAcceptance offerAcceptance) {
		dao.createOfferAcceptanceDetails(offerAcceptance);
		
	}

}
