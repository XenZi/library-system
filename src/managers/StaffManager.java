package managers;

import java.util.ArrayList;

import model.RentBook;
import model.abstracts.Staff;
import model.admin.Admin;
import model.librarian.Librarian;

public class StaffManager {
	private static StaffManager instance;
	private ArrayList<Staff> allStaff = new ArrayList<Staff>();
	
	private StaffManager() {}
	
	public static StaffManager getInstance() {
		if (instance == null) {
			instance = new StaffManager();
		}
		
		return instance;
	}

	
	public void fillWithStaff(ArrayList<Admin> adminList, ArrayList<Librarian> librarianList) {
		adminList.forEach(el -> allStaff.add(el));
		librarianList.forEach(el -> allStaff.add(el));
	}
	
	public Staff findStaff(String ID) {
		return allStaff.stream()
						.filter(staff -> staff.getId().equals(ID))
						.findAny()
						.orElse(null);
	}
	
	/*
	 * 
	 * GETTERS AND SETTERS
	 * 
	 */
	
	
	public ArrayList<Staff> getAllStaff() {
		return allStaff;
	}

	public void setAllStaff(ArrayList<Staff> allStaff) {
		this.allStaff = allStaff;
	}

	public static void setInstance(StaffManager instance) {
		StaffManager.instance = instance;
	}

}
