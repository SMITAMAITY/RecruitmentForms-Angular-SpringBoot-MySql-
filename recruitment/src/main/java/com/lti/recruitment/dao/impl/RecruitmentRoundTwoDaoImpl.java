package com.lti.recruitment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.recruitment.dao.IRecruitmentRoundTwoDao;
import com.lti.recruitment.models.RecruitmentRoundTwo;

@Repository
public class RecruitmentRoundTwoDaoImpl implements IRecruitmentRoundTwoDao {


	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public RecruitmentRoundTwoDaoImpl() {

	}

	@Override
	public List<RecruitmentRoundTwo> readAllRecruitmentRoundTwo() {
		String jpql = "From RecruitmentRoundTwo";
		TypedQuery<RecruitmentRoundTwo> tquery = entityManager.createQuery(jpql, RecruitmentRoundTwo.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}



	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createRecruitmentRoundTwo(RecruitmentRoundTwo recruitmentRoundTwo) {
		entityManager.persist(recruitmentRoundTwo);
		
	}

}
