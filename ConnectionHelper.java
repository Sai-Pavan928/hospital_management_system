package com.org.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {

	public static Connection getConObj() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital","root","root");
			return con;
		} catch (Exception e) {
			System.out.println("exception on connection");
		}
		
		return null;
	}
}
