package managers;

import java.util.ArrayList;

import model.BookCopy;
import model.MembershipFee;

public class MembershipManager {
public static final String FILEPATH = "src/txt/membership.txt";
	
	private static MembershipManager instance;
	
	private ArrayList<MembershipFee> allMemberships = new ArrayList<MembershipFee>();
	
	private MembershipManager() {};
	
	public static MembershipManager getInstance() {
		if(instance == null) {
			instance = new MembershipManager();
		}
		return instance;
	}
	
	public void loadMemberships() {
		String readedFile = FileManager.readFile(FILEPATH);
		String[] splittedFile = readedFile.split("\n");
		for(String line : splittedFile) {
			MembershipFee fee = membershipFromFile(line);
			if (fee != null) allMemberships.add(fee);
		}
	}
	
	public MembershipFee membershipFromFile(String line) {
		MembershipFee readMembership = new MembershipFee();
		String[] splittedLine = line.split("\\|");
		readMembership.setId(splittedLine[0]);
		readMembership.setType(splittedLine[1]);
		readMembership.setPrice(Integer.parseInt(splittedLine[2]));
		readMembership.setIsDeleted(Boolean.parseBoolean(splittedLine[3]));
		return readMembership;
	}
	
	public MembershipFee findMembership(String ID) {
		return allMemberships.stream()
						.filter(membership -> membership.getId().equals(ID))
						.findAny()
						.orElse(null);
	}
}
