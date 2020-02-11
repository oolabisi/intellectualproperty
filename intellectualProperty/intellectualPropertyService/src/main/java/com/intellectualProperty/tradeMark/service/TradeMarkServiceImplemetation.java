package com.intellectualProperty.tradeMark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellectualProperty.entities.TradeMark;
import com.intellectualProperty.entities.dao.TradeMarkDao;

@Service
public class TradeMarkServiceImplemetation implements TradeMarkService {

	@Autowired
	private TradeMarkDao trademarkimpl;
	
	public void addTradeMarkDetails(TradeMark trademarkDetails) {
	
		trademarkimpl.addTradeMarkDetails(trademarkDetails);
	}

}
