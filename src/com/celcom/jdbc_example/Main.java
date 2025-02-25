package com.celcom.jdbc_example;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		EmployeeManager manage = new EmployeeManager();

		while (true) {
			System.out.println(
					"Enter your choice\n 1.Add employee details\n2.Update employee details\n3.Delete employee details\n4.View employee details\n5.Exit");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				manage.addEmployeeDetails();
				break;

			case 2:
				manage.updateEmployeeDetail();
				break;

			case 3:
				manage.deleteEmployeeDetail();
				break;

			case 4:
				manage.viewEmployeeRecords();
				break;

			case 5:
				System.out.println("Thank you !");
				System.exit(0);
			default:
				System.out.println("Please enter a valid choice");
				return;
			}

		}

	}

}
