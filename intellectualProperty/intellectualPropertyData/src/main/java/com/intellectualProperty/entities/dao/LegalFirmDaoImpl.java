package com.intellectualProperty.entities.dao;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intellectualProperty.entities.LegalFirm;
import com.intellectualProperty.entities.IPUser;

@Repository
public class LegalFirmDaoImpl implements LegalFirmDao {
		@Autowired
		SessionFactory session;
		
		private Logger logger = Logger.getLogger(LegalFirmDaoImpl.class.getName());

		
		
		
	@Transactional
	public LegalFirm findcompanyById(int id) {
		
		
	Session currentSession = session.getCurrentSession();
	
	logger.info("find the AgentCompanty Id " + id);
	
	LegalFirm requestedAgent = currentSession.find(LegalFirm.class, id);
	
	return requestedAgent;
	
	}
}
