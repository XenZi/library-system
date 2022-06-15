package managers;

import java.util.ArrayList;

import enums.Binding;
import enums.Language;
import model.Book;
import model.BookCopy;

public class BookCopyManager {
	public static final String FILEPATH = "src/txt/copybooks.txt";
	
	private static BookCopyManager instance;
	
	private ArrayList<BookCopy> allCopyBooks = new ArrayList<BookCopy>();
	
	private BookCopyManager() {};
	
	public static BookCopyManager getInstance() {
		if(instance == null) {
			instance = new BookCopyManager();
		}
		return instance;
	}
	
	public void loadBooksCopyFromFile() {
		String readedFile = FileManager.readFile(FILEPATH);
		String[] splittedFile = readedFile.split("\n");
		for(String line : splittedFile) {
			BookCopy book = bookCopyFromFile(line);
			if (book != null) allCopyBooks.add(book);
		}
	}
	
	private BookCopy bookCopyFromFile(String line) {
		BookCopy bookCopy = new BookCopy();
		String[] splittedLine = line.split("\\|");
		bookCopy.setId(splittedLine[0]);
		bookCopy.setBook(BookManager.getInstance().findBook(splittedLine[1]));
		bookCopy.setBinding(Binding.valueOf(splittedLine[2]));
		bookCopy.setPrintingLanguage(Language.valueOf(splittedLine[3]));
		bookCopy.setPageNumbers(Integer.parseInt(splittedLine[4]));
		bookCopy.setPrintingYear(Integer.parseInt(splittedLine[5]));
		bookCopy.setRented(Boolean.parseBoolean(splittedLine[6]));
		bookCopy.setDeleted(Boolean.parseBoolean(splittedLine[7]));
		if (bookCopy.isDeleted()) return null;
		return bookCopy;
	}
	
	public BookCopy findBookCopy(String ID) {
		return allCopyBooks.stream()
						.filter(book -> book.getId().equals(ID))
						.findAny()
						.orElse(null);
	}
}
