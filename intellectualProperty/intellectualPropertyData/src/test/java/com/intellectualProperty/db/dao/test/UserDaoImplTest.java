package com.intellectualProperty.db.dao.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.intellectualProperty.entities.IPUser;
import com.intellectualProperty.entities.dao.TradeMarkDao;
import com.intellectualProperty.entities.dao.UserDAO;
import com.mchange.v2.c3p0.ComboPooledDataSource;


@Sql(scripts= {"classpath:/db/intellectualproperty.sql", "classpath:/db/testData.sql"})
@ContextConfiguration("classpath:/intellectualProperty-data-context.xml")
@RunWith(SpringRunner.class)
public class UserDaoImplTest {
	
	private Logger logger = Logger.getLogger(UserDaoImplTest.class.getName());
	
	@Autowired
	private TradeMarkDao trademarkDaoImpl;

	@Autowired
	private ComboPooledDataSource dataSource;

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private UserDAO userDaoImpl;


	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void dbManagerClassesInitializedTest() {
		
		assertNotNull(trademarkDaoImpl);
		assertNotNull(dataSource);
		assertNotNull(sessionFactory);
	}
	
	@Test
	public void findByIdTest() {
		
		IPUser savedUser = userDaoImpl.findIPUserById(1);
		
		logger.info(savedUser + "Found user in the database");
	}





}




	
	




