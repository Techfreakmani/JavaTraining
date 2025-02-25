package com.celcom.jdbc_example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeManager {
	Scanner sc = new Scanner(System.in);

	// to add employee details
	public void addEmployeeDetails() throws SQLException {
		System.out.println("Enter your name:");
		String ename = sc.nextLine();
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your salary");
		double esalary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter your phone number");
		long phoneNumber = sc.nextLong();

		String query = "insert into Employee(ename,age,salary,phoneNumber) values (?,?,?,?)";

		PreparedStatement statement = JdbcConnection.con.prepareStatement(query);

		statement.setString(1, ename);
		statement.setInt(2, age);
		statement.setDouble(3, esalary);
		statement.setLong(4, phoneNumber);
		statement.executeUpdate();
		System.out.println("Employee detail Added successfully :)");

		String employeeId = "select id from Employee order by id desc limit 1";
		PreparedStatement statementId = JdbcConnection.con.prepareStatement(employeeId);
		ResultSet result = statementId.executeQuery();
		result.next();
		System.out.println("Your employee id is :" + result.getInt(1));

	}

	// to modify the employee details
	public void updateEmployeeDetail() throws SQLException {
		System.out.println("Enter employee id to update employee details");
		int id1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter new employee name");
		String name = sc.nextLine();
		System.out.println("Enter new age");
		int eage = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter new salary");
		double esalary1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter new phoneNumber");
		long phno = sc.nextLong();

		String query1 = "update Employee set ename = ?,age = ?,salary = ?,phoneNumber = ? where id = ?";
		PreparedStatement statement1 = JdbcConnection.con.prepareStatement(query1);
		statement1.setString(1, name);
		statement1.setInt(2, eage);
		statement1.setDouble(3, esalary1);
		statement1.setLong(4, phno);
		statement1.setInt(5, id1);
		int res = statement1.executeUpdate();
		if (res == 0) {
			System.out.println("Please Enter a valid id");
		} else {
			System.out.println("Data Updated successfully :)");
		}

	}

	// to delete the employee record
	public void deleteEmployeeDetail() throws SQLException {
		System.out.println("Enter employee id to Delete employee details");
		int id2 = sc.nextInt();
		sc.nextLine();

		String query2 = "delete from Employee where id = ?";
		PreparedStatement statement2 = JdbcConnection.con.prepareStatement(query2);
		statement2.setInt(1, id2);
		int res1 = statement2.executeUpdate();
		if (res1 == 0) {
			System.out.println("Please Enter a valid id");
		} else {
			System.out.println("Data Deleted successfully :)");
		}

	}

	// to view the employee records
	public void viewEmployeeRecords() throws SQLException {

		System.out.println("Enter the age to view the records");
		int age1 = sc.nextInt();
		sc.nextLine();

		String query3 = "select * from Employee where age > ?";
		PreparedStatement statement3 = JdbcConnection.con.prepareStatement(query3);
		statement3.setInt(1, age1);
		ResultSet res2 = statement3.executeQuery();
		res2.next();
		if (res2.next()) {
			while (res2.next()) {
				System.out.println("---------Employee Details---------");
				System.out.println("Employee id : " + res2.getInt(1));
				System.out.println("Employee Name : " + res2.getString(2));
				System.out.println("Employee Age : " + res2.getString(3));
				System.out.println("Employee Salary : " + res2.getDouble(4));
				System.out.println("Employee phoneNumber : " + res2.getLong(5));

			}
		} else {
			System.out.println("No data Exist!");
		}

	}

}
