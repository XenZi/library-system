package model.abstracts;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Binding;
import enums.Gender;
import enums.Language;
import interfaces.LibrarianPermissions;
import managers.BookCopyManager;
import managers.BookManager;
import managers.FileManager;
import managers.GenreManager;
import managers.MemberManager;
import managers.MembershipManager;
import managers.RentalManager;
import managers.UniqueIDManager;
import model.Book;
import model.BookCopy;
import model.Genre;
import model.Member;
import model.MembershipFee;
import model.RentBook;

public abstract class StaffService implements LibrarianPermissions {
	

	
	@Override
	public Member createNewMember(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender,
			int cardNumber, LocalDate membershipExtension, int membershipDuration, MembershipFee membership,
			boolean isActive) {
		Member createdMember = new Member(firstName, lastName, uniqueIdentificationNumber, gender, cardNumber, membershipExtension,membershipDuration, membership, true);
		createdMember.setId(UniqueIDManager.generateMemberID());
		while(UniqueIDManager.checkIDExisting(MemberManager.getFilepath(), createdMember.getId())) {
			createdMember.setId(UniqueIDManager.generateMemberID());
		}
		MemberManager.getInstance().getAllMembers().add(createdMember);
		return createdMember;
	}

	@Override
	public Member updateMember(String ID, String firstName, String lastName, String uniqueIdentificationNumber,
			Gender gender, int cardNumber, LocalDate membershipExtension, int membershipDuration,
			MembershipFee membership, boolean isActive) {
		// TODO Auto-generated method stub
		Member updateSpecifiedMember = MemberManager.getInstance().findMember(ID);
		updateSpecifiedMember.setFirstName(firstName);
		updateSpecifiedMember.setLastName(lastName);
		updateSpecifiedMember.setUniqueIdentificationNumber(uniqueIdentificationNumber);
		updateSpecifiedMember.setGender(gender);
		updateSpecifiedMember.setCardNumber(cardNumber);
		updateSpecifiedMember.setLastMembershipExtension(membershipExtension);
		updateSpecifiedMember.setMembershipDuration(membershipDuration);
		updateSpecifiedMember.setMembership(membership);
		updateSpecifiedMember.setMembershipDueDate(membershipExtension.plusMonths(membershipDuration));
				if(updateSpecifiedMember.getMembershipDueDate().isBefore(LocalDate.now())) {
			updateSpecifiedMember.setActive(false);
			updateSpecifiedMember.setMembershipDuration(0);
		}
		else {
			updateSpecifiedMember.setActive(true);
		}
		return updateSpecifiedMember;
	}

	@Override
	public void deleteMember(String ID) {
		Member updateSpecifiedMember = MemberManager.getInstance().findMember(ID);
		updateSpecifiedMember.setDeleted(true);
	}

	@Override
	public Book createBook(String title, String originalTitle, String writer, LocalDate releaseDate, String description,
			Language originalLanguage, Genre genre, boolean isDeleted) {
		Book newBook = new Book(title, originalTitle, writer, releaseDate, description, originalLanguage, genre);		
		newBook.setId(UniqueIDManager.generateRandomID());
		while(UniqueIDManager.checkIDExisting(BookManager.getFilepath(), newBook.getId())) {
			newBook.setId(UniqueIDManager.generateRandomID());
		}
		BookManager.getInstance().getAllBooks().add(newBook);
		return newBook;
	}

	@Override
	public Book updateBook(String ID, String title, String originalTitle, String writer, LocalDate releaseDate,
			String description, Language originalLanguage, Genre genre, boolean isDeleted) {
		Book book = BookManager.getInstance().findBook(ID);
		book.setTitle(title);
		book.setOriginalTitle(originalTitle);
		book.setWriter(writer);
		book.setReleaseDate(releaseDate);
		book.setDescription(description);
		book.setOriginalLanguage(originalLanguage);
		book.setGenre(genre);
		book.setIsDeleted(isDeleted);
		return book;
	}

