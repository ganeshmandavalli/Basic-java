package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class Demo6 {
	 static Connection con;
	 static PreparedStatement pstmt; 
	 static int x;
	public static void main(String[] args) throws IOException, SQLException {
		String path ="C:\\Users\\Administrator\\workspace\\Database coonection\\src\\jdbc\\Resources\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties p =new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String user=p.getProperty("user");
		String pswd=p.getProperty("password");
		con=DriverManager.getConnection(url,user,pswd);
		System.out.println("Connected to database");
		pstmt=con.prepareStatement("delete from student_info.student where id=?");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("How many students to deleted:");
		int length=scan.nextInt();
		for(int i=0;i<length;i++) 
		{
		System.out.println("Enter student id:");
		int id=scan.nextInt();
		pstmt.setInt(1,id);		
		x=pstmt.executeUpdate();
		}
		if(x>=1) 
		{
			System.out.println("Succesfully"+" "+length+" "+"Deleted");
		}
		else 
		{
			System.out.println("Succesfully not Deleted");
		}
		System.out.println("Succesfully fetch the contents and data of a table");
  }
}




