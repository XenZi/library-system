package interfaces;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Binding;
import enums.Gender;
import enums.Language;
import model.Book;
import model.BookCopy;
import model.Genre;
import model.Member;
import model.MembershipFee;
import model.RentBook;

public interface LibrarianPermissions {

	/*
	 * 
	 * Member
	 * 
	 */
	
	public Member createNewMember(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender, int cardNumber, LocalDate membershipExtension, int membershipDuration, MembershipFee membership, boolean isActive);
	public Member updateMember(String ID, String firstName, String lastName, String uniqueIdentificationNumber, Gender gender, int cardNumber, LocalDate membershipExtension, int membershipDuration, MembershipFee membership, boolean isActive);
	public void deleteMember(String ID);
	
	/*
	 * 
	 * Book
	 * 
	 */
	
	public Book createBook(String title, String originalTitle, String writer, LocalDate releaseDate, String description, Language originalLanguage, Genre genre, boolean isDeleted);
	public Book updateBook(String ID, String title, String originalTitle, String writer, LocalDate releaseDate, String description, Language originalLanguage, Genre genre, boolean isDeleted);
	public void deleteBook(String ID);
	
	/*
	 * 
	 * Book Copy
	 * 
	 */
	
	public BookCopy createBookCopy(Book book, Binding binding, Language printingLanguage, int pageNumbers, int printingYear);
	public BookCopy updateBookCopy(String ID, Book book, Binding binding, Language printingLanguage, int pageNumbers, int printingYear);
	public void deleteBookCopy(String ID);
	
	/*
	 * 
	 * Genre
	 * 
	 */
	
	public Genre createGenre(String name, String description);
	public Genre updateGenre(String ID, String name, String description);
	public void deleteGenre(String ID);
	
	/*
	 * 
	 * Membership
	 * 
	 */
	
	public MembershipFee createMembership(String type, int price);
	public MembershipFee updateMembership(String ID, String type, int price);
	public void deleteMembership(String ID);
	
	/*
	 * 
	 * RentBook
	 * 
	 */
	
	public RentBook createRent(Member member, ArrayList<BookCopy> rentedBook, LocalDate rentalDate, LocalDate returningDate);
	public RentBook updateRent(String ID, Member member, ArrayList<BookCopy> rentedBook, LocalDate rentalDate, LocalDate returningDate);
	public void deleteRent(String ID);
}