	@Override
	public void deleteBook(String ID) {
		Book book = BookManager.getInstance().findBook(ID);
		book.setIsDeleted(true);
	}

	@Override
	public BookCopy createBookCopy(Book book, Binding binding, Language printingLanguage, int pageNumbers,
			int printingYear) {
		BookCopy bookCopy = new BookCopy(book, binding, printingLanguage, pageNumbers, printingYear);
		bookCopy.setId(UniqueIDManager.generateRandomID());
		
		while(UniqueIDManager.checkIDExisting(BookCopyManager.getFilepath(), bookCopy.getId())) {
			bookCopy.setId(UniqueIDManager.generateRandomID());
		}
		BookCopyManager.getInstance().getAllCopyBooks().add(bookCopy);
		return bookCopy;
	}

	@Override
	public BookCopy updateBookCopy(String ID, Book book, Binding binding, Language printingLanguage, int pageNumbers,
			int printingYear) {
		BookCopy bookCopy = BookCopyManager.getInstance().findBookCopy(ID);
		bookCopy.setBook(book);
		bookCopy.setBinding(binding);
		bookCopy.setPrintingLanguage(printingLanguage);
		bookCopy.setPageNumbers(pageNumbers);
		bookCopy.setPrintingLanguage(printingLanguage);
		bookCopy.setPrintingYear(printingYear);
		return bookCopy;
	}

	@Override
	public void deleteBookCopy(String ID) {
		BookCopy bookCopy = BookCopyManager.getInstance().findBookCopy(ID);
		bookCopy.setDeleted(true);
	}

	@Override
	public Genre createGenre(String name, String description) {
		Genre newGenre = new Genre(name, description);
		newGenre.setId(UniqueIDManager.generateRandomID());
		while(UniqueIDManager.checkIDExisting(GenreManager.getFilepath(), newGenre.getId())) {
			newGenre.setId(UniqueIDManager.generateRandomID());
		}
		GenreManager.getInstance().getAllGenres().add(newGenre);
		return newGenre;	
	}

	@Override
	public Genre updateGenre(String ID, String name, String description) {
		Genre genre = GenreManager.getInstance().findGenre(ID);		
		genre.setDescription(description);
		genre.setName(name);
		return genre;
	}

	@Override
	public void deleteGenre(String ID) {
		Genre genre = GenreManager.getInstance().findGenre(ID);		
		genre.setDeleted(true);
	}

	@Override
	public MembershipFee createMembership(String type, int price) {
		MembershipFee membershipFee = new MembershipFee(type, price);
		membershipFee.setId(UniqueIDManager.generateRandomID());
		while(UniqueIDManager.checkIDExisting(MembershipManager.getFilepath(), membershipFee.getId())) {
			membershipFee.setId(UniqueIDManager.generateRandomID());
		}
		MembershipManager.getInstance().getAllMemberships().add(membershipFee);
		return membershipFee;
	}

	@Override
	public MembershipFee updateMembership(String ID, String type, int price) {
		MembershipFee membership = MembershipManager.getInstance().findMembership(ID);		
		membership.setType(type);
		membership.setPrice(price);
		return membership;
	}

	@Override
	public void deleteMembership(String ID) {
		MembershipFee membership = MembershipManager.getInstance().findMembership(ID);		
		membership.setIsDeleted(true);
	}

	@Override
	abstract public RentBook createRent(Member member, ArrayList<BookCopy> rentedBook, LocalDate rentalDate,
			LocalDate returningDate);

	@Override
	public RentBook updateRent(String ID, Member member, ArrayList<BookCopy> rentedBook, LocalDate rentalDate,
			LocalDate returningDate) {
		RentBook rental = RentalManager.getInstance().findRental(ID);
		rental.setMember(member);
		rental.setRentedBooks(rentedBook);
		rental.setRentalDate(rentalDate);
		rental.setReturningDate(returningDate);
		return null;
	}

	@Override
	public void deleteRent(String ID) {
		RentBook rental = RentalManager.getInstance().findRental(ID);
		rental.setDeleted(true);
	}

}
