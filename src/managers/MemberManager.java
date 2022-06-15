package managers;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Gender;
import model.Member;
import model.MembershipFee;

public class MemberManager {
public static final String FILEPATH = "src/txt/users.txt";
	
	private static MemberManager instance;
	
	private ArrayList<Member> allMembers = new ArrayList<Member>();
	
	private MemberManager() {};
	
	public static MemberManager getInstance() {
		if(instance == null) {
			instance = new MemberManager();
		}
		return instance;
	}
	
	public void loadMembersFromFile() {
		String readedFile = FileManager.readFile(FILEPATH);
		String[] splittedFile = readedFile.split("\n");
		for(String line : splittedFile) {
			Member member = memberFromFile(line);
			if (member != null) allMembers.add(member);
		}
	}
	
	public Member memberFromFile(String line) {
		String[] splittedLine = line.split("\\|");
		char index = splittedLine[0].charAt(0);
		if (index != 'M') {
			return null;
		}
		Member readMember = new Member();
		readMember.setId(splittedLine[0]);
		readMember.setFirstName(splittedLine[1]);
		readMember.setLastName(splittedLine[2]);
		readMember.setUniqueIdentificationNumber(splittedLine[3]);
		readMember.setGender(Gender.valueOf(splittedLine[4]));
		readMember.setCardNumber(Integer.parseInt(splittedLine[5]));
		readMember.setLastMembershipExtension(LocalDate.parse(splittedLine[6]));
		readMember.setMembershipDuration(Integer.parseInt(splittedLine[7]));
		readMember.setActive(Boolean.parseBoolean(splittedLine[8]));
		readMember.setMembership(MembershipManager.getInstance().findMembership(splittedLine[9]));
		readMember.setDeleted(Boolean.parseBoolean(splittedLine[10]));
		readMember.setMembershipDueDate(readMember.getLastMembershipExtension().plusMonths(readMember.getMembershipDuration()));
		if(readMember.getMembershipDueDate().isBefore(LocalDate.now())) {
			readMember.setActive(false);
			readMember.setMembershipDuration(0);
		}
		else {
			readMember.setActive(true);
		}
		return readMember;
	}

	public ArrayList<Member> getAllMembers() {
		return allMembers;
	}

	public void setAllMembers(ArrayList<Member> allMembers) {
		this.allMembers = allMembers;
	}

	public static String getFilepath() {
		return FILEPATH;
	}

	public static void setInstance(MemberManager instance) {
		MemberManager.instance = instance;
	}
	
	
	
	
}
