package com.celcom.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.Statement;

public class OracleJdbc {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "system";
	private static final String PASSWORD = "mani2003";

	public static void main(String[] args) {
		
	        
	        try {
	        	
	        	Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
	        	
	        	int id = 1000;
				String name = "Yuva";

				
				String str1 = "insert into example values(?,?)";
				
				PreparedStatement st = con.prepareStatement(str1);
				st.setInt(1, id);
				st.setString(2, name);
				st.executeUpdate();
				
				System.out.println("Data added successfully");
				
				con.close();
	        	
	        }catch(Exception e) {
	        	e.printStackTrace();
	        }
		

	}

}
