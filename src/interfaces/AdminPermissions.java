package interfaces;

import enums.Gender;
import model.Admin;
import model.Librarian;

public interface AdminPermissions {
	/*
	 * Librarian
	 */
	
	public Librarian createLibrarian(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender,
			String username, String password, double paycheck);
	public Librarian updateLibrarian(String ID, String firstName, String lastName, String uniqueIdentificationNumber, Gender gender,
			String username, String password, double paycheck);
	public Librarian deleteLibrarian(String id);
	
	/*
	 * Admin
	 */
	
	public Admin createAdmin(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender,
			String username, String password, double paycheck);
	public Admin updateAdmin(String ID, String firstName, String lastName, String uniqueIdentificationNumber, Gender gender,
			String username, String password, double paycheck);
	public Admin deleteAdmin(String id);
}
