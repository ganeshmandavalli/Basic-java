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

public class Demo9 {	
	static Connection con;
	static PreparedStatement pstmt;
	static ResultSet res;
	
	public static void main(String[] args) throws IOException, SQLException {
		String path="C:\\Users\\Administrator\\workspace\\Database coonection\\src\\jdbc\\Resources\\config.properties";
		FileInputStream fis =new FileInputStream(path);
		Properties p= new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String user=p.getProperty("user");
		String password=p.getProperty("password");
		con=DriverManager.getConnection(url,user,password);
		System.out.println("Connected to database");
		System.out.println("************************");
		pstmt=con.prepareStatement("select * from student_info.student ");
		ResultSet res=pstmt.executeQuery();
		res.first();
		System.out.println("id:"+" "+res.getInt("id")+"\n"+"name:"+" "+res.getString("name")+"\n"+"class:"+" "+res.getInt("class")+"\n"+"section:"+" "+res.getInt("section")+"\n"+"Cgpa:"+" "+res.getFloat("cgpa"));
		System.out.println("************************");
		res.last();
		System.out.println("id:"+" "+res.getInt("id")+"\n"+"name:"+" "+res.getString("name")+"\n"+"class:"+" "+res.getInt("class")+"\n"+"section:"+" "+res.getInt("section")+"\n"+"Cgpa:"+" "+res.getFloat("cgpa"));
		System.out.println("************************");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the position to dispaly:");
		int Position=scan.nextInt();
		res.absolute(Position);
		System.out.println("id:"+" "+res.getInt("id")+"\n"+"name:"+" "+res.getString("name")+"\n"+"class:"+" "+res.getInt("class")+"\n"+"section:"+" "+res.getInt("section")+"\n"+"Cgpa:"+" "+res.getFloat("cgpa"));
	}
}
