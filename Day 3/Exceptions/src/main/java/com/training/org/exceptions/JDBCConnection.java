package com.training.org.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {

	public static void main(String[] args) {
		try {
			// Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amj", "root", "root");

			System.out.println("Connection successful!");
			conn.close();

		} catch (Exception e)

		{
			System.out.println("Error connecting to database: " + e.getMessage());
		}

	}

}
