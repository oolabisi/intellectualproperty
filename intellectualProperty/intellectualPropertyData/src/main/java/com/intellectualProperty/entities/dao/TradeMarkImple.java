package com.intellectualProperty.entities.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intellectualProperty.entities.TradeMark;



@Repository
public class TradeMarkImple implements TradeMarkDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	private Logger logger = Logger.getLogger(TradeMarkImple.class.getName());
	
	@Transactional
	public void addTradeMarkDetails(TradeMark trademarkdetails) {
		
		Session currentSession = sessionFactory.getCurrentSession();

		logger.info("Saving trademark details to the database" + trademarkdetails.toString());
		currentSession.save(trademarkdetails);
		
		
	}

}
