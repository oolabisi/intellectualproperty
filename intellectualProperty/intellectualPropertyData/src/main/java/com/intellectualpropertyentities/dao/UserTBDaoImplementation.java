package com.intellectualpropertyentities.dao;

import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.intellectualproperty.entities.UserTB;


@Repository
public class UserTBDaoImplementation {

	
	private Logger logger = Logger.getLogger(UserTBDaoImplementation.class.getName());


	@Autowired
	private SessionFactory sessionFactory;


	@Transactional
	public void saveUsers(UserTB user) {
		logger.info("getting current trasaction");
		Session currentSession = sessionFactory.getCurrentSession();	
		
		
		logger.info("saving users in the database" + user.toString());
		currentSession.save(user);
	
	}
}
