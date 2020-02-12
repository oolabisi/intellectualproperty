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

import com.intellectualProperty.entities.Agent;
import com.intellectualProperty.entities.UserCompany;
import com.intellectualProperty.entities.dao.AgentDao;
import com.intellectualProperty.entities.dao.UserDAOImpl;

@Sql(scripts= {"classpath:/db/createIPTables.sql"})
@ContextConfiguration("classpath:/intellectualProperty-data-context.xml")
@RunWith(SpringRunner.class)

public class AgentDaoImplTest {
	
	
	private Logger logger = Logger.getLogger(AgentDaoImplTest.class.getName());
	
	@Autowired
	private AgentDao agentDaoImpl;

	@BeforeEach
	public void setUp() throws Exception {
	}

	@Test
	public void findAgentByIdTest() {
		Agent savedAgents = agentDaoImpl.findAgentById(1);
		logger.info(savedAgents.toString());
		assertNotNull(savedAgents);
		assertEquals( "malaysia", savedAgents.getNationality());
		assertNotNull(savedAgents.getFirstName());
	}

}
