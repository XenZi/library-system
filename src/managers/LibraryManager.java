package managers;

import java.util.ArrayList;

import model.Library;
import model.RentBook;
import model.abstracts.Staff;


public class LibraryManager {
	public static final String FILEPATH = "src/txt/library.txt";

	private static LibraryManager instance;
	
	
	private Staff loggedStaff;
	private Library library;

	private GenreManager genreManager;
	private AdminManager adminManager;
	private BookCopyManager bookCopyManager;
	private BookManager bookManager;
	private LibrarianManager librarianManager;
	private MemberManager memberManager;
	private MembershipManager membershipManager;
	private RentalManager rentalManager;
	private StaffManager staffManager;
	
	private LibraryManager() {
		
	}
	
	public static LibraryManager getInstance() {
		if(instance == null) {
			instance = new LibraryManager();
		}
		return instance;
	}
	
	public void loadLibraryFromFile() {
		library = new Library();
		String readedFile = FileManager.readFile(FILEPATH);
		String[] splittedFile = readedFile.split("\n");
		String line = FileManager.readFile(FILEPATH);
		String[] splittedLine = line.split("\\|");
		library.setID(splittedLine[0]);
		library.setTitle(splittedLine[1]);
		library.setAddress(splittedLine[2]);
		library.setPhoneNumber(splittedLine[3]);
		library.setWorkingTime(splittedLine[4]);
	}

	
	/*
	 * 
	 * GETTERS AND SETTERS
	 * 
	 */
	
	
	public Staff getLoggedStaff() {
		return loggedStaff;
	}

	public void setLoggedStaff(Staff loggedStaff) {
		this.loggedStaff = loggedStaff;
	}

	public static void setInstance(LibraryManager instance) {
		LibraryManager.instance = instance;
	}

	public GenreManager getGenreManager() {
		return genreManager;
	}

	public void setGenreManager(GenreManager genreManager) {
		this.genreManager = genreManager;
	}

	public AdminManager getAdminManager() {
		return adminManager;
	}

	public void setAdminManager(AdminManager adminManager) {
		this.adminManager = adminManager;
	}

	public BookCopyManager getBookCopyManager() {
		return bookCopyManager;
	}

	public void setBookCopyManager(BookCopyManager bookCopyManager) {
		this.bookCopyManager = bookCopyManager;
	}

	public BookManager getBookManager() {
		return bookManager;
	}

	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}

	public LibrarianManager getLibrarianManager() {
		return librarianManager;
	}

	public void setLibrarianManager(LibrarianManager librarianManager) {
		this.librarianManager = librarianManager;
	}

	public MemberManager getMemberManager() {
		return memberManager;
	}

	public void setMemberManager(MemberManager memberManager) {
		this.memberManager = memberManager;
	}

	public MembershipManager getMembershipManager() {
		return membershipManager;
	}

	public void setMembershipManager(MembershipManager membershipManager) {
		this.membershipManager = membershipManager;
	}

	public RentalManager getRentalManager() {
		return rentalManager;
	}

	public void setRentalManager(RentalManager rentalManager) {
		this.rentalManager = rentalManager;
	}

	public static String getFilepath() {
		return FILEPATH;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public StaffManager getStaffManager() {
		return staffManager;
	}

	public void setStaffManager(StaffManager staffManager) {
		this.staffManager = staffManager;
	}
	
	
}
