package com.lti.recruitment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.recruitment.dao.IScreeningTwoDao;
import com.lti.recruitment.models.ScreeningOne;
import com.lti.recruitment.models.ScreeningTwo;

@Repository
public class ScreeningTwoDaoImpl implements IScreeningTwoDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;
	
	public ScreeningTwoDaoImpl() {

	}

	@Override
	public List<ScreeningTwo> readAllScreeningTwoDetails() {
		String jpql = "From ScreeningTwo";
		TypedQuery<ScreeningTwo> tquery = entityManager.createQuery(jpql, ScreeningTwo.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createScreeningTwoDetails(ScreeningTwo screeningTwo) {
		entityManager.persist(screeningTwo);
		
	}

}
