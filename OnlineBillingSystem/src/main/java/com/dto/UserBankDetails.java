package com.dto;

public class UserBankDetails {

	private int balance;
	private String accoutNum;

	public UserBankDetails() {
	}
	@Override
	public String toString() {
		return "UserBankDetails [bankName=" + balance + ", accoutNum=" + accoutNum + "]";
	}

	public UserBankDetails(int balance, String accoutNum) {
		super();
		this.balance = balance;
		this.accoutNum = accoutNum;
	}
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccoutNum() {
		return accoutNum;
	}

	public void setAccoutNum(String accoutNum) {
		this.accoutNum = accoutNum;
	}

}
