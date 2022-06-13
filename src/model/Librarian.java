package model;

import enums.Gender;

public class Librarian extends Staff {
	public Librarian() {
		// TODO Auto-generated constructor stub
	}

	public Librarian(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender,
			String username, String password, double paycheck) {
		super(firstName, lastName, uniqueIdentificationNumber, gender, username, password, paycheck);
	}
}
