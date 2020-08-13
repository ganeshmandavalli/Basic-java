package BankProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PinNumber
{
	long accno;
	Scanner scan=new Scanner(System.in);
	Connection con;
	PreparedStatement pstmt;
	ResultSet res;
	
   void generate() throws Exception
    {
	   int count=0;
	   //taking Connection to this place
	   con=Launch.connect();
	   System.out.println("Enter your Email");
	   String email=scan.nextLine();
    	if(email.length()<7)
    	{
    		System.out.println("Not Valid");
    		System.exit(0);
    	}
    	//validation for .com in entered mail-id
    	boolean result=email.endsWith(".com");
    	if(result==false)
    	{
    		System.out.println("Format incorrect");
    		System.exit(0);
    	}
    	
    	//validating entered email present in Bank DB
    	pstmt=con.prepareStatement("SELECT * FROM  Bank.customer_info WHERE EMAIL=?");
    	pstmt.setString(5,email);
    	res=pstmt.executeQuery();  	
    	
    	boolean check3=res.next();
		if(check3==false)
		{
    		System.out.println("entered Email is not exit\nFor more detail contact your nearest Bank");
    		System.exit(0);
    	}
		
		//validating account
	   	System.out.println("Enter the digit of ACC_No ");
    	long a1=scan.nextLong();//USER ENTERED ACC_NO
    	
    	pstmt=con.prepareStatement("SELECT * FROM Bank.customer_info WHERE accno=?");
       	res=pstmt.executeQuery();
       	boolean check4=res.next();
           		
    	if(check4==true)
    	{
    		String c1=generateCaptchaString();
    		System.out.println(c1);
    		System.out.println("Enter the Capatch present above");
    		String res=scan.nextLine();
    		//validating whether he/she is robot or not
    		if(c1.equals(res))
    		{
                               		
    			int pin=ThreadLocalRandom.current().nextInt(0000,10000);
    	//generating pin number
    			System.out.println("Pin number generated for your account number ending with "
    					+ a1+" is "+pin);
    			
    			pstmt=con.prepareStatement("update Bank.customer_info set pin=? where a1=?");
    			pstmt.setLong(1,accno);
    			pstmt.setInt(8,pin);
    			pstmt.executeUpdate();
    			
    			
    			pstmt=con.prepareStatement("INSERT INTO BALANCE(PIN,BAL_AMT) VALUES(?,?)");
    			pstmt.setInt(1,pin);
    			pstmt.setFloat(2,500.00f);
    			pstmt.executeUpdate();
    			
    			//Connecting to the blue print for withdraw of money
    			Withdraw w=new Withdraw();
    			w.login();
    		}
    		else
    		{
    			System.out.println("Entered Capatch is invalid");
    			count++;	
    		}
    		if(count>=3)
    		{
    			System.out.println("You have taken more attempt");
    			System.exit(0);
    		}
    	}
    		else {
    			System.out.println("Invalid accno:");
    			System.exit(0);
    		}
    }
    public String generateCaptchaString() {
    	Random random=new Random();
    	int length = 7 + (Math.abs(random.nextInt()) % 3);

    	StringBuffer captchaStringBuffer = new StringBuffer();
    	for (int i = 0; i < length; i++) {
    		int baseCharNumber = Math.abs(random.nextInt()) % 62;
    		int charNumber = 0;
    		if (baseCharNumber < 26) {
    			charNumber = 65 + baseCharNumber;
    		}
    		else if (baseCharNumber < 52){
    			charNumber = 97 + (baseCharNumber - 26);
    		}
    		else {
    			charNumber = 48 + (baseCharNumber - 52);
    		}
    		captchaStringBuffer.append((char)charNumber);
    	}

    	return captchaStringBuffer.toString();
    }
}


