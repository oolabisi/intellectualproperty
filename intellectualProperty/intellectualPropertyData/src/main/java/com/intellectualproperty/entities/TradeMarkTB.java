package com.intellectualproperty.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "trademarktb")
public class TradeMarkTB {

	@Id
	@Column
	private int tradeMarkNum;

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="REGDETAILTB_nameOfTradeMark")
	private String RegDetailTBNameOfTradeMark;
	
	
	
	public int getTradeMarkNum() {
		return tradeMarkNum;
	}
	public void setTradeMarkNum(int tradeMarkNum) {
		this.tradeMarkNum = tradeMarkNum;
	}
	public String getRegDetailTBNameOfTradeMark() {
		return RegDetailTBNameOfTradeMark;
	}
	public void setRegDetailTBNameOfTradeMark(String regDetailTBNameOfTradeMark) {
		RegDetailTBNameOfTradeMark = regDetailTBNameOfTradeMark;
	}
	public TradeMarkTB(int tradeMarkNum, String regDetailTBNameOfTradeMark) {
		this.tradeMarkNum = tradeMarkNum;
		RegDetailTBNameOfTradeMark = regDetailTBNameOfTradeMark;
	}
	@Override
	public String toString() {
		return "TradeMarkTB [tradeMarkNum=" + tradeMarkNum + ", RegDetailTBNameOfTradeMark="
				+ RegDetailTBNameOfTradeMark + "]";
	}
	
	
	
	




}
