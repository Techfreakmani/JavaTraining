package com.celcom.day12.task3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	private static final String URL = "jdbc:oracle:thin:@172.19.0.5:1521/trainingsql.celcom.com";
	private static final String USER = "training";
	private static final String PASSWORD = "Celcom123";
	 static Connection con = null;
	public static void access() {
		
	}

	static {
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connected ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
