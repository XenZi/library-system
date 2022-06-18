package managers;

import java.util.ArrayList;

import enums.Gender;
import model.Genre;
import model.admin.Admin;

public class GenreManager {
	public static final String FILEPATH = "src/txt/genres.txt";
	
	private static GenreManager instance;
	
	private ArrayList<Genre> allGenres = new ArrayList<Genre>();
	
	private GenreManager() {};
	public static GenreManager getInstance() {
		if(instance == null) {
			instance = new GenreManager();
		}
		return instance;
	}
	
	public void loadGenresFromFile() {
		String readedFile = FileManager.readFile(FILEPATH);
		String[] splittedFile = readedFile.split("\n");
		for(String line : splittedFile) {
			Genre genre = createGenreFromFile(line);
			if (genre != null) allGenres.add(genre);
		}
	}
	
	private Genre createGenreFromFile(String line) {
		Genre readGenre = new Genre();
		String[] splittedLine = line.split("\\|");
		readGenre.setId(splittedLine[0]);
		readGenre.setName(splittedLine[1]);
		readGenre.setDescription(splittedLine[2]);
		readGenre.setDeleted(Boolean.parseBoolean(splittedLine[3]));
		return readGenre;
	}
	
	public Genre findGenre(String ID) {
		return allGenres.stream()
						.filter(genre -> genre.getId().equals(ID))
						.findAny()
						.orElse(null);
	}
	
	/*
	 * 
	 * GETTERS AND SETTERS
	 * 
	 */
	
	
	public ArrayList<Genre> getAllGenres() {
		return allGenres;
	}
	public void setAllGenres(ArrayList<Genre> allGenres) {
		this.allGenres = allGenres;
	}
	public static String getFilepath() {
		return FILEPATH;
	}
	public static void setInstance(GenreManager instance) {
		GenreManager.instance = instance;
	}
	
	
}
