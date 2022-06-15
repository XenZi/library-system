package model.abstracts;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Binding;
import enums.Gender;
import enums.Language;
import interfaces.LibrarianPermissions;
import model.Book;
import model.BookCopy;
import model.Genre;
import model.Member;
import model.MembershipFee;
import model.RentBook;

public class StaffService implements LibrarianPermissions {

	@Override
	public Member createNewMember(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender,
			int cardNumber, LocalDate membershipExtension, int membershipDuration, MembershipFee membership,
			boolean isActive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member updateMember(String ID, String firstName, String lastName, String uniqueIdentificationNumber,
			Gender gender, int cardNumber, LocalDate membershipExtension, int membershipDuration,
			MembershipFee membership, boolean isActive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public Book createBook(String title, String originalTitle, String writer, LocalDate releaseDate, String description,
			Language originalLanguage, Genre genre, boolean isDeleted) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book updateBook(String ID, String title, String originalTitle, String writer, LocalDate releaseDate,
			String description, Language originalLanguage, Genre genre, boolean isDeleted) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(String ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public BookCopy createBookCopy(Book book, Binding binding, Language printingLanguage, int pageNumbers,
			int printingYear) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookCopy updateBookCopy(String ID, Book book, Binding binding, Language printingLanguage, int pageNumbers,
			int printingYear) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBookCopy(String ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public Genre createGenre(String name, String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genre updateGenre(String ID, String name, String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGenre(String ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public MembershipFee createMembership(String type, int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MembershipFee updateMembership(String ID, String type, int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMembership(String ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public RentBook createRent(Member member, ArrayList<BookCopy> rentedBook, LocalDate rentalDate,
			LocalDate returningDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RentBook updateRent(String ID, Member member, ArrayList<BookCopy> rentedBook, LocalDate rentalDate,
			LocalDate returningDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRent(String ID) {
		// TODO Auto-generated method stub

	}

}
