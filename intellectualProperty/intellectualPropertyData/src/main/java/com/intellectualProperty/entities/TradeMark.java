package com.intellectualProperty.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trademarkapplication")
public class TradeMark {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="trademarkID")
	private int tradeMarkId;
	
	@Column(name = "applicantName")
	private String applicantName;
	
	@Column(name = "applicantAddress")
	private String  applicantAddress;
	
	@Column(name = "applicantPhoneNumber")
	private int   applicantPhoneNumber;
	
	@Column(name = "applicantEmail")
	private  String  applicantEmail;
	
	@Column(name = "applicantNationality")
	private String   applicantNationality;
	
	@Column(name = "classOfTrademark")
	private int  trademarkClass;
	
	@Column(name = "descriptionOfGoodsService")
	private String descriptionOfGoodsService;
	
	@Column(name = "attorneyName")
	private String attorneyName;
	
	@Column(name = "attorneyAddress")
	private String attorneyAddress;
	
	@Column(name = "attorneyPhoneNumber")
	private int  attorneyPhoneNumber;
	
	@Column(name = "attorneyEmail")
	private String attorneyEmail;
	
	@Column(name = "attorneyNationality")
	private String attorneyNationality;
	
	@Column(name = "applicationDate")
	private String  applicationDate;
	
	
	public TradeMark() {
		
	}
	

	public TradeMark(String applicantName, String applicantAddress, int applicanPhoneNumber, String applicantEmail,
			String applicantNationality, int trademarkClass, String descriptionOfGoodsService, String attorneyName,
			String attorneyAddress, int attorneyPhoneNumber, String attorneyEmail, String attorneyNationality,
			String application_date) {
		
		this.applicantName = applicantName;
		this.applicantAddress = applicantAddress;
		this.applicantPhoneNumber = applicanPhoneNumber;
		this.applicantEmail = applicantEmail;
		this.applicantNationality = applicantNationality;
		this.trademarkClass = trademarkClass;
		this.descriptionOfGoodsService = descriptionOfGoodsService;
		this.attorneyName = attorneyName;
		this.attorneyAddress = attorneyAddress;
		this.attorneyPhoneNumber = attorneyPhoneNumber;
		this.attorneyEmail = attorneyEmail;
		this.attorneyNationality = attorneyNationality;
		this.applicationDate = application_date;
	}

	


	public int getTradeMarkId() {
		return tradeMarkId;
	}

	public void setTradeMarkId(int tradeMarkId) {
		this.tradeMarkId = tradeMarkId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public int getApplicantPhoneNumber() {
		return applicantPhoneNumber;
	}

	public void setApplicantPhoneNumber(int applicanPhoneNumber) {
		this.applicantPhoneNumber = applicanPhoneNumber;
	}

	public String getApplicantEmail() {
		return applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}

	public String getApplicantNationality() {
		return applicantNationality;
	}

	public void setApplicantNationality(String applicantNationality) {
		this.applicantNationality = applicantNationality;
	}

	public int getTrademarkClass() {
		return trademarkClass;
	}

	public void setTrademarkClass(int trademarkClass) {
		this.trademarkClass = trademarkClass;
	}

	public String getDescriptionOfGoodsService() {
		return descriptionOfGoodsService;
	}

	public void setDescriptionOfGoodsService(String descriptionOfGoodsService) {
		this.descriptionOfGoodsService = descriptionOfGoodsService;
	}

	public String getAttorneyName() {
		return attorneyName;
	}

	public void setAttorneyName(String attorneyName) {
		this.attorneyName = attorneyName;
	}

	public String getAttorneyAddress() {
		return attorneyAddress;
	}

	public void setAttorneyAddress(String attorneyAddress) {
		this.attorneyAddress = attorneyAddress;
	}

	public int getAttorneyPhoneNumber() {
		return attorneyPhoneNumber;
	}

	public void setAttorneyPhoneNumber(int attorneyPhoneNumber) {
		this.attorneyPhoneNumber = attorneyPhoneNumber;
	}

	public String getAttorneyEmail() {
		return attorneyEmail;
	}

	public void setAttorneyEmail(String attorneyEmail) {
		this.attorneyEmail = attorneyEmail;
	}

	public String getAttorneyNationality() {
		return attorneyNationality;
	}

	public void setAttorneyNationality(String attorneyNationality) {
		this.attorneyNationality = attorneyNationality;
	}

	public String getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(String application_date) {
		this.applicationDate = application_date;
	}
	
	
	
	

	@Override
	public String toString() {
		return "TradeMark [applicantName=" + applicantName + ", applicantAddress=" + applicantAddress
				+ ", applicanPhoneNumber=" + applicantPhoneNumber + ", applicantEmail=" + applicantEmail
				+ ", applicantNationality=" + applicantNationality + ", trademarkClass=" + trademarkClass
				+ ", descriptionOfGoodsService=" + descriptionOfGoodsService + ", attorneyName=" + attorneyName
				+ ", attorneyAddress=" + attorneyAddress + ", attorneyPhoneNumber=" + attorneyPhoneNumber
				+ ", attorneyEmail=" + attorneyEmail + ", attorneyNationality=" + attorneyNationality
				+ ", application_date=" + applicationDate + "]";
	}
	
	
	
	
	
	
	
	
	

}
