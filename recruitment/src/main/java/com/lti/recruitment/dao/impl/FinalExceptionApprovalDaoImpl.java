package com.lti.recruitment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.recruitment.dao.IFinalExceptionApprovalDao;
import com.lti.recruitment.models.FinalExceptionApproval;

@Repository
public class FinalExceptionApprovalDaoImpl implements IFinalExceptionApprovalDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public FinalExceptionApprovalDaoImpl() {

	}

	@Override
	public List<FinalExceptionApproval> readAllFinalExceptionApprovalDetails() {
		String jpql = "From FinalExceptionApproval";
		TypedQuery<FinalExceptionApproval> tquery = entityManager.createQuery(jpql, FinalExceptionApproval.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createFinalExceptionApprovalDetails(FinalExceptionApproval finalExceptionApproval) {
		entityManager.persist(finalExceptionApproval);
		
	}

}
