package managers;

import java.time.LocalDate;
import java.util.ArrayList;

import model.BookCopy;
import model.Genre;
import model.RentBook;
public class RentalManager {
	public static final String FILEPATH = "src/txt/rentals.txt";
	
	private static RentalManager instance;
	
	private RentalManager() {}
	
	private ArrayList<RentBook> allRentals = new ArrayList<RentBook>();
	
	public static RentalManager getInstance() {
		if (instance == null) {
			instance = new RentalManager();
		}
		return instance;
	}
	
	public void loadRentalsFromFile() {
		String readedFile = FileManager.readFile(FILEPATH);
		String[] splittedFile = readedFile.split("\n");
		for(String line : splittedFile) {
			RentBook rental = createRentalFromFile(line);
			if (rental != null) allRentals.add(rental);
		}
	}
	
	private RentBook createRentalFromFile(String line) {
		RentBook rental = new RentBook();
		String[] splittedLine = line.split("\\|");
		rental.setId(splittedLine[0]);
		rental.setStaff(LibraryManager.getInstance().getLoggedStaff());
		rental.setMember(MemberManager.getInstance().findMember(splittedLine[2]));
		String[] splittedCopyBooksIDs = splittedLine[3].split(",");
		for(String ll: splittedCopyBooksIDs) {
			rental.getRentedBooks().add(BookCopyManager.getInstance().findBookCopy(ll));
		}
		rental.setRentalDate(LocalDate.parse(splittedLine[4]));
		rental.setReturningDate(LocalDate.parse(splittedLine[5]));
		rental.setDeleted(Boolean.parseBoolean(splittedLine[6]));
		if(rental.isDeleted()) return null;
		return rental;
	}
	
	public RentBook findRental(String ID) {
		return allRentals.stream()
						.filter(rental -> rental.getId().equals(ID))
						.findAny()
						.orElse(null);
	}
	

	/*
	 * 
	 * GETTERS AND SETTERS
	 * 
	 */

	public ArrayList<RentBook> getAllRentals() {
		return allRentals;
	}

	public void setAllRentals(ArrayList<RentBook> allRentals) {
		this.allRentals = allRentals;
	}

	public static String getFilepath() {
		return FILEPATH;
	}

	public static void setInstance(RentalManager instance) {
		RentalManager.instance = instance;
	}
	
	
}
