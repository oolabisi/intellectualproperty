package com.intellectualProperty.db;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;


@ContextConfiguration("classpath:/intellectualProperty-data-context.xml")
@RunWith(SpringRunner.class)
public class DBConnectionManagerTest {

	
	private Logger logger = Logger.getLogger(DBConnectionManagerTest.class.getName());
	
	
	@Autowired
	private ComboPooledDataSource dataSource;
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void dataSourceInitializedTest() {
		
		assertNotNull(dataSource);
	}
	


	
	@Test
	public void dbConnectionManagerExistTest() throws SQLException {
		
		String user = "ip";
		String password = "@Bonsay12345";
		String jdbcUrl = "jdbc:mysql://localhost:3306/intellectualproperty?useSSL=false&serverTimezone=UTC";
	
		try {
			
			
			logger.info("Getting connection to the database");
			
			Connection mycon = DriverManager.getConnection(jdbcUrl, user, password);
			
			logger.info("Connection to the database successful" + jdbcUrl);
			
			assertNotNull(mycon);
			
		}
		catch(SQLException e) {
			
			logger.warning("Error connecting to the database");
		}
		
		
	}






}
