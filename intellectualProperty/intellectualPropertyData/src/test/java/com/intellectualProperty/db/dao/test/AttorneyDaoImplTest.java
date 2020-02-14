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

import com.intellectualProperty.entities.Attorney;
import com.intellectualProperty.entities.UserCompany;
import com.intellectualProperty.entities.dao.AttorneyDao;
import com.intellectualProperty.entities.dao.UserDAOImpl;

@Sql(scripts= {"classpath:/db/createIPTables.sql"})
@ContextConfiguration("classpath:/intellectualProperty-data-context.xml")
@RunWith(SpringRunner.class)

public class AttorneyDaoImplTest {
	
	
	private Logger logger = Logger.getLogger(AttorneyDaoImplTest.class.getName());
	
	@Autowired
	private AttorneyDao attorneyDaoImpl;

	@BeforeEach
	public void setUp() throws Exception {
	}

	@Test
	public void findAttorneyByIdTest() {
		Attorney savedAgents = attorneyDaoImpl.findAttorneyById(1);
		logger.info(savedAgents.toString());
		assertNotNull(savedAgents);
		assertEquals( "malaysia", savedAgents.getNationality());
		assertNotNull(savedAgents.getFirstName());
	}

}
