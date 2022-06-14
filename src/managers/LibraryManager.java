package managers;

import java.util.ArrayList;

import model.Book;
import model.BookCopy;
import model.Genre;
import model.Member;
import model.MembershipFee;
import model.abstracts.Staff;
import model.admin.Admin;
import model.librarian.Librarian;

public class LibraryManager {
	public static final String FILEPATH = "src/txt/library.txt";

	private static LibraryManager instance;
	
	
	private Staff loggedStaff;
	private ArrayList<Book> allBooks;
	private ArrayList<BookCopy> allCopyBooks;
	private ArrayList<Genre> allGenres;
	private ArrayList<Member> allMembers;
	private ArrayList<MembershipFee> allMemberships;
	private ArrayList<Admin> allAdmins;
	private ArrayList<Librarian> allLibrarians;
	
	private LibraryManager() {
		
	}
	
	public static LibraryManager getInstance() {
		if(instance == null) {
			instance = new LibraryManager();
		}
		return instance;
	}

	public Staff getLoggedStaff() {
		return loggedStaff;
	}

	public void setLoggedStaff(Staff loggedStaff) {
		this.loggedStaff = loggedStaff;
	}

	public ArrayList<Book> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(ArrayList<Book> allBooks) {
		this.allBooks = allBooks;
	}

	public ArrayList<BookCopy> getAllCopyBooks() {
		return allCopyBooks;
	}

	public void setAllCopyBooks(ArrayList<BookCopy> allCopyBooks) {
		this.allCopyBooks = allCopyBooks;
	}

	public ArrayList<Genre> getAllGenres() {
		return allGenres;
	}

	public void setAllGenres(ArrayList<Genre> allGenres) {
		this.allGenres = allGenres;
	}

	public ArrayList<Member> getAllMembers() {
		return allMembers;
	}

	public void setAllMembers(ArrayList<Member> allMembers) {
		this.allMembers = allMembers;
	}

	public ArrayList<MembershipFee> getAllMemberships() {
		return allMemberships;
	}

	public void setAllMemberships(ArrayList<MembershipFee> allMemberships) {
		this.allMemberships = allMemberships;
	}

	public ArrayList<Admin> getAllAdmins() {
		return allAdmins;
	}

	public void setAllAdmins(ArrayList<Admin> allAdmins) {
		this.allAdmins = allAdmins;
	}

	public ArrayList<Librarian> getAllLibrarians() {
		return allLibrarians;
	}

	public void setAllLibrarians(ArrayList<Librarian> allLibrarians) {
		this.allLibrarians = allLibrarians;
	}

	public static void setInstance(LibraryManager instance) {
		LibraryManager.instance = instance;
	}
	
	
	
	
	
}
