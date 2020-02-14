package com.intellectualProperty.db.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import org.jboss.logging.Logger;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.intellectualProperty.entities.Clients;
import com.intellectualProperty.entities.dao.ClientsDao;

@Sql(scripts= {"classpath:/db/createClientTable.sql"})
@ContextConfiguration("classpath:/intellectualProperty-data-context.xml")
@RunWith(SpringRunner.class)

public class ClientsDaoTest {

	@Autowired
	private ClientsDao clientDaoImpl;
	
	private Logger logger = Logger.getLogger(ClientsDaoTest.class.getName());
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void findByIdTest() {
		Clients savedClient = clientDaoImpl.findClientById(1);
		//logger.info(savedUser.toString());
		assertNotNull(savedClient);
//		assertEquals("Tester", savedUser.getLastName());
//		assertEquals("test@tester.com", savedUser.getEmail());
//		assertNotNull(savedUser.getUsercompanies());

}
	
}
