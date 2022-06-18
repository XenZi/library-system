package managers;

import java.util.ArrayList;

import enums.Gender;
import model.Book;
import model.Genre;
import model.Library;
import model.librarian.Librarian;

public class LibrarianManager {
	public static final String FILEPATH = "src/txt/users.txt";
	
	private static LibrarianManager instance;
	
	private ArrayList<Librarian> allLibrarians = new ArrayList<Librarian>();
	
	private LibrarianManager() {};
	
	public static LibrarianManager getInstance() {
		if(instance == null) {
			instance = new LibrarianManager();
		}
		return instance;
	}
	
	public void loadLibrariansFromFile() {
		String readedFile = FileManager.readFile(FILEPATH);
		String[] splittedFile = readedFile.split("\n");
		for(String line : splittedFile) {
			Librarian librarian = createLibrarianFromFile(line);
			if (librarian != null) allLibrarians.add(librarian);
		}
	}
	
	public Librarian createLibrarianFromFile(String line) {
		String[] splittedLine = line.split("\\|");
		char index = splittedLine[0].charAt(0);
		if (index != 'L') {
			return null;	
		}
		Librarian readLibrerian = new Librarian();
		readLibrerian.setId(splittedLine[0]);
		readLibrerian.setFirstName(splittedLine[1]);
		readLibrerian.setLastName(splittedLine[2]);
		readLibrerian.setUniqueIdentificationNumber(splittedLine[3]);
		readLibrerian.setGender(Gender.valueOf(splittedLine[4]));
		readLibrerian.setUsername(splittedLine[5]);
		readLibrerian.setPassword(splittedLine[6]);
		readLibrerian.setPaycheck(Double.parseDouble(splittedLine[7]));
		readLibrerian.setDeleted(Boolean.valueOf(splittedLine[8]));
		return readLibrerian;
	}
	
	public Librarian findLibrarian(String ID) {
		return allLibrarians.stream()
						.filter(librarian -> librarian.getId().equals(ID))
						.findAny()
						.orElse(null);
	}
	/*
	 * 
	 * GETTERS AND SETTERS
	 * 
	 */
	
	public ArrayList<Librarian> getAllLibrarians() {
		return allLibrarians;
	}

	public void setAllLibrarians(ArrayList<Librarian> allLibrarians) {
		this.allLibrarians = allLibrarians;
	}

	public static String getFilepath() {
		return FILEPATH;
	}

	public static void setInstance(LibrarianManager instance) {
		LibrarianManager.instance = instance;
	}
	
	
	
}
