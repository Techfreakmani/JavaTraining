package com.celcom.bankapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountManager {

	static Map<Long, Account> listOfAccounts = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	// to view current account details
	void viewDetails() {
		Account view = listOfAccounts.get(UserManager.accountNumber);
		System.out.println("AccountHolderName : " + view.getAccountHolderName());
		System.out.print("Account Number : " + view.getAccountNumber());
		System.out.println("Balance : " + view.getBalance());

	}

	// to create new account
	void createAccount() {

		System.out.println("Enter Your Name");
		String name = sc.nextLine();
		System.out.println("Enter Branch Name");
		String branch = sc.nextLine();
		System.out.println("Enter your Phone Number");
		long phno = sc.nextLong();
		sc.nextLine();
		System.out.println("Set your Password");
		String password = sc.nextLine();

		Account account = new Account(name, branch, phno, password);
		listOfAccounts.put(account.getAccountNumber(), account);
		System.out.println("Account created successfully");
		System.out.println("Your Account Number is :" + account.getAccountNumber());

	}

	// to delete account
	void deleteAccount() {

		System.out.println("Enter Account Number for delete");
		long accountno = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Password");
		String pass = sc.nextLine();
		if (listOfAccounts.containsKey(accountno)) {
			Account delete = listOfAccounts.get(accountno);
			if (delete.getPassword().equals(pass)) {
				listOfAccounts.remove(delete);
				System.out.println("Account Removed Successfully");
				return;
			}
		}
		System.out.println("Please Enter a valid Account Number or Password");

	}

}
