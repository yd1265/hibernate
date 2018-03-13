package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class Testjdbc {

	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String username="hbstudent";
		String password="hbstudent";
	
		try{
			
			System.out.println("connection to database");
			@SuppressWarnings("unused")
			Connection conn= DriverManager.getConnection(jdbcUrl, username, password);
			  System.out.println("yes i am connected to the database");
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
	}

}
