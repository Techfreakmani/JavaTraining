package com.celcom.day13.Task1;

import java.util.Random;

public class BankCustomer {

	private int customerId;
	private String name;
	private String accountNumber;
	private float balance;
	
	Random random = new Random();
	

	public BankCustomer(String name, String accountNumber) {

		this.customerId = random.nextInt(1000,999999);
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	

	public BankCustomer(int customerId, float balance) {
		this.customerId = customerId;
		this.balance = balance;
	}



	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

}
