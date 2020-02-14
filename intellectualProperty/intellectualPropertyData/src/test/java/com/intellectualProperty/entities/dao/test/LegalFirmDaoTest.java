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

import com.intellectualProperty.entities.LegalFirm;
import com.intellectualProperty.entities.dao.LegalFirmDao;

/**
 * @author Oloko
 *
 */
@Sql(scripts= {"classpath:/db/legalFirms.sql"})
@ContextConfiguration("classpath:/intellectualProperty-data-context.xml")
@RunWith(SpringRunner.class)
public class LegalFirmDaoTest {
	
	@Autowired
	private LegalFirmDao legalFirmDaoImpl;
	
	@Test
	public void findUserCompanyByIdTest() {
		LegalFirm savedAgentComp = legalFirmDaoImpl.findcompanyById(1);
		
		assertNotNull(savedAgentComp);
		assertEquals("45 berkley street", savedAgentComp.getAddress());
		assertEquals("delano@delanolegal.com", savedAgentComp.getCompanyEmail());
		
		
	}

	
}
