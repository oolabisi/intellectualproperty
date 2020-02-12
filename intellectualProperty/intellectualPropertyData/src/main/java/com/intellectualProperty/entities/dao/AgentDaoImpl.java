/**
 * 
 */
package com.intellectualProperty.entities.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intellectualProperty.entities.Agent;


/**
 * @author Vincent
 *
 */
@Repository
public class AgentDaoImpl implements AgentDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	private Logger logger = Logger.getLogger(AgentDaoImpl.class.getName());

	@Transactional
	public Agent findAgentById(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Agent requestedAgent = currentSession.find(Agent.class, id);
		
		return requestedAgent;
	}

}
