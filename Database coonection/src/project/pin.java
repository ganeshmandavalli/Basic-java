package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class pin {
	long acc;
	long pno;
	Connection con;
	PreparedStatement pstmt;
	ResultSet res;
	int x;
	void generate() throws Exception {
		con=Banking.connect();
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);			
			 System.out.println("Enter your Email");
			 String email=scan.nextLine();	
			 pstmt=con.prepareStatement("Select * from  Bank.customer_info where Emailid=?");
			 pstmt.setString(1,email);
			 res=pstmt.executeQuery();
			 if(res.next()) {
				 System.out.println("Email Id is valid");
				}
			 else {
				 System.out.println("Email Id isn't valid");
			 }	
			 System.out.println("Enter your Phone number number");
			 pno=scan.nextLong();
			 pstmt=con.prepareStatement("Select * from  Bank.customer_info where phoneno=?");
			 pstmt.setLong(1,pno);
			 res=pstmt.executeQuery();
			 if(res.next()) {
				 System.out.println("phone number Id is valid");
				}
			 else {
				 System.out.println("phone number isn't valid");
				 System.exit(0);
			 }	
			 System.out.println("Enter your Account number");
			  acc=scan.nextLong();	
			 pstmt=con.prepareStatement("Select * from  Bank.customer_info where accno=?");
			 pstmt.setLong(1,acc);
			 res=pstmt.executeQuery();
			 if(res.next()) {
				 System.out.println("Account number Id is valid");
				}
			 else {
				 System.out.println("Account number isn't valid");
				 System.exit(0);
			 }	
			 System.out.println("Enter Your Credentials are right,So please change your password");
			 System.out.println("Enter a pin:");
			 int pin=scan.nextInt();
			 pstmt=con.prepareStatement("update Bank.customer_info set pin=? where accno=?");
			 pstmt.setLong(2,acc);
			 pstmt.setInt(1,pin);
			 x=pstmt.executeUpdate();
			 if(x>=1)
			 {
				 System.out.println("Successfully pin is Updated");
				 System.out.println("Thank U for choosing us, Now you can successfully shopping.");
			}
			 else {
				 System.out.println("Successfully pin isn't Udated");
				 System.out.println("Sorry!!");
				 System.exit(0);
			 }	
	}		
}
