package com.intellectualProperty.entities.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intellectualProperty.entities.IPUser;
import com.intellectualProperty.entities.UserCompany;

@Repository
public class UserCompanyDaoImpl implements UserCompanyDAO{

	
	@Autowired
	SessionFactory sessionfactory;
	
	private Logger logger = Logger.getLogger(UserCompanyDaoImpl.class.getName());


	@Transactional
	public UserCompany findcompanyuserById(int id) {
		Session currentSession = sessionfactory.getCurrentSession();
		
		UserCompany requestedUser = currentSession.find(UserCompany.class, id);
		//return ;
		return requestedUser;
	

	}
		
	}


	
