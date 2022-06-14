package model;

import java.time.LocalDate;
import java.util.ArrayList;

import model.abstracts.Staff;


public class RentBook {
	private Staff staff;
	private Member member;
	private LocalDate rentalDate;
	private LocalDate returningDate;
	private ArrayList<BookCopy> rentedBooks = new ArrayList<BookCopy>();
	private String id;
	private boolean isDeleted;
	
	public RentBook() {
		this.staff = null;
		this.member = null;
		this.rentalDate = null;
		this.returningDate = null;
		this.id = "";
		this.isDeleted = false;
	}
	public RentBook(Staff staff, Member member, ArrayList<BookCopy> rentedBooks, LocalDate rentalDate,
			LocalDate returningDate) {
		super();
		this.staff = staff;
		this.member = member;
		this.rentedBooks = rentedBooks;
		this.rentalDate = rentalDate;
		this.returningDate = returningDate;
		this.isDeleted = false;
	}
	
	/*
	 * 
	 * GETTERS AND SETTERS
	 * 
	 */
	
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public LocalDate getRentalDate() {
		return rentalDate;
	}
	public void setRentalDate(LocalDate rentalDate) {
		this.rentalDate = rentalDate;
	}
	public LocalDate getReturningDate() {
		return returningDate;
	}
	public void setReturningDate(LocalDate returningDate) {
		this.returningDate = returningDate;
	}
	public ArrayList<BookCopy> getRentedBooks() {
		return rentedBooks;
	}
	public void setRentedBooks(ArrayList<BookCopy> rentedBooks) {
		this.rentedBooks = rentedBooks;
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
