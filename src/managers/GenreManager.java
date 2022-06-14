package managers;

import java.util.ArrayList;

import enums.Gender;
import model.Genre;
import model.admin.Admin;

public class GenreManager {
	public static final String FILEPATH = "src/txt/genres.txt";
	
	private static GenreManager instance;
	
	private ArrayList<Genre> allGenres = new ArrayList<Genre>();
	
	public static GenreManager getInstance() {
		if(instance == null) {
			instance = new GenreManager();
		}
		return instance;
	}
	
	public void loadAdminsFromFile() {
		String readedFile = FileManager.readFile(FILEPATH);
		String[] splittedFile = readedFile.split("\n");
		for(String line : splittedFile) {
			Genre genre = createGenreObject(line);
			if (genre != null) allGenres.add(genre);
		}
	}
	
	private Genre createGenreObject(String line) {
		Genre readGenre = new Genre();
		String[] splittedLine = line.split("\\|");
		readGenre.setId(splittedLine[0]);
		readGenre.setName(splittedLine[1]);
		readGenre.setDescription(splittedLine[2]);
		readGenre.setDeleted(Boolean.parseBoolean(splittedLine[3]));
		return readGenre;
	}
}
