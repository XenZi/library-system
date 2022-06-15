package managers;

import java.util.ArrayList;

import model.abstracts.Staff;


public class LibraryManager {
	public static final String FILEPATH = "src/txt/library.txt";

	private static LibraryManager instance;
	
	
	private Staff loggedStaff;
	private GenreManager genreManager;
	private AdminManager adminManager;
	
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

	public static void setInstance(LibraryManager instance) {
		LibraryManager.instance = instance;
	}
	
	
	
	
	
}
