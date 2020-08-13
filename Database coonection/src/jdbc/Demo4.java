package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Demo4 {
	 static Connection con;
	 static Statement stmnt; 
	  static ResultSet res;

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
		stmnt=con.createStatement();
		res=stmnt.executeQuery("select * from student_info.student" );
		System.out.println("Column names in table");
		System.out.println("*******************************");
		ResultSetMetaData mres=res.getMetaData();
		for(int i=1;i<=mres.getColumnCount();i++) {
			System.out.println(mres.getColumnName(i)+"    "+mres.getColumnTypeName(i));
		}
		System.out.println("-----------------------------------");
		System.out.println("Fetch the records in a database table");
		System.out.println("*************************************");
		while(res.next()) {
			int id=res.getInt(1);
			String name=res.getString(2);
			int cls=res.getInt(3);
			int scn=res.getInt(4);
			float cgpa=res.getInt(5);
			System.out.println("student id:"+" "+id+"\n"+"name:"+" "+name+"\n"+"class:"+" "+cls+"\n"+"Section:"+" "+scn+"\n"+"Cgpa:"+" "+cgpa);
			System.out.println("***********************************");
		}
		System.out.println("Succesfully fetch the contents and data of a table");
	}
}
