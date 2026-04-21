package com.trainings.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static Connection getConnection() throws SQLException, Exception {
		String url = "jdbc:mysql://localhost:3306/amj";
		String user = "root";
		String password = "root"; 

		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url, user, password);

	}
}
