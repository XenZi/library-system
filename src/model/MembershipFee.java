package model;


public class MembershipFee {
	private String type;
	private int price;
	private Boolean isDeleted;
	private String id;

	public MembershipFee() {
		this.id = "";
		this.type = "";
		this.price = 0;
		this.isDeleted = false;
	}
	
	public MembershipFee(String type, int price) {
		this.type = type;
		this.price = price;
		this.isDeleted = false;
	}

	/*
	 * 
	 * GETTERS AND SETTERS
	 * 
	 */
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "MembershipFee [type=" + type + ", price=" + price + ", isDeleted=" + isDeleted + ", id=" + id + "]";
	}
	
	
	
}
