package com.project.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updatequery {
	public static void main(String[]args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/b11";
		String username="root";
		String password="sHj@6378#jw";
		Connection connection=null;
		String updatequery="update customers set gender='M' where slno=2";
;
		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("database coneected sucessfully"+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(updatequery);
			System.out.println("data is updated sucessfully");
			
			
		}
		catch(SQLException e ) {
			e.getMessage();
		}
		finally {
			connection.close();
		}
		}
		
		
		
	}


