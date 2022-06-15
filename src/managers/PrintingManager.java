package managers;

import model.abstracts.Staff;

public class PrintingManager {
	
	public static String staffToFileFormat(Staff staff) {
		return String.format("%s|%s|%s|%s|%s|%s|%s|%s", staff.getId(), staff.getFirstName(), staff.getLastName(), staff.getUniqueIdentificationNumber(), staff.getGender().toString(), staff.getUsername(), staff.getPassword(), Double.toString(staff.getPaycheck()), Boolean.toString(staff.isDeleted()));
	}
}
