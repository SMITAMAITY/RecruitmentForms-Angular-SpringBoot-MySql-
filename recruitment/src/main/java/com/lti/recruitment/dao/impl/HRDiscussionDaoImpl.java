package com.lti.recruitment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.recruitment.dao.IHRDiscussionDao;
import com.lti.recruitment.models.HRDiscussion;

@Repository
public class HRDiscussionDaoImpl implements IHRDiscussionDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public HRDiscussionDaoImpl() {

	}

	
	@Override
	public List<HRDiscussion> readAllHRDiscussionDetails() {
		String jpql = "From HRDiscussion";
		TypedQuery<HRDiscussion> tquery = entityManager.createQuery(jpql, HRDiscussion.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createHRDiscussionDetails(HRDiscussion hrDiscussion) {
		entityManager.persist(hrDiscussion);
		
	}

}
