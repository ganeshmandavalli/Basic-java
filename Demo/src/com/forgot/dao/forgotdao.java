package com.forgot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.login.dao.Connect;

public class forgotdao {
	public boolean check(String name,String phn,String email,String pass) {
		try {
			Connection con1 = Connect.connect();
			PreparedStatement pstmnt=con1.prepareStatement
					("select * from res.signin where name=? and phone=? and email=?");
			pstmnt.setString(1,name);
			pstmnt.setString(2,phn);
			pstmnt.setString(3,email);
			ResultSet res =pstmnt.executeQuery();
			if(res.next()){
				System.out.println("successfull");
				return true;
			}
			else {
				System.out.println("unsuccessfull");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean check1(String name ,String pass) {
		try {
			Connection con1 = Connect.connect();
			PreparedStatement pstmnt=con1.prepareStatement("update res.login set password=? where username=?");
			pstmnt.setString(2,name);
			pstmnt.setString(1,pass);
			int x=pstmnt.executeUpdate();
			if(x==1) {
				System.out.print("Successfully");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}


