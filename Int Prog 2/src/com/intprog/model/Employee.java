package com.intprog.model;

public class Employee {
	private String firstname,lastname,email,username,password,mi;
	private DTRModel DTR;
	
	public int employeeID;
	
	public int getEmployeeID() {
		return employeeID;
	}

	public DTRModel getDTR() {
		return DTR;
	}

	public void setDTR(DTRModel DTR) {
		this.DTR = DTR;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMi() {
		return mi;
	}

	public void setMi(String mi) {
		this.mi = mi;
	}
	
	
	
}
