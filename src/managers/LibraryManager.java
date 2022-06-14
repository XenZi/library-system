package managers;

public class LibraryManager {
	private static LibraryManager instance;
	public static final String FILEPATH = "src/txt/library.txt";
	
	private LibraryManager() {
		
	}
	
	public static LibraryManager getInstance() {
		if(instance == null) {
			instance = new LibraryManager();
		}
		return instance;
	}
}
