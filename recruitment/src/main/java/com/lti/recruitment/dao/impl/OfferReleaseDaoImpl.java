package com.lti.recruitment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.recruitment.dao.IOfferReleaseDao;
import com.lti.recruitment.models.OfferRelease;

@Repository
public class OfferReleaseDaoImpl implements IOfferReleaseDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public OfferReleaseDaoImpl() {

	}


	@Override
	public List<OfferRelease> readAllOfferReleaseDetails() {
		String jpql = "From OfferRelease";
		TypedQuery<OfferRelease> tquery = entityManager.createQuery(jpql, OfferRelease.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createOfferReleaseDetails(OfferRelease offerRelease) {
		entityManager.persist(offerRelease);
		
	}

}
