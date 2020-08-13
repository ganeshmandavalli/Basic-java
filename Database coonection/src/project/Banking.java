package project;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Scanner;

public class Banking {
	public static void main(String[] args) throws Exception {
		while(true) {
			System.out.println("Press->1 to create pin Number for your acc_no \npress->2 to withdraw money\npress->3 to check your balance");
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			System.out.println("Only Numeric value is acceptable");
			int i=scan.nextInt();
			switch(i) {
			case 1:
			{
				pin p=new pin();
				p.generate();
				break;
			}
			case 2:	{
				withdraw w=new withdraw();
				w.login();
				break;
			}
			case 3: {
				balance b= new balance();
				b.check();
				break;
			}
			default:
			{
				System.out.println("Sorry!!! something Went Wrong");
				System.exit(0);
			}
		}
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
		String user=p1.getProperty("user");
		String password=p1.getProperty("password");
		con1=DriverManager.getConnection(url, user, password);
		return con1;
	}
}

	




