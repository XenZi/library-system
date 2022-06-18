package model.admin;
import java.time.LocalDate;
import java.util.ArrayList;

import enums.Binding;
import enums.Gender;
import enums.Language;
import interfaces.AdminPermissions;
import interfaces.LibrarianPermissions;
import managers.AdminManager;
import managers.LibrarianManager;
import managers.RentalManager;
import managers.UniqueIDManager;
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
		Librarian librarian = new Librarian(firstName, lastName, uniqueIdentificationNumber, gender, username, password, paycheck);
		librarian.setId(UniqueIDManager.generateLibrarianID());
		while(UniqueIDManager.checkIDExisting(LibrarianManager.getFilepath(), librarian.getId())) {
			librarian.setId(UniqueIDManager.generateMemberID());
		}
		LibrarianManager.getInstance().getAllLibrarians().add(librarian);
		return null;
	}

	@Override
	public Librarian updateLibrarian(String ID, String firstName, String lastName, String uniqueIdentificationNumber,
			Gender gender, String username, String password, double paycheck) {
		Librarian librarian = LibrarianManager.getInstance().findLibrarian(ID);
		librarian.setFirstName(firstName);
		librarian.setLastName(lastName);
		librarian.setUniqueIdentificationNumber(uniqueIdentificationNumber);
		librarian.setGender(gender);
		librarian.setUsername(username);
		librarian.setPassword(password);
		librarian.setPaycheck(paycheck);
		return librarian;
	}

	@Override
	public Librarian deleteLibrarian(String id) {
		Librarian librarian = LibrarianManager.getInstance().findLibrarian(id);
		librarian.setDeleted(true);
		return null;
	}

	@Override
	public Admin createAdmin(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender,
			String username, String password, double paycheck) {
		Admin admin = new Admin(firstName, lastName, uniqueIdentificationNumber, gender, username, password, paycheck);
		admin.setId(UniqueIDManager.generateAdminID());
		while(UniqueIDManager.checkIDExisting(LibrarianManager.getFilepath(), admin.getId())) {
			admin.setId(UniqueIDManager.generateMemberID());
		}
		AdminManager.getInstance().getAllAdmins().add(admin);
		return null;
	}

	@Override
	public Admin updateAdmin(String ID, String firstName, String lastName, String uniqueIdentificationNumber,
			Gender gender, String username, String password, double paycheck) {
		Admin admin = AdminManager.getInstance().findAdmin(ID);
		admin.setFirstName(firstName);
		admin.setLastName(lastName);
		admin.setUniqueIdentificationNumber(uniqueIdentificationNumber);
		admin.setGender(gender);
		admin.setUsername(username);
		admin.setPassword(password);
		admin.setPaycheck(paycheck);
		return admin;
	}

	@Override
	public Admin deleteAdmin(String id) {
		Admin admin = AdminManager.getInstance().findAdmin(id);
		admin.setDeleted(true);
		return null;
	}

	@Override
	public RentBook createRent(Member member, ArrayList<BookCopy> rentedBook, LocalDate rentalDate,
			LocalDate returningDate) {
		RentBook newRental = new RentBook(this.admin, member, rentedBook, rentalDate, returningDate);	
		newRental.setId(UniqueIDManager.generateRandomID());
		while(UniqueIDManager.checkIDExisting(RentalManager.getFilepath(), newRental.getId())) {
			newRental.setId(UniqueIDManager.generateRandomID());
		}
		RentalManager.getInstance().getAllRentals().add(newRental);
		return newRental;
	}

}
