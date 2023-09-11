package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class db_connect {
	private static Connection conn;

	public static Connection getConn() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","password");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}