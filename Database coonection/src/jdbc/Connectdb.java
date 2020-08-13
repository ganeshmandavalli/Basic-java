package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Connectdb {
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
	}
}
