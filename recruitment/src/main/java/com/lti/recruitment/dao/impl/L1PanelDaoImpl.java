package com.lti.recruitment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.recruitment.dao.IL1PanelDao;
import com.lti.recruitment.models.DemandDetails;
import com.lti.recruitment.models.L1Panel;

@Repository
public class L1PanelDaoImpl implements IL1PanelDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public L1PanelDaoImpl() {

	}
	
	@Override
	public List<L1Panel> readAllL1PanelDetails() {
		String jpql = "From L1Panel";
		TypedQuery<L1Panel> tquery = entityManager.createQuery(jpql, L1Panel.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createDemandDetails(L1Panel l1Panel) {
		entityManager.persist(l1Panel);	
	}

}
