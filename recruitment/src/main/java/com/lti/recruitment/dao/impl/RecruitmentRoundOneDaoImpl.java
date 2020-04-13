package com.lti.recruitment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.recruitment.dao.IRecruitmentRoundOneDao;
import com.lti.recruitment.models.RecruitmentRoundOne;

@Repository
public class RecruitmentRoundOneDaoImpl implements IRecruitmentRoundOneDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public RecruitmentRoundOneDaoImpl() {

	}

	
	@Override
	public List<RecruitmentRoundOne> readAllRecruitmentRoundOne() {
		String jpql = "From RecruitmentRoundOne";
		TypedQuery<RecruitmentRoundOne> tquery = entityManager.createQuery(jpql, RecruitmentRoundOne.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createRecruitmentRoundOne(RecruitmentRoundOne recruitmentRoundOne) {
		entityManager.persist(recruitmentRoundOne);
		
	}

}
