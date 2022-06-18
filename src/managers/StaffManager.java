package managers;

import java.util.ArrayList;

import model.abstracts.Staff;

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
