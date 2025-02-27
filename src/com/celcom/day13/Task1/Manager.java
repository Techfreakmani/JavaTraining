package com.celcom.day13.Task1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.celcom.day12.task3.Connector;

public class Manager {
	Scanner sc = new Scanner(System.in);

	// To add new Customer
	public void add() {

		System.out.println("Enter your Name");
		String name = sc.nextLine();

		System.out.println("Enter your accountNumber");
		String accountNumber = sc.nextLine();

		BankCustomer bank = new BankCustomer(name, accountNumber);

		String query = "insert into BankCustomer values (?,?,?,?)";

		try {
			PreparedStatement statement = JdbcConnector.con.prepareStatement(query);
			statement.setInt(1, bank.getCustomerId());
			statement.setString(2, bank.getName());
			statement.setString(3, bank.getAccountNumber());
			statement.setFloat(4, bank.getBalance());

			int result = statement.executeUpdate();

			if (result == 0) {
				System.out.println("Please enter a valid Details");
				System.out.println("---------------------------------------");
			} else {
				System.out.println("Data inserted sucessfully !");
				System.out.println("Your Customer id is : " + bank.getCustomerId());
				System.out.println("---------------------------------------");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	// To view all customer details
	public void viewAll() {

		String query = "select * from BankCustomer";
		PreparedStatement statement;
		try {
			statement = JdbcConnector.con.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			if (!result.next()) {
				System.out.println("No data exist!");
			} else {
				while (result.next()) {
					System.out.println("Customer Detail");
					System.out.println("Customer id : " + result.getInt(1));
					System.out.println("Customer Name : " + result.getString(2));
					System.out.println("Customer accountNumber : " + result.getString(3));
					System.out.println("Account balance : " + result.getString(4));
					System.out.println("---------------------------------------");
				}
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// To view customer details based on balance
	public void view() {
		System.out.println("Enter the Balance amount to check");
		float balance = sc.nextFloat();
		String query = "select * from BankCustomer where balance > ?";

		PreparedStatement statement;
		try {
			statement = JdbcConnector.con.prepareStatement(query);
			statement.setFloat(1, balance);
			ResultSet result = statement.executeQuery();

			int count = 0;

			while (result.next()) {
				System.out.println("Customer Detail");
				System.out.println("Customer id : " + result.getInt(1));
				System.out.println("Customer Name : " + result.getString(2));
				System.out.println("Customer accountNumber : " + result.getString(3));
				System.out.println("Account balance : " + result.getString(4));
				System.out.println("---------------------------------------");
				count++;
			}
			if (count == 0)
				System.out.println("No data Exist!");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// To Update balance
	public void update() {
		System.out.println("Enter your customer id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter new balance amount");
		float balance = sc.nextFloat();

		String query = "update BankCustomer set balance = ? where id = ?";

		try {
			PreparedStatement statement = JdbcConnector.con.prepareStatement(query);
			statement.setFloat(1, balance);
			statement.setInt(2, id);

			int result = statement.executeUpdate();

			if (result == 0) {
				System.out.println("please enter a valid Id!");
				System.out.println("---------------------------------------");
			} else {
				System.out.println("Data Updated successfully ! ");
				System.out.println("---------------------------------------");

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// To delete details
	public void delete() {

		System.out.println("Enter your customer id");
		int id = sc.nextInt();
		sc.nextLine();

		String query = "delete from BankCustomer where id = ?";
		try {
			PreparedStatement statement = JdbcConnector.con.prepareStatement(query);
			statement.setInt(1, id);

			int result = statement.executeUpdate();

			if (result == 0) {
				System.out.println("Please enter a valid id !");
				System.out.println("---------------------------------------");
			} else {
				System.out.println("Data deleted successfully");
				System.out.println("---------------------------------------");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// to deposit amount
	public void deposit() {

		System.out.println("please enter the customer id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter the amount to deposit");
		float amount = sc.nextFloat();

		String query = "update BankCustomer set balance = balance + ? where id = ?";

		try {
			PreparedStatement statement = JdbcConnector.con.prepareStatement(query);
			statement.setFloat(1, amount);
			statement.setInt(2, id);
			int result = statement.executeUpdate();
			if (result == 0) {
				System.out.println("Please try again....");
				System.out.println("---------------------------------------");

			} else {
				System.out.println("Amount Deposited successfully");
				System.out.println("---------------------------------------");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// to withdraw amount
	public void withdraw() throws SQLException {

		System.out.println("please enter the customer id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter the amount to withdraw");
		float amount = sc.nextFloat();

		String query1 = "select balance from BankCustomer where id = ?";
		PreparedStatement statement1 = JdbcConnector.con.prepareStatement(query1);
		statement1.setInt(1, id);
		ResultSet obj = statement1.executeQuery();

		if (!obj.next()) {
			System.out.println("Enter valid user id");
			return;
		}

		float balance = obj.getFloat("balance") - amount;

		String query = "update BankCustomer set balance =  ? where id = ?";

		PreparedStatement statement = JdbcConnector.con.prepareStatement(query);
		statement.setFloat(1, balance);
		statement.setInt(2, id);
		int result = statement.executeUpdate();
		if (result == 0) {
			System.out.println("Please try again....");
			System.out.println("---------------------------------------");

		} else {
			System.out.println("Amount Withdrawn successfully");
			System.out.println("---------------------------------------");
		}

	}

}
