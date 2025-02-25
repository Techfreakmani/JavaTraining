package com.celcom.bankapplication;

import java.util.Scanner;

public class TransactionManager {

	Account account;
	Scanner sc = new Scanner(System.in);

	// to deposit amount
	void deposit() {

		System.out.println("Please Enter the Amount to Deposit");
		double amount = sc.nextDouble();
		account = AccountManager.listOfAccounts.get(UserManager.accountNumber);
		amount = account.getBalance() + amount;
		account.setBalance(amount);
		System.out.println("Amount Deposited Successfully :)");
	}

	// to withdraw amount
	void withdraw() {
		System.out.println("Please Enter the Amount to Withdraw");
		double amount = sc.nextDouble();
		account = AccountManager.listOfAccounts.get(UserManager.accountNumber);
		if (account.getBalance() < amount) {
			System.out.println("Insufficient Balance");
			return;
		}
		amount = account.getBalance() - amount;
		account.setBalance(amount);
		System.out.println("Amount Withdrawn Successfully !");
		;

	}

}
