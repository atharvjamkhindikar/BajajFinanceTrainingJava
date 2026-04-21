package com.training.org.lambada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestLambdaStream {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root",
		// "root");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amj", "root", "root");
		
		String query="Select * from employee";
		PreparedStatement psmt=conn.prepareStatement(query);
		ResultSet rs=psmt.executeQuery();
		
		while(rs.next()) {
			System.out.println("Id : "+rs.getInt(1)+", Name : "+rs.getString(2)+", Salary : "+rs.getInt(3));
		}
		
		// Add filter stream 

	}

}
