package managers;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Language;
import model.Book;
import model.Genre;
import model.admin.Admin;
import model.librarian.Librarian;

public class BookManager {
	public static final String FILEPATH = "src/txt/books.txt";
	
	private static BookManager instance;
	
	private ArrayList<Book> allBooks = new ArrayList<Book>();
	
	private BookManager() {};
	
	public static BookManager getInstance() {
		if(instance == null) {
			instance = new BookManager();
		}
		return instance;
	}
	
	public void loadBooksFromFile() {
		String readedFile = FileManager.readFile(FILEPATH);
		String[] splittedFile = readedFile.split("\n");
		for(String line : splittedFile) {
			Book book = createBookFromFile(line);
			if (book != null) allBooks.add(book);
		}
	}
	
	public Book createBookFromFile(String line) {
		Book readBook = new Book();
		String[] splittedLine = line.split("\\|");
		readBook.setId(splittedLine[0]);
		readBook.setTitle(splittedLine[1]);
		readBook.setOriginalTitle(splittedLine[2]);
		readBook.setWriter(splittedLine[3]);
		readBook.setReleaseDate(LocalDate.parse(splittedLine[4]));
		readBook.setDescription(splittedLine[5]);
		readBook.setOriginalLanguage(Language.valueOf(splittedLine[6]));
		readBook.setGenre(GenreManager.getInstance().findGenre(splittedLine[7]));
		readBook.setIsDeleted(Boolean.parseBoolean(splittedLine[8]));
		if (readBook.getIsDeleted()) return null;
		return readBook;
	}
	
	public Book findBook(String ID) {
		return allBooks.stream()
						.filter(book -> book.getId().equals(ID))
						.findAny()
						.orElse(null);
	}
}
