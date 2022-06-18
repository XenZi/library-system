package managers;

public class UniqueIDManager {
	
	public static String generateRandomID() {
		String ID = "";
		for(int i=0;i<6;i++) {
			ID += Integer.toString((int)(Math.random() * (10 - 0) + 0));
		}
		return ID;
		
	}
	
	public static String generateAdminID() {
		String adminID = "A-";
		for(int i=0;i<6;i++) {
			int number = (int) Math.floor((Math.random()*(0-10+1)+ 0) * (-1));
			adminID += Integer.toString(number);
		}
		return adminID;
	}
	
	public static String generateLibrarianID() {
		String adminID = "L-";
		for(int i=0;i<6;i++) {
			int number = (int) Math.floor((Math.random()*(0-10+1)+ 0) * (-1));
			adminID += Integer.toString(number);
		}
		return adminID;
	}
	
	public static String generateMemberID() {
		String adminID = "M-";
		for(int i=0;i<6;i++) {
			int number = (int) Math.floor((Math.random()*(0-10+1)+ 0) * (-1));
			adminID += Integer.toString(number);
		}
		return adminID;
	}
	
	public static boolean checkIDExisting(String path, String id) {
		String fileContent = FileManager.readFile(path);
		String[] fileContentArray = fileContent.split("\n");
		for(String line: fileContentArray) {
			String[] splitLine = line.split("\\|");
			if(splitLine[0].equals(id)) return true;
		}
		return false;
	}
}
