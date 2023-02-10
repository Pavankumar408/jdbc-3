package com.project.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertQuery {
	public static void main(String[]args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/b11";
		String username="root";
		String password="sHj@6378#jw";
		Connection connection=null;
		String insertquery="insert into customers values(15,'harish','M',27,35000)";


		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("database connected sucessfull"+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(insertquery);
			System.out.println("insert query is sucessful");
			
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			
			connection.close();
		}
		
		
	}

}
