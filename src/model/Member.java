package model;

import java.time.LocalDate;

import enums.Gender;
import model.abstracts.User;

public class Member extends User{
	private int cardNumber;
	private LocalDate lastMembershipExtension;
	private int membershipDuration;
	private boolean isActive;
	private MembershipFee membership;
	private LocalDate membershipDueDate;
	
	public Member() {
		// TODO Auto-generated constructor stub
		this.cardNumber = -1;
		this.lastMembershipExtension = null;
		this.membershipDuration = -1;
		this.isActive = false;
		this.membership = null;
		this.membershipDueDate = null;
	}
	
	public Member(String firstName, String lastName, String uniqueIdentificationNumber, Gender gender, int cardNumber, LocalDate lastMembershipExtension, int membershipDuration, MembershipFee membership, boolean isActive) {
		super(firstName, lastName, uniqueIdentificationNumber, gender);
		this.cardNumber = cardNumber;
		this.lastMembershipExtension = lastMembershipExtension;
		this.membershipDuration = membershipDuration;
		this.isActive = isActive;
		this.membership = membership;
		this.membershipDueDate = lastMembershipExtension.plusMonths(membershipDuration);
	}

	/*
	 * 
	 * GETTERS AND SETTERS
	 * 
	 */
	
	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public LocalDate getLastMembershipExtension() {
		return lastMembershipExtension;
	}

	public void setLastMembershipExtension(LocalDate lastMembershipExtension) {
		this.lastMembershipExtension = lastMembershipExtension;
	}

	public int getMembershipDuration() {
		return membershipDuration;
	}

	public void setMembershipDuration(int membershipDuration) {
		this.membershipDuration = membershipDuration;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public MembershipFee getMembership() {
		return membership;
	}

	public void setMembership(MembershipFee membership) {
		this.membership = membership;
	}

	public LocalDate getMembershipDueDate() {
		return membershipDueDate;
	}

	public void setMembershipDueDate(LocalDate membershipDueDate) {
		this.membershipDueDate = membershipDueDate;
	}
	
	
}
