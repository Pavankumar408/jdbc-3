package com.project.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class details implements customers {

	@Override
	public void insertQuery(){
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
				
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
	}

	

		
	

	@Override
	public void readmultipledataQuery() {
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
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}


	

	@Override
	public void deletedata() {
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
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		
		
		
	
		
	

	

	@Override
	public void readsinglequery() {
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
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

		
	}

	@Override
	public void updatequery() {
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
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		


		
	}


