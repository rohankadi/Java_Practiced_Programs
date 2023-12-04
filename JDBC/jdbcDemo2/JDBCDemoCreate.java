package com.kn.jdbcDemo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemoCreate {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "dream";
	
	//CREATE TRAINER TABLE 
	private static final String CREATE_TRAINER_TABLE = "CREATE TABLE TRAINERS(ID INT, NAME VARCHAR(20));";
	
	public static void main(String[] args) {
		
		//take connection as null
		Connection con = null;
		
		try {
		//1. Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded and Registered Successfully");
		
		//2. Establish the connection with DB
	      con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		System.out.println("Connection established Successfully" + con);
		
		//3. Create Statement Object
		Statement stmt = con.createStatement();
		
		//4. Send and Execute the Query
		stmt.execute(CREATE_TRAINER_TABLE);	
		System.out.println("===> Trainer table created");
		}
		
		catch(ClassNotFoundException e) {
			System.out.println("Driver not found");
			e.printStackTrace();
		} 
		catch (SQLException e) {
			System.out.println("Failed established Connection");
			e.printStackTrace();
		}
		finally {
			//5. Close the connection
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
