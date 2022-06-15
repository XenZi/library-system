package model.admin;
import java.time.LocalDate;
import java.util.ArrayList;

import enums.Binding;
import enums.Gender;
import enums.Language;
import interfaces.AdminPermissions;
import interfaces.LibrarianPermissions;
import model.Book;
import model.BookCopy;
import model.Genre;
import model.Member;
import model.MembershipFee;
import model.RentBook;
import model.abstracts.StaffService;
import model.librarian.Librarian;

public class AdminService extends StaffService implements AdminPermissions {

	private Admin admin;
	
	public AdminService(Admin admin) {
		this.admin = admin;
	}
	
	@Override
	public Librarian createLibrarian(String firstName, String lastName, String uniqueIdentificationNumber,
			Gender gender, String username, String password, double paycheck) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Librarian updateLibrarian(String ID, String firstName, String lastName, String uniqueIdentificationNumber,
			Gender gender, String username, String password, double paycheck) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Librarian deleteLibrarian(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin createAdmin(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender,
			String username, String password, double paycheck) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin updateAdmin(String ID, String firstName, String lastName, String uniqueIdentificationNumber,
			Gender gender, String username, String password, double paycheck) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin deleteAdmin(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
