package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/* update into a database by using java*/

public class Demo3 {
	 static Connection con;
	 static Statement stmt;
	public static void main(String[] args) {
		try {
			//Driver d = new com.mysql.jdbc.Driver();
		    //DriverManager.registerDriver(d);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded succesfully");
			String url="jdbc:mysql://localhost:3306/student_info";
			String user="root";
			String password="1234";
			con=DriverManager.getConnection(url, user, password);
			stmt=con.createStatement();
			int x =stmt.executeUpdate("update student_info.student set id=310 where id=563");
			if(x>=1) {
				System.out.println("updated in student Db is successfully");
			}
			else {
				System.out.println("Not update in student DB");
			}
			System.out.print("connected to database");		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}