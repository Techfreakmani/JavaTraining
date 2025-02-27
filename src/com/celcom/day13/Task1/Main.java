package com.celcom.day13.Task1;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager manage = new Manager();

		while (true) {
			System.out.println(
					"Enter your choice\n 1.Insert Customer details\n2.view all Customer details\n3.View Customer \n4.Update balance \n5.Delete Customer details\n6.Deposit Amount \n7.Withraw Amount\n8.Exit");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				manage.add();
				break;

			case 2:
				manage.viewAll();
				break;

			case 3:
				manage.view();
				break;

			case 4:
				manage.update();
				break;

			case 5:
				manage.delete();
				break;

			case 6:
				manage.deposit();
				break;

			case 7:
				try {
					manage.withdraw();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				break;

			case 8:
				System.out.println("Thank you !");
				System.exit(0);
			default:
				System.out.println("Please enter a valid choice");
				return;
			}

		}

	}

}
