package com.lti.recruitment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.recruitment.dao.IScreeningOneDao;
import com.lti.recruitment.models.ScreeningOne;

@Repository
public class ScreeningOneDaoImpl implements IScreeningOneDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;
	
	public ScreeningOneDaoImpl() {

	}
	@Override
	public List<ScreeningOne> readAllScreeningOneDetails() {
		String jpql = "From ScreeningOne";
		TypedQuery<ScreeningOne> tquery = entityManager.createQuery(jpql, ScreeningOne.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}
	
	@Override
	public void createScreeningOneDetails(ScreeningOne screeningOne) {
		entityManager.persist(screeningOne);
		
	}

	
	
}
