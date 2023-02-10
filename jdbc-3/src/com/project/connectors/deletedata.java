package com.project.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deletedata {
	public static void main(String[]args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/b11";
		String username="root";
		String password="sHj@6378#jw";
		Connection connection=null;
		String deletequery="delete from customers where slno = 12 ";
;
		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("database coneected sucessfully"+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(deletequery);
			System.out.println("data is deleted sucessfully");
			
			
		}
		catch(SQLException e ) {
			e.getMessage();
		}
		finally {
			connection.close();
		}
		}
		
		
		
	
		
	}


