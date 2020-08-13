package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

class Demo7 {	
	static Connection con;
	static PreparedStatement pstmt;
	static ResultSet res;
	static int x;
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, SQLException 
	{
		String path="C:\\Users\\Administrator\\workspace\\Database coonection\\src\\jdbc\\Resources\\config.properties";
		FileInputStream fis =new FileInputStream(path);
		Properties p= new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String user=p.getProperty("user");
		String password=p.getProperty("password");
		con=DriverManager.getConnection(url,user,password);
		pstmt=con.prepareStatement("insert into student_info.student(id,name,class,section,cgpa)"
				+ "values(?,?,?,?,?)");
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("How many students to enter:");
		int length=scan.nextInt();
		for(int i=0;i<length;i++) 
		{
		System.out.println("Enter student id:");
		int id=scan.nextInt();
		
		System.out.println("Enter Student Name:");
		String name=scan.next();
		
		System.out.println("Enter class");
		int classname=scan.nextInt();
		
		System.out.println("Enter section");
		int section=scan.nextInt();
		
		System.out.println("Enter Cgpa");
		float cgpa=scan.nextFloat();
		
		pstmt.setInt(3,classname);
		pstmt.setInt(4,section);
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.setFloat(5,cgpa);
		
		pstmt.addBatch();
		}
		int a[]=pstmt.executeBatch();
		System.out.println("Inserted"+" "+a.length);
		System.out.println("Succesfully fetch the contents and data of a table");
  }
}


