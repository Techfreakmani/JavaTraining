package com.celcom.bankapplication;

import java.util.Random;

public class Account {
	private long accountNumber;
	private String accountHolderName;
	private String branchName;
	private long phoneNumber;
	private double balance;

	private String password;
	Random random = new Random();

	Account(String accountHolderName, String branchName, long phoneNumber, String password) {
		this.accountHolderName = accountHolderName;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.accountNumber = random.nextLong(100000000, 999999999);
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

}
