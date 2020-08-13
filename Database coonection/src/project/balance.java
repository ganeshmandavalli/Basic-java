package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class balance {
	Connection con;
	PreparedStatement pstmt;
	ResultSet res;
	int x;
	int pin;
	long balance;
	void check() throws Exception {
		con=Banking.connect();
		Scanner scan=new Scanner(System.in);			
		System.out.println("Enter your pin:");
		int pin=scan.nextInt();	

		pstmt=con.prepareStatement("SELECT balanceamt FROM  Bank.customer_info where pin=? ");
		pstmt.setInt(1,pin);
		res=pstmt.executeQuery();
		if(res.next()) {
				int Balanceamt=res.getInt(1);
				System.out.println("Balance amount:"+" "+Balanceamt);
			}
		else {
			System.out.println("Pin doesn't exists");
			System.exit(0);
		}
	}
}
