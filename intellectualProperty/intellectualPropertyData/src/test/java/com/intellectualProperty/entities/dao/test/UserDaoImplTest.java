package com.intellectualProperty.entities.dao.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.intellectualProperty.entities.IPUser;
import com.intellectualProperty.entities.dao.UserDAO;


@Sql(scripts= {"classpath:/db/intellectualproperty.sql", "classpath:/db/testData.sql"})
@ContextConfiguration("classpath:/intellectualProperty-data-context.xml")
@RunWith(SpringRunner.class)
public class UserDaoImplTest {
	
	private Logger logger = Logger.getLogger(UserDaoImplTest.class.getName());
	
	@Autowired
	private UserDAO userDaoImpl;

	@Before
	public void setUp() throws Exception {

	}
	
	@Test
	public void findByIdTest() {
		IPUser savedUser = userDaoImpl.findIPUserById(1);
		logger.info(savedUser.toString());
		assertNotNull(savedUser);
		assertEquals("Tester", savedUser.getLastName());
		assertEquals("test@tester.com", savedUser.getEmail());
		assertNotNull(savedUser.getUsercompanies());
		
		
	}
}
	
	




