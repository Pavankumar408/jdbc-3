package com.project.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class readsingleQuery {
public static void main(String[]args) throws SQLException {
	String url="jdbc:mysql://localhost:3306/b11";
	String username="root";
	String password="sHj@6378#jw";
	Connection connection=null;
	String readsinglequery="select *from customers where slno=8";
	try {
		connection=DriverManager.getConnection(url, username, password);
		System.out.println("database connected sucessfully"+url);
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery(readsinglequery);
		while(result.next()) {
			System.out.println("slno:"+result.getInt(1));
			System.out.println("name:"+result.getString(2));
			System.out.println("gender:"+result.getString(3));
			System.out.println("age:"+result.getInt(4));
			System.out.println("salary:"+result.getInt(5));
			System.out.println(" single data readed sucessfully");
			
		}
	}
	catch(SQLException e ) {
		e.getMessage();
	}
	finally {
		connection.close();
	}
}
}
