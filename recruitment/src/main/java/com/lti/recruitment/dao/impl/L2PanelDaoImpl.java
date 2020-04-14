package com.lti.recruitment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.recruitment.dao.IL2PanelDao;
import com.lti.recruitment.models.L2Panel;

@Repository
public class L2PanelDaoImpl implements IL2PanelDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public L2PanelDaoImpl() {

	}

	@Override
	public List<L2Panel> readAllL2PanelDetails() {
		String jpql = "From L2Panel";
		TypedQuery<L2Panel> tquery = entityManager.createQuery(jpql, L2Panel.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}



	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createL2PanelDetails(L2Panel l2Panel) {
		entityManager.persist(l2Panel);
		
	}

}
