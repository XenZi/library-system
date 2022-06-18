package managers;

import model.abstracts.Staff;
import model.*;

public class PrintingManager {
	
	public static String staffToFileFormat(Staff staff) {
		return String.format("%s|%s|%s|%s|%s|%s|%s|%s", staff.getId(), staff.getFirstName(), staff.getLastName(), staff.getUniqueIdentificationNumber(), staff.getGender().toString(), staff.getUsername(), staff.getPassword(), Double.toString(staff.getPaycheck()), Boolean.toString(staff.isDeleted()));
	}
	
	public static String memberToFileFormat(Member member) {
		return String.format("%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s", member.getId(), member.getFirstName(), member.getLastName(), member.getUniqueIdentificationNumber(), member.getGender().toString(), Integer.toString(member.getCardNumber()), member.getLastMembershipExtension().toString(), Integer.toString(member.getMembershipDuration()), Boolean.toString(member.isActive()), member.getMembership().getId(), Boolean.toString(member.isDeleted()));
	}
	
	public static String membershipToFileFormat(MembershipFee membership) 	{
		return String.format("%s|%s|%s|%s",membership.getId(), membership.getType(), Integer.toString(membership.getPrice()), Boolean.toString(membership.getIsDeleted()));
	}
	
	public static String bookToFileFormat(Book book) {
		return String.format("%s|%s|%s|%s|%s|%s|%s|%s|%s", book.getId(), book.getTitle(), book.getOriginalTitle(), book.getWriter(), book.getReleaseDate(), book.getDescription(), book.getOriginalLanguage(), book.getGenre().getId(), Boolean.toString(book.getIsDeleted()));
	}
	
	public static String bookCopyToFileFormat(BookCopy book) {
		return String.format("%s|%s|%s|%s|%s|%s|%s|%s", book.getId(), book.getBook().getId(), book.getBinding().toString(), book.getPrintingLanguage().toString(), Integer.toString(book.getPageNumbers()), Integer.toString(book.getPrintingYear()), Boolean.toString(book.isRented()), Boolean.toString(book.isDeleted()));
	}
	
	public static String rentBookToFileFormat(RentBook rental) {
		return String.format("%s|%s|%s|%s|%s|%s|%s", rental.getId(), rental.getStaff().getId(), rental.getMember().getId(), RentalManager.rentedBooksToFileFormat(rental.getRentedBooks()), rental.getRentalDate().toString(), rental.getReturningDate().toString(), Boolean.toString(rental.isDeleted()));
	}
	
	public static String genreToFileFormat(Genre genre) {
		return String.format("%s|%s|%s|%s", genre.getId(), genre.getName(), genre.getDescription(), Boolean.toString(genre.isDeleted()));
	}
	
	public static String libraryToFileFormat(Library library) {
		return String.format("%s|%s|%s|%s|%s", library.getID(), library.getTitle(), library.getAddress(), library.getPhoneNumber(), library.getWorkingTime());
	}
}
