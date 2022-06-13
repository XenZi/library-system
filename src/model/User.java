package model;

import enums.Gender;

public abstract class User {
	protected String firstName;
	protected String lastName;
	protected String id;
	protected String uniqueIdentificationNumber;
	protected Gender gender;
	protected boolean isDeleted;
	
	public User() {
		this.firstName = "";
		this.lastName = "";
		this.id = "";
		this.uniqueIdentificationNumber = "";
		this.gender = null;
		this.isDeleted = false;
	}

	public User(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.uniqueIdentificationNumber = uniqueIdentificationNumber;
		this.gender = gender;
		this.isDeleted = false;
	}
 
	
	/*
	 * 
	 * GETTERS AND SETTERS
	 * 
	 */
	
	
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUniqueIdentificationNumber() {
		return uniqueIdentificationNumber;
	}

	public void setUniqueIdentificationNumber(String uniqueIdentificationNumber) {
		this.uniqueIdentificationNumber = uniqueIdentificationNumber;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
