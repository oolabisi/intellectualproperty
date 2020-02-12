/**
 * 
 */
package com.intellectualProperty.entities.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.intellectualProperty.entities.AgentCompany;
import com.intellectualProperty.entities.dao.AgentCompanyDao;

/**
 * @author Oloko
 *
 */
@Sql(scripts= {"classpath:/db/agentCompanyTable.sql"})
@ContextConfiguration("classpath:/intellectualProperty-data-context.xml")
@RunWith(SpringRunner.class)
public class AgentCompanyDaoTest {
	
	@Autowired
	private AgentCompanyDao agentCompanyDaoImpl;
	
	@Test
	public void findUserCompanyByIdTest() {
		AgentCompany savedAgentComp = agentCompanyDaoImpl.findcompanyById(1);
		
		assertNotNull(savedAgentComp);
		assertEquals("45 berkley street", savedAgentComp);
		assertEquals("delano@delanolegal.com", savedAgentComp.getCompanyEmail());
		
		
	}

	
}
