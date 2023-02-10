package com.project.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnectors {
	public static void main(String[]args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/b11";
		String username="root";
		String password="sHj@6378#jw";
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("database connected sucessfully"+url);
		}
		catch( SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			connection.close();
		}
		
		
	}

}
