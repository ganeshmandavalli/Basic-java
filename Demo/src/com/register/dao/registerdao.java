package com.register.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.login.dao.Connect;

public class registerdao {
	public boolean check(String name, String birth, String gender, String phn, String email,String pass) {
		try {
			Connection con1 = Connect.connect();
			PreparedStatement pstmnt=con1.prepareStatement("insert into res.signin(name,birth,gender,phone,email,password,curtime,curdate)"
					+ "values(?,?,?,?,?,?,CURRENT_TIMESTAMP,current_date())");
			pstmnt.setString(1,name);
			pstmnt.setString(2,birth);
			pstmnt.setString(3,gender);
			pstmnt.setString(4,phn);
			pstmnt.setString(5,email);
			pstmnt.setString(6,pass);
			int x=pstmnt.executeUpdate();
			if(x==1) {
				System.out.println("Successfully");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean check1(String name,String pass) {
		try {
			Connection con1 = Connect.connect();
			PreparedStatement pstmnt=con1.prepareStatement("insert into res.login(username,password)"
					+ "values(?,?)");
			pstmnt.setString(1,name);
			pstmnt.setString(2,pass);
			int x=pstmnt.executeUpdate();
			if(x==1) {
				System.out.println("Successfully");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
