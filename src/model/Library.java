package model;

public class Library {
	private String title;
	private String address;
	private String phoneNumber;
	private String workingTime;
	private String ID;
	
	public Library() {
		this.title = "";
		this.address = "";
		this.phoneNumber = "";
		this.workingTime = "";
		this.ID = "";
	}
	
	public Library(String title, String address, String phoneNumber, String workingTime, String ID) {
		this.title = title;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.workingTime = workingTime;
		this.ID = ID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(String workingTime) {
		this.workingTime = workingTime;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Library [title=" + title + ", address=" + address + ", phoneNumber=" + phoneNumber + ", workingTime="
				+ workingTime + ", ID=" + ID + "]";
	}
	
	
	
	
}
