package com.intellectualProperty.tradeMark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intellectualProperty.entities.TradeMark;
import com.intellectualProperty.tradeMark.service.TradeMarkService;

@CrossOrigin(origins = { "http://localhost:8080" })
@RestController

public class TradeMarkController {
	
	@Autowired
	private TradeMarkService trademarkService;
	
	
	@PostMapping("/trademark")
	public TradeMark addTradeMarkDetails(@RequestBody TradeMark tempTradeMarkDetails) {
		
		trademarkService.addTradeMarkDetails(tempTradeMarkDetails);
		
		return tempTradeMarkDetails;
		
	}
	
	
}