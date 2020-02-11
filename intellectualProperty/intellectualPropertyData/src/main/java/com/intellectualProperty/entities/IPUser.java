/**
 * 
 */
package com.intellectualProperty.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.asm.Advice.This;

/**
 * @author user
 *
 */
@Entity
@Table(name = "ipusers")
public class IPUser {
	
	@Id
	@Column(name= "userid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
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
	
	public IPUser() {}

	public IPUser(String firstName, String lastName, String email, String nationality, String password, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.nationality = nationality;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		StringBuilder stringRep = new StringBuilder("IPUser [id=");
		stringRep.append(this.getId());
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
