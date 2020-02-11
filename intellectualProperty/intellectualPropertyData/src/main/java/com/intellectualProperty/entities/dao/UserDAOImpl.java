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

import com.intellectualProperty.entities.IPUser;

/**
 * @author user
 *
 */
@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	private Logger logger = Logger.getLogger(UserDAOImpl.class.getName());
	
	@Transactional
	public IPUser findIPUserById(int userid) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		IPUser requestedUser = currentSession.find(IPUser.class, userid);
		
		logger.info("Finding IP User with ID " + userid);
		
		return requestedUser;
	}

}
