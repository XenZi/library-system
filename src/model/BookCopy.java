package model;

import enums.Binding;
import enums.Language;

public class BookCopy {
	private Book book;
	private Binding binding;
	private Language printingLanguage;
	private int pageNumbers;
	private int printingYear;
	private boolean isRented;
	private String id;
	private boolean isDeleted;
	
	public BookCopy() {
		this.book = null;
		this.binding = null;
		this.printingLanguage = null;
		this.pageNumbers = -1;
		this.printingYear = -1;
		this.isRented = false;
		this.id = "";
		this.isDeleted = false;
	}

	public BookCopy(Book book, Binding binding, Language printingLanguage, int pageNumbers, int printingYear) {
		super();
		this.book = book;
		this.binding = binding;
		this.printingLanguage = printingLanguage;
		this.pageNumbers = pageNumbers;
		this.printingYear = printingYear;
		this.isRented = false;
		this.isDeleted = false;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Binding getBinding() {
		return binding;
	}

	public void setBinding(Binding binding) {
		this.binding = binding;
	}

	public Language getPrintingLanguage() {
		return printingLanguage;
	}

	public void setPrintingLanguage(Language printingLanguage) {
		this.printingLanguage = printingLanguage;
	}

	public int getPageNumbers() {
		return pageNumbers;
	}

	public void setPageNumbers(int pageNumbers) {
		this.pageNumbers = pageNumbers;
	}

	public int getPrintingYear() {
		return printingYear;
	}

	public void setPrintingYear(int printingYear) {
		this.printingYear = printingYear;
	}

	public boolean isRented() {
		return isRented;
	}

	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}
