package com.celcom.day12.Task3;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.celcom.jdbc_example.JdbcConnection;

public class CustomerManager {
	Scanner sc = new Scanner(System.in);

	// To add new customer
	public void addDetails() throws SQLException {
		System.out.println("Enter you Name");
		String name = sc.nextLine();

		System.out.println("Enter you DOB in (YYYY-MM-DD) format");
		String dob = sc.next();
		sc.nextLine();

		System.out.println("Enter your address");
		String address = sc.nextLine();

		System.out.println("Enter your father Name");
		String fatherName = sc.nextLine();

		System.out.println("Enter your AadharNumber");
		int aadharNumber = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter your phoneNumber");
		int phoneNumber = sc.nextInt();
		sc.nextLine();

		String query = "insert into customer values (?,?,?,?,?,?)";

		PreparedStatement statement = Connector.con.prepareStatement(query);
		statement.setString(1, name);
		statement.setDate(2, Date.valueOf(dob));
		statement.setString(3, address);
		statement.setString(4, fatherName);
		statement.setInt(5, aadharNumber);
		statement.setInt(6, phoneNumber);

		int res = statement.executeUpdate();
		if (res == 0) {
			System.out.println("Please enter a valid data");
		} else {

			System.out.println("Data added successfully....!");
		}
		System.out.println("--------------------------------------");

	}

	// To update the customer details
	public void updateDetails() throws SQLException {

		System.out.println("Enter aadharNumber to Update the your address");
		int aadharno = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter your New Address");
		String address1 = sc.nextLine();

		String query = "update customer set address = ? where aadharNumber = ?";

		PreparedStatement statement = Connector.con.prepareStatement(query);
		statement.setString(1, address1);
		statement.setInt(2, aadharno);

		int res = statement.executeUpdate();
		if (res == 0) {
			System.out.println("Please enter a valid aadharNumber");
		} else {

			System.out.println("Data Updated successfully....!");
		}
		System.out.println("--------------------------------------");
	}

	// To delete customer details

	public void deleteDetails() throws SQLException {
		System.out.println("Enter aadharNumber to Delete your record");
		int aadharno = sc.nextInt();
		sc.nextLine();

		String query = "delete customer where aadharNumber = ?";

		PreparedStatement statement = Connector.con.prepareStatement(query);
		statement.setInt(1, aadharno);
		int res = statement.executeUpdate();
		if (res == 0) {
			System.out.println("Please enter a valid aadharNumber");
		} else {

			System.out.println("Data Deleted successfully....!");
		}
		System.out.println("--------------------------------------");

	}

	// To view customer details
	public void viewDetails() throws SQLException {
		System.out.println("Enter aadharNumber to view your details");
		int aadharno = sc.nextInt();
		sc.nextLine();

		String query = "select * from customer where aadharNumber = ?";

		PreparedStatement statement = Connector.con.prepareStatement(query);
		statement.setInt(1, aadharno);

		ResultSet result = statement.executeQuery();
		result.next();

		System.out.println("Customer Detail");
		System.out.println("Customer Name : " + result.getString(1));
		System.out.println("Customer DOB : " + result.getDate(2));
		System.out.println("Customer address : " + result.getString(3));
		System.out.println("Customer fatherName : " + result.getString(4));
		System.out.println("Customer aadharNumber : " + result.getLong(5));
		System.out.println("Customer phoneNumber : " + result.getInt(6));

	}

	// To view All customer details
	public void viewAllDetails() throws SQLException {

		String query = "select * from customer";
		PreparedStatement statement = Connector.con.prepareStatement(query);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			System.out.println("Customer Detail");
			System.out.println("Customer Name : " + result.getString(1));
			System.out.println("Customer DOB : " + result.getDate(2));
			System.out.println("Customer address : " + result.getString(3));
			System.out.println("Customer fatherName : " + result.getString(4));
			System.out.println("Customer aadharNumber : " + result.getLong(5));
			System.out.println("Customer phoneNumber : " + result.getInt(6));
			System.out.println("-----------------------------------------------------");

		}

	}

}
