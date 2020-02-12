package com.intellectualProperty.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "agentcompany")
public class AgentCompany {
	
	@Id
	@Column(name = "companyid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int agentCompanyId;
	
	@Column(name = "companyname")
	private String companyName;
	
	@Column(name = "companyaddress")
	private String companyAddress;
	
	@Column(name = "companyemail")
	private String companyEmail;
	
	@Column(name = "companyphonenumber")
	private String companyPhoneNumber;
	
	
	@OneToMany
	@JoinColumn(name = "agent_userid")
	private List<Attorney> attorneies;
	



	public AgentCompany() {
		
	  }


	public AgentCompany(String companyName, String companyAddress, String companyEmail, String companyPhoneNumber) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyEmail = companyEmail;
		this.companyPhoneNumber = companyPhoneNumber;
		}


	public int getAgentCompanyId() {
		return agentCompanyId;
	}


	public void setAgentCompanyId(int agentCompanyId) {
		this.agentCompanyId = agentCompanyId;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getAddress() {
		return companyAddress;
	}


	public void setAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}


	public String getCompanyEmail() {
		return companyEmail;
	}


	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}


	public String getCompanyPhoneNumber() {
		return companyPhoneNumber;
	}


	public void setCompanyPhoneNumber(String companyPhoneNumber) {
		this.companyPhoneNumber = companyPhoneNumber;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}


	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}


	public List<Attorney> getAgents() {
		return attorneies;
	}


	public void setAgents(List<Attorney> attorneies) {
		this.attorneies = attorneies;
	}

	@Override
	public String toString() {
		StringBuilder requestedString = new StringBuilder();
		
		requestedString.append("[agentCompanyId=");
		requestedString.append( agentCompanyId);
		requestedString.append(", companyName=");
		requestedString.append(companyName);
		requestedString.append(", companyAddress=");
		requestedString.append(companyAddress);
		requestedString.append(", companyEmail=");
		requestedString.append(companyEmail);
		requestedString.append(", companyPhoneNumber");
		requestedString.append(companyPhoneNumber);
		requestedString.append("]");
		
			
		return requestedString.toString();  
	}
	
	}
		


	