package com.intellectualProperty.entities;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usercompany")
public class UserCompany {
	
	@Id
	@Column(name = "usercompanyid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int usercompanyid;
	
	@Column(name = "companyname")
	private String companyname;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;
	
	@ManyToOne
	@JoinColumn(name = "ip_userid")
	private IPUser ipUsers;
	
	
	
	public UserCompany() {}

	public UserCompany(String companyname, String address, String email, String phone) {
		
		this.companyname = companyname;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public int getUsercompanyid() {
		return usercompanyid;
	}

	public void setUsercompanyid(int usercompanyid) {
		this.usercompanyid = usercompanyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public IPUser getIpUsers() {
		return ipUsers;
	}

	public void setIpUsers(IPUser ipUsers) {
		this.ipUsers = ipUsers;
	}

	@Override
	public String toString() {
		StringBuilder stringRep = new StringBuilder("CompanyUser [id=");
		stringRep.append(this.getUsercompanyid());
		stringRep.append(", companyname=");
		stringRep.append(this.getCompanyname());
		stringRep.append(", email=");
		stringRep.append(this.getEmail());
		stringRep.append(", address=");
		stringRep.append(this.getAddress());
		stringRep.append(", phone=");
		stringRep.append(this.getPhone());
		stringRep.append("]");
		
		return stringRep.toString();
	
	
	}	

}
