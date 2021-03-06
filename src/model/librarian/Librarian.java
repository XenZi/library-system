package model.librarian;

import enums.Gender;
import model.abstracts.Staff;

public class Librarian extends Staff {
	public Librarian() {
		// TODO Auto-generated constructor stub
	}

	public Librarian(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender,
			String username, String password, double paycheck) {
		super(firstName, lastName, uniqueIdentificationNumber, gender, username, password, paycheck);
	}

	@Override
	public String toString() {
		return "Librarian [username=" + username + ", password=" + password + ", paycheck=" + paycheck + ", firstName="
				+ firstName + ", lastName=" + lastName + ", id=" + id + ", uniqueIdentificationNumber="
				+ uniqueIdentificationNumber + ", gender=" + gender + ", isDeleted=" + isDeleted + "]";
	}
	
	
}
