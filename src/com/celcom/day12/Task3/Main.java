package com.celcom.day12.task3;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	static {
		Connector.access();
	}

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		CustomerManager manage = new CustomerManager();

		while (true) {
			System.out.println(
					"Enter your choice\n 1.Add Customer details\n2.Update Customer details\n3.Delete Customer details\n4.View Customer detail\n5.View All customer Details\n6.Exit");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				manage.addDetails();
				break;

			case 2:
				manage.updateDetails();
				break;

			case 3:
				manage.deleteDetails();
				break;

			case 4:
				manage.viewDetails();
				break;

			case 5:
				manage.viewAllDetails();
				break;

			case 6:
				System.out.println("Thank you !");
				System.exit(0);
			default:
				System.out.println("Please enter a valid choice");
				return;
			}

		}

	}

}
