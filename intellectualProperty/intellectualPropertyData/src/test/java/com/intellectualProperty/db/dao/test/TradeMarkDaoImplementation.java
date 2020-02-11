package com.intellectualProperty.db.dao.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.intellectualProperty.db.DBConnectionManagerTest;
import com.intellectualProperty.entities.TradeMark;
import com.intellectualProperty.entities.dao.TradeMarkDao;
import com.mchange.v2.c3p0.ComboPooledDataSource;


@ContextConfiguration("classpath:/intellectualProperty-data-context.xml")
@RunWith(SpringRunner.class)
public class TradeMarkDaoImplementation {
	
	private Logger logger = Logger.getLogger(TradeMarkDaoImplementation.class.getName());
	
	@Autowired
	private TradeMarkDao trademarkDaoImpl;

	@Autowired
	private ComboPooledDataSource dataSource;

	@Autowired
	private SessionFactory sessionFactory;



	@Before
	public void setUp() throws Exception {
//		
//		String username = "root";
//		
//		String password = "@Bonsay12345";
//		
//		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
//		
//		String DBUrl = "jdbc:mysql://localhost:3306/intellectualproperty?useSSL=false&serverTimezone=UTC";
//		
//		Connection conn = null;
//		
//		QueryRunner queryRunner = new QueryRunner(dataSource);
//		
//		try {
//			
//		
//			DbUtils.loadDriver(jdbcDriver);
//			
//			conn = DriverManager.getConnection(DBUrl, username, password);
//			
//			
//		}
//		catch(Exception e) {
//			
//			logger.throwing(TradeMarkDaoImplementation.class.getName(), "setUp() method",e.getCause());
//			
//			e.printStackTrace();
//			
//		}
//		finally {
//			
//			DbUtils.close(conn);
//		}
//				
		


	}

	@Test
	public void dbManagerClassesInitializedTest() {
		
		assertNotNull(trademarkDaoImpl);
		assertNotNull(dataSource);
		assertNotNull(sessionFactory);
	}




@Test
public void addEmployeeToDatabaseTest() {

try {	
		logger.info("Creating new tradeMark details");
		
		TradeMark tempDetails = new TradeMark("obingwu investment limited","22 alhaji muyili street oregun",
				07011355272,"okengwuchidiebere@yahoo.com",
				"nigeria",3,"phameceutical goods", 
				"chidi vincent",
				"total gospel off odili road",07011355272,
				"v.okengwu@semicolonafrica",
				"nigeria","14-03-1993");
		
		logger.info("Storing details to the database");
		trademarkDaoImpl.addTradeMarkDetails(tempDetails);
		
		logger.info("Successfully saving trademark details to the databsase");
		
}
catch(Exception e) {

	e.printStackTrace();
	logger.warning("Error saving trademark details to the dataabse");
}

	
}
}




	
	




