package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	public boolean check(String uname,String pass ) {
		try {
			Connection con1 = Connect.connect();
			PreparedStatement pstmnt=con1.prepareStatement("select * from res.login where username=? and password=?");
			pstmnt.setString(1, uname);
			pstmnt.setString(2, pass);
			ResultSet res=pstmnt.executeQuery();
			if(res.next()) {
				System.out.println("Successfull");
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}
}
