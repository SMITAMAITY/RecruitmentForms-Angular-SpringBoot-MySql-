package com.lti.recruitment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.recruitment.dao.IFinanceApprovalDao;
import com.lti.recruitment.models.DemandDetails;
import com.lti.recruitment.models.FinanceApproval;

@Repository
public class FinanceApprovalDaoImpl implements IFinanceApprovalDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public FinanceApprovalDaoImpl() {

	}
	
	@Override
	public List<FinanceApproval> readAllFinanceApprovalDetails() {
		String jpql = "From FinanceApproval";
		TypedQuery<FinanceApproval> tquery = entityManager.createQuery(jpql, FinanceApproval.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createFinanceApprovalDetails(FinanceApproval financeApproval) {
		entityManager.persist(financeApproval);
		
	}

}
