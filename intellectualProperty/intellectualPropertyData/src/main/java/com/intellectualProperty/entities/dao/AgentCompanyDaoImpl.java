package com.intellectualProperty.entities.dao;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intellectualProperty.entities.AgentCompany;
import com.intellectualProperty.entities.IPUser;

@Repository
public class AgentCompanyDaoImpl implements AgentCompanyDao {
		@Autowired
		SessionFactory session;
		
		private Logger logger = Logger.getLogger(AgentCompanyDaoImpl.class.getName());

		
		
		
	@Transactional
	public AgentCompany findcompanyById(int id) {
		
		
	Session currentSession = session.getCurrentSession();
	
	logger.info("find the AgentCompanty Id " + id);
	
	AgentCompany requestedAgent = currentSession.find(AgentCompany.class, id);
	
	return requestedAgent;
	
	}
}
