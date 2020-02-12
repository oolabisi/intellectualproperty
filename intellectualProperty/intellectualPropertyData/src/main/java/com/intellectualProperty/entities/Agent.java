package com.intellectualProperty.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agent")
public class Agent {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int agentid;
	
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

	public Agent() {}

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
	
	
	
	public int getAgentid() {
		return agentid;
	}

	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}

	@Override
	public String toString() {
		StringBuilder stringRep = new StringBuilder("Agent [id=");
		stringRep.append(this.getAgentid());
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
