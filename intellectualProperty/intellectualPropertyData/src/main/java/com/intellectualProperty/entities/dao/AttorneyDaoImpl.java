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

import com.intellectualProperty.entities.Attorney;


/**
 * @author Vincent
 *
 */
@Repository
public class AttorneyDaoImpl implements AttorneyDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	private Logger logger = Logger.getLogger(AttorneyDaoImpl.class.getName());

	@Transactional
	public Attorney findAttorneyById(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Attorney requestedAgent = currentSession.find(Attorney.class, id);
		
		return requestedAgent;
	}

}
