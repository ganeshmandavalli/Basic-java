package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class withdraw {
	int pin;
	long amount1,amount,accnum;
	Scanner scan=new Scanner(System.in);
	Connection con;
	PreparedStatement pstmt;
	ResultSet res;
	void login() throws Exception {
		con=Banking.connect();
		 System.out.println("Enter your pin number");
		 pin=scan.nextInt();	
		 pstmt=con.prepareStatement("Select * from  Bank.customer_info where pin=?");
		 pstmt.setInt(1,pin);
		 res=pstmt.executeQuery();
		 if(res.next()) {
			 System.out.println("pin number is valid ");
			}
		 else 
		 {
			 System.out.println("pin number isn't valid");
			 System.exit(0);
		 }	
		 System.out.println("Enter the withdrawal amount:");
		 System.out.println("Amount should be multiples of 100's ");
		 amount1=scan.nextInt();
		 if(amount1%100!=0) 
		 {
			System.out.println("Invalid amount mustn't be given"); 
			System.exit(0);
		 }
			 pstmt=con.prepareStatement("Select Balanceamt,accno from  Bank.customer_info where pin=?");
			 pstmt.setInt(1,pin);	
			 res=pstmt.executeQuery();
				if(res.next()) {				
					long Balance=res.getInt(1);
					accnum=res.getLong(2);
					amount=Balance-amount1;
				}	
				if(amount<=0) {
					 System.out.println("check your balance"); 
					 System.exit(0);
				 }
				pstmt=con.prepareStatement("update bank.customer_info set balanceamt=? where accno=?");
				pstmt.setLong(2,accnum);
				pstmt.setLong(1,amount);
				int x=pstmt.executeUpdate();
				if(x>=1) {
					System.out.println("Succesfully"+" "+amount+" "+"withdrawn");
					Random rand = new Random(); 
					int rand_int1 = rand.nextInt(1000);
					pstmt=con.prepareStatement("insert into bank.transaction_info(accno,transaction,transcdate,transctime)"
							+ "values(?,?,current_date(),current_time())");
					pstmt.setLong(1,accnum);
					pstmt.setInt(2,rand_int1);
					pstmt.executeUpdate();
				}
				else {
					System.out.println("Unsuccesfully");
				}
	}
}

