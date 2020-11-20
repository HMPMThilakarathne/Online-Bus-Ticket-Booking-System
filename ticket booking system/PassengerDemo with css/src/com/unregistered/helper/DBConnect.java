package com.unregistered.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static String url = "jdbc:mysql://localhost:3306/registration";
	private static String username = "root";
	private static String password = "Mt2235789#";
	private static Connection con;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println("Database connection is unsuccessful");
		}

		return con;
	}
}
