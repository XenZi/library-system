package model.librarian;

import model.abstracts.StaffService;

public class LibrarianService extends StaffService {
	
	private Librarian librarian;
	
	public LibrarianService(Librarian librarian) {
		this.librarian = librarian;	
	}
}
