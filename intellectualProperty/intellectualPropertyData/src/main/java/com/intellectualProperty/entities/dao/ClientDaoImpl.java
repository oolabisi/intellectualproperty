package com.intellectualProperty.entities.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.intellectualProperty.entities.Clients;

@Repository
public class ClientDaoImpl implements ClientsDao {

	@Autowired
	private SessionFactory sessionFactory; 
	
	@Transactional
	public Clients findClientById(int clientid) {
		Session session = sessionFactory.getCurrentSession();
		
		Clients requestedClient = session.find(Clients.class, clientid);
		return requestedClient;
	}

}
