package com.project.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class readmultipledataQuery {
	public static void main(String[]args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/b11";
		String username="root";
		String password="sHj@6378#jw";
		Connection connection=null;
		String readalldata="select *from customers";
		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("database connected sucessfully"+url);
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery(readalldata);
			while(resultset.next()) {
				System.out.println("slno:"+resultset.getInt(1));
				System.out.println("name:"+resultset.getString(2));
				System.out.println("gender:"+resultset.getString(3));
				System.out.println("age:"+resultset.getInt(4));
				System.out.println("salary:"+resultset.getInt(5));
				System.out.println("data readed sucessfully");
				System.out.println("**************************************************");
			}
			
		}
catch(SQLException e) {
	e.getMessage();
}
		finally {
			connection.close();
		}
		
		
	}

}
