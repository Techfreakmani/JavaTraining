package com.celcom.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcExample {
	private static final String URL = "jdbc:mysql://localhost:3306/JavaTraining";
	private static final String USER = "root";
	private static final String PASSWORD = "Mani2003@";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, USER, PASSWORD); // to establish a connection
			while (true) {
				System.out.println(
						"Please Enter your choice \n1.To insert the data into table\n2.To update the data in table\n3.To delete the data in table\n4.Exit");
				int choice = sc.nextInt();

				switch (choice) {

				case 1:
					System.out.println("Please enter the number of datas you want to be insert");
					int data = sc.nextInt();
					while (data > 0) {

						String str1 = "insert into Test values(?,?,?)";

						PreparedStatement st = con.prepareStatement(str1);
						System.out.println("Enter your id :");
						st.setInt(1, sc.nextInt());
						sc.nextLine();
						System.out.println("Enter your Name :");
						st.setString(2, sc.nextLine());
						System.out.println("Enter your gmail :");
						st.setString(3, sc.nextLine());
						st.executeUpdate();
						System.out.println("Data addeded successfully :)");
						data--;
						
					}
					break;
				case 2:
					System.out.println("Please enter the id to update the name");
					int idChoice = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the new Name");
					String newName = sc.nextLine();

					String str2 = "update Test set name = ? where id = ? ";
					PreparedStatement st1 = con.prepareStatement(str2);
					st1.setString(1, newName);
					st1.setInt(2, idChoice);
					st1.executeUpdate();
					System.out.println("Data Updated successfully :)");
					break;

				case 3:
					System.out.println("Please enter the id to delete the data");
					int idChoice1 = sc.nextInt();

					String str3 = "delete from Test where id = ?";
					PreparedStatement st2 = con.prepareStatement(str3);
					st2.setInt(1, idChoice1);
					st2.executeUpdate();
					System.out.println("Data deleted successfully :)");
					break;

				case 4:
					System.out.println("Thank you");
					System.exit(0);
				case 5:
					System.out.println("Please enter a valid input");
					return;
					

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
