package com.intellectualProperty.service;

import static org.junit.Assert.*;



import static org.mockito.Mockito.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.intellectualProperty.entities.TradeMark;
import com.intellectualProperty.tradeMark.service.TradeMarkService;
import com.intellectualProperty.tradeMark.service.TradeMarkServiceImplemetation;

/**
 * @author vincent
 *
 */

@ContextConfiguration("classpath:/intellectualProperty-service-context.xml")
@RunWith(SpringRunner.class)
public class TradeMarkServiceImpleTest {
	
	@Mock
	private TradeMarkServiceImplemetation  trademarkService;

	@Before
	public void setUp() throws Exception {
		
		trademarkService = mock(TradeMarkServiceImplemetation.class);
	}

	@Test
	public void tradeMarkDetailsExistTest() {
		assertNotNull(TradeMarkServiceImplemetation.class);
	}

	@Test
	public void addTradeMarkDetailsServiceTest() {
		
		TradeMark tradeMark = new TradeMark("Yoris Global limited","22 alhaji muyili street oregun",
				07011355272,"okengwuchidi@gmail",
				"nigeria",3,"phameceutical goods", 
				"chidiebere vincent",
				"total gospel off odili road",07011355272,
				"v.okengwu@semicolon.africa",
				"China","14-03-1995");
	
		doNothing().when(trademarkService).addTradeMarkDetails(isA(TradeMark.class));
		trademarkService.addTradeMarkDetails(tradeMark);
		
		verify(trademarkService, times(1)).addTradeMarkDetails(tradeMark);
	
	}


}
