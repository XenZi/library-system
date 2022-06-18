package managers;

import java.util.ArrayList;

import enums.Gender;
import model.RentBook;
import model.admin.Admin;

public class AdminManager {
	private static AdminManager instance;
	private ArrayList<Admin> allAdmins = new ArrayList<Admin>();
	public static final String FILEPATH = "src/txt/users.txt";
	
	private AdminManager() {}
	
	public static AdminManager getInstance() {
		if(instance == null) {
			instance = new AdminManager();
		}
		return instance;
	}
	
	public Admin findAdmin(String ID) {
		return allAdmins.stream()
						.filter(admin -> admin.getId().equals(ID))
						.findAny()
						.orElse(null);
	}

	public void loadAdminsFromFile() {
		String readedFile = FileManager.readFile(FILEPATH);
		String[] splittedFile = readedFile.split("\n");
		for(String line : splittedFile) {
			Admin admin = createAdminObject(line);
			if (admin != null) allAdmins.add(admin);
		}
	}
	
	private Admin createAdminObject(String line) {
		String[] splittedLine = line.split("\\|");
		char index = splittedLine[0].charAt(0);
		if (index != 'A') {
			return null;	
		}
		Admin readAdmin = new Admin();
		readAdmin.setId(splittedLine[0]);
		readAdmin.setFirstName(splittedLine[1]);
		readAdmin.setLastName(splittedLine[2]);
		readAdmin.setUniqueIdentificationNumber(splittedLine[3]);
		readAdmin.setGender(Gender.valueOf(splittedLine[4]));
		readAdmin.setUsername(splittedLine[5]);
		readAdmin.setPassword(splittedLine[6]);
		readAdmin.setPaycheck(Double.parseDouble(splittedLine[7]));
		readAdmin.setDeleted(Boolean.valueOf(splittedLine[8]));
		return readAdmin;
	}


	/*
	 * 
	 * GETTERS AND SETTERS
	 * 
	 */
	
	public ArrayList<Admin> getAllAdmins() {
		return allAdmins;
	}

	public void setAllAdmins(ArrayList<Admin> allAdmins) {
		this.allAdmins = allAdmins;
	}

	public static void setInstance(AdminManager instance) {
		AdminManager.instance = instance;
	}
	
	
	
}
