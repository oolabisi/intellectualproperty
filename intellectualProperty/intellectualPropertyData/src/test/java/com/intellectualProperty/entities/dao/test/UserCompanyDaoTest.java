/**
 * 
 */
package com.intellectualProperty.entities.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.intellectualProperty.entities.UserCompany;
import com.intellectualProperty.entities.dao.UserCompanyDAO;

/**
 * @author user
 *
 */
@ContextConfiguration("classpath:/intellectualProperty-data-context.xml")
@RunWith(SpringRunner.class)
public class UserCompanyDaoTest {
	
	@Autowired
	private UserCompanyDAO userCompanyDaoImpl;
	
	@Test
	public void findUserCompanyByIdTest() {
		UserCompany savedCompanyUser = userCompanyDaoImpl.findcompanyuserById(1);
		assertNotNull(savedCompanyUser);
		assertEquals("Testing Inc.", savedCompanyUser.getCompanyname());
		assertEquals("info@tester.com", savedCompanyUser.getEmail());
	}

}
