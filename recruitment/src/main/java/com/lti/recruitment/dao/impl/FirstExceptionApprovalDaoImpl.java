package com.lti.recruitment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.recruitment.dao.IFirstExceptionApprovalDao;
import com.lti.recruitment.models.FirstExceptionApproval;

@Repository
public class FirstExceptionApprovalDaoImpl implements IFirstExceptionApprovalDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public FirstExceptionApprovalDaoImpl() {

	}


	@Override
	public List<FirstExceptionApproval> readAllFirstExceptionApprovalDetails() {
		String jpql = "From FirstExceptionApproval";
		TypedQuery<FirstExceptionApproval> tquery = entityManager.createQuery(jpql, FirstExceptionApproval.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createFirstExceptionApprovalDetails(FirstExceptionApproval firstExceptionApproval) {
		entityManager.persist(firstExceptionApproval);
		
	}

}
