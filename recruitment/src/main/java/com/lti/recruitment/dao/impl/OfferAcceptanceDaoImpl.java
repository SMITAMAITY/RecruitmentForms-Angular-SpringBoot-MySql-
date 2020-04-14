package com.lti.recruitment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.recruitment.dao.IOfferAcceptanceDao;
import com.lti.recruitment.models.OfferAcceptance;

@Repository
public class OfferAcceptanceDaoImpl implements IOfferAcceptanceDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public OfferAcceptanceDaoImpl() {

	}

	@Override
	public List<OfferAcceptance> readAllOfferAcceptanceDetails() {
		String jpql = "From OfferAcceptance";
		TypedQuery<OfferAcceptance> tquery = entityManager.createQuery(jpql, OfferAcceptance.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createOfferAcceptanceDetails(OfferAcceptance offerAcceptance) {
		entityManager.persist(offerAcceptance);
		
	}

}
