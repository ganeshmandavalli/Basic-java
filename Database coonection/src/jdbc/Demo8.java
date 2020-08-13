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

public class Demo8 {
	public static void main(String[] args) throws IOException, SQLException {
		 Connection con;
		 PreparedStatement pstmt;
		 ResultSet res;
		String path ="C:\\Users\\Administrator\\workspace\\Database coonection\\src\\jdbc\\Resources\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties p =new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String user=p.getProperty("user");
		String pswd=p.getProperty("password");
		con=DriverManager.getConnection(url,user,pswd);
		System.out.println("Connected to database");
		pstmt=con.prepareStatement("select * from student_info.student where id=?");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("How many students to display:");
		int length=scan.nextInt();
		System.out.println("***********************************");
		for(int i=0;i<length;i++) 
		{
			System.out.println("Enter student id:");
			int id=scan.nextInt();
			pstmt.setInt(1,id);	
			 res=pstmt.executeQuery();
			if(res.next()) {
				int id1=res.getInt(1);
				String name=res.getString(2);
				int cls=res.getInt(3);
				int scn=res.getInt(4);
				float cgpa=res.getInt(5);
				System.out.println("student id:"+" "+id1+"\n"+"name:"+" "+name+"\n"+"class:"+" "+cls+"\n"+"Section:"+" "+scn+"\n"+"Cgpa:"+" "+cgpa);
				System.out.println("***********************************");
			}
			else {
				System.out.println("Invalid Student id");
			}
		}
		System.out.println("Successfully fetch the contents in a database");
	}
}

