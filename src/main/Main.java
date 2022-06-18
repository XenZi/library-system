package main;

import model.*;
import model.admin.Admin;
import view.LoginView;
import controller.LoginController;
import enums.*;
import managers.*;

public class Main {

	public static void main(String[] args) {
		AdminManager adminManager = AdminManager.getInstance();
		LibrarianManager librarianManager = LibrarianManager.getInstance();
		GenreManager genreManager = GenreManager.getInstance();
		BookManager bookManager = BookManager.getInstance();
		BookCopyManager bookCopyManager = BookCopyManager.getInstance();
		MembershipManager membershipManager = MembershipManager.getInstance();
		MemberManager memberManager = MemberManager.getInstance();
		RentalManager rentalManager = RentalManager.getInstance();
		StaffManager staffManager = StaffManager.getInstance();
		LibraryManager libraryManager = LibraryManager.getInstance();
		
		adminManager.loadAdminsFromFile();
		librarianManager.loadLibrariansFromFile();
		genreManager.loadGenresFromFile();
		bookManager.loadBooksFromFile();
		bookCopyManager.loadBooksCopyFromFile();
		membershipManager.loadMemberships();
		memberManager.loadMembersFromFile();
		staffManager.fillWithStaff(adminManager.getAllAdmins(), librarianManager.getAllLibrarians());
		rentalManager.loadRentalsFromFile();
		libraryManager.loadLibraryFromFile();
		
		libraryManager.setAdminManager(adminManager);
		libraryManager.setLibrarianManager(librarianManager);
		libraryManager.setBookCopyManager(bookCopyManager);
		libraryManager.setBookManager(bookManager);
		libraryManager.setGenreManager(genreManager);
		libraryManager.setMemberManager(memberManager);
		libraryManager.setMembershipManager(membershipManager);
		libraryManager.setRentalManager(rentalManager);
		libraryManager.setStaffManager(staffManager);

		LoginView view = new LoginView("Login");
		LoginController controller = new LoginController(libraryManager, view);
		controller.initController();
	}

}
