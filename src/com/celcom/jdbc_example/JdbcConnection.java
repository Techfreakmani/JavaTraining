package com.celcom.jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	private static final String URL ="jdbc:mysql://localhost:3306/JavaTraining";
	private static final String NAME = "root";
	private static final String PASSWORD = "Mani2003@";
	static Connection con = null;
	
	static {
		try {
			con = DriverManager.getConnection(URL,NAME,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
