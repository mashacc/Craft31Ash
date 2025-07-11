package com.oops.Encapsulation;

public class Account {

	private String fullName;
	private long accountNumber;
	private String address;
	private String email;
	private double depositAmount;
	private double accountBalance;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = (long) (accountNumber + depositAmount);
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getdepositAmount() {
		return depositAmount;
	}
	public void setdepositAmount(double dempositAmount) {
		if(depositAmount > 100) {
		depositAmount = depositAmount+0;	 
		}
		System.out.println("the amount should be > 100!!!");
	}
	public double getTotalBalance() {
		return accountBalance + depositAmount;
	}
	public void setTotalBalance(double totalBalance) {
		this.accountBalance = totalBalance;
	}
	
	// defining part
	
	
}
