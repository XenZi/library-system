package model.admin;

import enums.Gender;
import model.abstracts.Staff;

public class Admin extends Staff {
	public Admin() {
	 	// TODO Auto-generated constructor stub
		super();
		this.id = "";
	}

	public Admin(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender,
			String username, String password, double paycheck) {
		super(firstName, lastName, uniqueIdentificationNumber, gender, username, password, paycheck);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + ", paycheck=" + paycheck + ", firstName="
				+ firstName + ", lastName=" + lastName + ", id=" + id + ", uniqueIdentificationNumber="
				+ uniqueIdentificationNumber + ", gender=" + gender + ", isDeleted=" + isDeleted + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getPaycheck()=" + getPaycheck()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getId()=" + getId()
				+ ", getUniqueIdentificationNumber()=" + getUniqueIdentificationNumber() + ", getGender()="
				+ getGender() + ", isDeleted()=" + isDeleted() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
