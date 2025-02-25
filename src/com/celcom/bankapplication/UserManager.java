package com.celcom.bankapplication;

import java.util.Scanner;

public class UserManager {
	Scanner sc = new Scanner(System.in);
	static long accountNumber;

	// to verify the user
	public boolean verify() {

		System.out.println("Enter Your Account Number");
		long userAccountNumber = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter your Password");
		String password = sc.nextLine();

		if (AccountManager.listOfAccounts.containsKey(userAccountNumber)) {

			if (AccountManager.listOfAccounts.get(userAccountNumber).getPassword().equals(password)) {

				accountNumber = userAccountNumber;
				System.out.println("Login Success");
				return true;
			}
		}
		System.out.println("Invalid Id or Password");
		return false;

	}

	public void user() {

		boolean flag = true;
		TransactionManager manage = new TransactionManager();
		AccountManager manageAccount = new AccountManager();
		while (flag) {
			System.out.println("Enter your Choice");
			System.out.println("1. Deposit Balance");
			System.out.println("2. Withdraw Money");
			System.out.println("3. View Details");
			System.out.println("4. Exit");
			int userChoice = sc.nextInt();

			switch (userChoice) {

			case 1:
				manage.deposit();
				break;

			case 2:
				manage.withdraw();
				break;

			case 3:
				manageAccount.viewDetails();
				break;

			case 4:
				flag = false;

			default:
				flag = false;

			}
		}

	}

}
