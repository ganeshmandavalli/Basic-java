package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	public static Connection connect()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/res";
		String user="root";
		String passw="password1.";
		Connection con=DriverManager.getConnection(url,user,passw);
		System.out.println("Succesfully driver created");
		return con;
	}
}
