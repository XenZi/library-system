package model.librarian;

import java.time.LocalDate;
import java.util.ArrayList;

import managers.RentalManager;
import managers.UniqueIDManager;
import model.BookCopy;
import model.Member;
import model.RentBook;
import model.abstracts.StaffService;

public class LibrarianService extends StaffService {
	
	private Librarian librarian;
	
	public LibrarianService(Librarian librarian) {
		this.librarian = librarian;	
	}

	@Override
	public RentBook createRent(Member member, ArrayList<BookCopy> rentedBook, LocalDate rentalDate,
			LocalDate returningDate) {
		RentBook newRental = new RentBook(this.librarian, member, rentedBook, rentalDate, returningDate);	
		newRental.setId(UniqueIDManager.generateRandomID());
		while(UniqueIDManager.checkIDExisting(RentalManager.getFilepath(), newRental.getId())) {
			newRental.setId(UniqueIDManager.generateRandomID());
		}
		RentalManager.getInstance().getAllRentals().add(newRental);
		return newRental;
	}
}
