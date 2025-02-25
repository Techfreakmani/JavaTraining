package com.celcom.day12.Task3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "system";
	private static final String PASSWORD = "mani2003";
	static Connection con = null;

	static {
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
