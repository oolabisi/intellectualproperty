package com.intellectualproperty.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "regdetailtb")
public class RegistrationDetailTb {

	@Id
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="UserTB_userID")
	private UserTB id;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "nameOfTradeMark")
	private String nameOfTradeMark;
	
	@Column(name = "dateOfReg")
	private Date dateOfRegistration;
	
	@Column(name = "classOfTradeMark")
	private String classOfTradeMark;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "nationality")
	private String nationality;
	
	
	
	@Column(name = "officeAddress")
	private String officeAddress;
	
	@Column(name = "postOf-box")
	private String postOfBox;

	public RegistrationDetailTb(String companyName, String trademarkPurpose, Date dateOfRegistration,
			String trademarkLogoOrName, int trademarkNumber, String email, String nationality,
			String homeAddress, String postOfBox) {
		super();
		this.companyName = companyName;
		this.nameOfTradeMark = trademarkPurpose;
		this.dateOfRegistration = dateOfRegistration;
		this.classOfTradeMark = trademarkLogoOrName;
	
		this.email = email;
		this.nationality = nationality;

		this.officeAddress = homeAddress;
		this.postOfBox = postOfBox;
	}

	
	public UserTB getId() {
		return this.id;
	}

	public void setId(UserTB id) {
		this.id = id;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTrademarkPurpose() {
		return nameOfTradeMark;
	}

	public void setTrademarkPurpose(String trademarkPurpose) {
		this.nameOfTradeMark = trademarkPurpose;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public String getTrademarLogoOrName() {
		return classOfTradeMark;
	}

	public void setClassOfTradeMark(String classOfTradeMark) {
		this.classOfTradeMark = classOfTradeMark;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getPostOfBox() {
		return postOfBox;
	}

	public void setPostOfBox(String postOfBox) {
		this.postOfBox = postOfBox;
	}

	@Override
	public String toString() {
		return "TradeMarkTB [companyName=" + companyName + ", trademarkPurpose=" + nameOfTradeMark
				+ ", dateOfRegistration=" + dateOfRegistration + ", classOfTradeMark=" + classOfTradeMark
				+ ", trademarkNumber=" +  ", email=" + email + ", nationality=" + nationality
				+ ", profession=" +  ", officeAddress=" + officeAddress + ", postOfBox=" + postOfBox + "]";
	}

	
	
	
	
}
