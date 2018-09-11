package com.crudservletfreemaker.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -8467428831112407088L;

	private int userid;
	private String firstName;
	private String lastName;
	private String email;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	@Override
	public String toString() {
		return "[UserId " + userid + ", first name= " + firstName + ", last name = " + lastName + ", email= " + email
				+ " ]";
	}
}
