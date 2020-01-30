package com.intellectualpropertyentities.dao;

import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.intellectualproperty.entities.RegistrationDetailTb;

@Repository
public class RegDeatailTBDaoImplementation {
	
private Logger logger = Logger.getLogger(RegDeatailTBDaoImplementation.class.getName());
	
	SessionFactory sessionFactory;

	@Transactional
	public void saveTradeMark(RegistrationDetailTb regDetails) {
		
	logger.info("getting current trasaction");
	Session currentSession = sessionFactory.getCurrentSession();
	
	logger.info("saving Trademarkuser in the database" + regDetails.toString());
	currentSession.save(regDetails);
		
	}
	
}
