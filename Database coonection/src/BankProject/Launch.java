package BankProject;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Scanner;

public class Launch {

	public static void main(String[] args) throws Exception 
	{
		System.out.println("Press->1 to create pin Number for your acc_no \n press->2 to withdraw money");
		Scanner scan=new Scanner(System.in);
		System.out.println("Only Numeric value is acceptable");
		int i=scan.nextInt();
		
		if(i==1)
		{
       PinNumber p=new PinNumber();
       p.generate();
		}
		else if(i==2)
		{
			Withdraw w=new Withdraw();
			w.login();
		}
		else
		{
			System.out.println("Sorry!!! something Went Wrong");
			System.exit(0);
		}
		
	}
	public static Connection connect()throws Exception
	{
		Connection con1;
		String path1="C:\\Users\\Administrator\\workspace\\Database coonection\\src\\jdbc\\Resources\\config.properties";
		FileInputStream fis1=new FileInputStream(path1);
		
		Properties p1=new Properties();
		p1.load(fis1);
		
		String url=p1.getProperty("url");
		String un=p1.getProperty("un");
		String password=p1.getProperty("password");
		con1=DriverManager.getConnection(url, un, password);
		System.out.println("Connection Established to Bank DB");
		return con1;
	}

}

