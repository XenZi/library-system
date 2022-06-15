package main;

import model.*;
import model.admin.Admin;
import enums.*;
import managers.*;

public class Main {

	public static void main(String[] args) {
//		System.out.println(FileManager.readFile(AdminManager.FILEPATH));
		AdminManager adminManager = AdminManager.getInstance();
		adminManager.loadAdminsFromFile();
		System.out.println(adminManager.getAllAdmins());
		MembershipManager membershipManager = MembershipManager.getInstance();
		membershipManager.loadMemberships();
		MemberManager memberManager = MemberManager.getInstance();
		memberManager.loadMembersFromFile();
		System.out.println(memberManager.getAllMembers());
	}

}
