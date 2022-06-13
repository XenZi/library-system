package managers;

import model.Admin;

public class AdminManager {
	private static Admin instance;
	
	private AdminManager() {}
	
	public static Admin getInstance() {
		if(instance == null) {
			instance = new Admin();
		}
		return instance;
	}
}
