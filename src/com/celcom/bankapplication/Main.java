package com.celcom.bankapplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountManager accountmanager = new AccountManager();
		UserManager userManager = new UserManager();
		while (true) {

			System.out.println("Enter your choice :");
			System.out.println("1. Login");
			System.out.println("2. Create new Account");
			System.out.println("3. Delete an account");
			System.out.println("4. Exit");

			int choice = sc.nextInt();
			boolean flag = true;
			switch (choice) {
			case 1:
				if (userManager.verify()) {

					userManager.user();

				}
				break;

			case 2:
				accountmanager.createAccount();
				break;

			case 3:
				accountmanager.deleteAccount();
				break;

			case 4:
				System.out.println("Thank you Please visit Again");
				System.exit(0);
			default:
				System.out.println("Please Enter a valid Input");
				break;
			}

		}
	}

}