package model;

import java.time.LocalDate;

import enums.Language;

public class Book {
	private String title;
	private String originalTitle;
	private String writer;
	private LocalDate releaseDate;
	private String description;
	private String id;
	private Language originalLanguage;
	private Genre genre;
	private Boolean isDeleted;
	
	public Book() {
		this.title = "";
		this.originalTitle = "";
		this.writer = "";
		this.releaseDate = null;
		this.description = "";
		this.id = "";
		this.originalLanguage = null;
		this.genre = null;
		this.isDeleted = false;
	}

	public Book(String title, String originalTitle, String writer, LocalDate releaseDate, String description,
			Language originalLanguage, Genre genre) {
		this.title = title;
		this.originalTitle = originalTitle;
		this.writer = writer;
		this.releaseDate = releaseDate;
		this.description = description;
		this.originalLanguage = originalLanguage;
		this.genre = genre;
		this.isDeleted = false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Language getOriginalLanguage() {
		return originalLanguage;
	}

	public void setOriginalLanguage(Language originalLanguage) {
		this.originalLanguage = originalLanguage;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", originalTitle=" + originalTitle + ", writer=" + writer + ", releaseDate="
				+ releaseDate + ", description=" + description + ", id=" + id + ", originalLanguage=" + originalLanguage
				+ ", genre=" + genre + ", isDeleted=" + isDeleted + "]";
	}
	
	
}
