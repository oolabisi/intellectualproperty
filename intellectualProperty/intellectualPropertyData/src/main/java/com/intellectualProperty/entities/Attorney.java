package com.intellectualProperty.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attorney")
public class Attorney {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int attorneyId;
	
	@Column(name= "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name= "nationality")
	private String nationality;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "phone")
	private String phoneNumber;
	
			

	public Attorney() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public int getAttorneyId() {
		return attorneyId;
	}

	public void setAttorneyId(int agentid) {
		this.attorneyId = agentid;
	}
	
//	
//public void addAgentCompany(AgentCompany newAgentCompany) {
//		
//		if(agentcompanies == null) {
//			agentcompanies = new ArrayList<>();
//			
//		}
//		agentcompanies.add(newAgentCompany);
//	}

//	
//	public AgentCompany getAgentcompanies() {
//		return agentcompanies;
//	}
//
//	public void setAgentcompanies(AgentCompany agentcompanies) {
//		this.agentcompanies = agentcompanies;
//	}
	
	@Override
	public String toString() {
		StringBuilder stringRep = new StringBuilder("Agent [id=");
		stringRep.append(this.getAttorneyId());
		stringRep.append(", firstName=");
		stringRep.append(this.getFirstName());
		stringRep.append(", lastName=");
		stringRep.append(this.getLastName());
		stringRep.append(", email=");
		stringRep.append(this.getEmail());
		stringRep.append(", nationality=");
		stringRep.append(this.getNationality());
		stringRep.append(", phoneNumber=");
		stringRep.append(this.getPhoneNumber());
		stringRep.append("]");
		
		return stringRep.toString();
	

	}

	
}
