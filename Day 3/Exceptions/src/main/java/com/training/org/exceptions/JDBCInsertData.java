package com.training.org.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class JDBCInsertData {
	static int count = 0;

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/amj", "root", "root");

			// String query = "insert into employee values(?,?,?)";

//			PreparedStatement pstmt = conn.prepareStatement(query);
//
//			pstmt.setInt(1, 101);
//			pstmt.setString(2, "John Doe");
//			pstmt.setDouble(3, 50000.0);
//			int rowsInserted = pstmt.executeUpdate();
//			System.out.println(rowsInserted + " row(s) inserted successfully.");
//
//			String selectQuery = "select * from employee";
//			PreparedStatement pstmt1 = conn.prepareStatement(selectQuery);
//			ResultSet rs = pstmt1.executeQuery();
//
//			while (rs.next()) {
//				int id = rs.getInt("id");
//				String name = rs.getString("name");
//				double salary = rs.getDouble("salary");
//				System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
//				count++;
//			}
//			System.out.println(count+" row in set (0.00 sec)");

//			String updateQuery = "update employee set salary = ? where id = ?";
//			PreparedStatement pstmt2 = conn.prepareStatement(updateQuery);
//			pstmt2.setDouble(1, 55000.0);
//			pstmt2.setInt(2, 101);
//			
//			int rowsUpdated = pstmt2.executeUpdate();
//			System.out.println(rowsUpdated + " row(s) updated successfully.");

			String deleteQuery = "delete from employee where id = ?";
			PreparedStatement pstmt3 = conn.prepareStatement(deleteQuery);
			pstmt3.setInt(1, 101);

			int rowsDeleted = pstmt3.executeUpdate();
			System.out.println(rowsDeleted + " row(s) deleted successfully.");

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
