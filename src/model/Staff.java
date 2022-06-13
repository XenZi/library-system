package model;

import enums.Gender;

public abstract class Staff extends User{
	protected String username;
	protected String password;
	protected double paycheck;
	
	public Staff() {
		super();
		this.username = "";
		this.password = "";
		this.paycheck = -1;
	}
	
	public Staff(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender, String username, String password, double paycheck) {
		super(firstName, lastName, uniqueIdentificationNumber, gender);
		this.username = username;
		this.password = password;
		this.paycheck = paycheck; 
	}

	
	/*
	 * 
	 * GETTERS AND SETTERS
	 * 
	 */
	
	
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

	public double getPaycheck() {
		return paycheck;
	}

	public void setPaycheck(double paycheck) {
		this.paycheck = paycheck;
	}
}
