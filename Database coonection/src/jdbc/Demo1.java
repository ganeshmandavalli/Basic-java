package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

/* Insert into a database by using java*/

public class Demo1 {
	 static Connection con;
	 static Statement stmt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			  Driver d = new com.mysql.jdbc.Driver();
		      DriverManager.registerDriver(d);
			System.out.println("Driver loaded succesfully");
			String url="jdbc:mysql://localhost:3306/student_info";
			String user="root";
			String password="1234";
			con=DriverManager.getConnection(url, user, password);
			stmt=con.createStatement();
			int x =stmt.executeUpdate("insert into student_info.student(id,name,class,section,cgpa)" +  "values(312,'goutham',3,2,6.89)");
			if(x>=1) {
				System.out.println("Inserted to student Db is successfully");
			}
			System.out.print("connected to database");		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}


