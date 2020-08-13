package network;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.UnknownHostException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException,UnknownHostException {
		
		@SuppressWarnings("resource")
		Socket caller =new Socket("localhost",4000);
		OutputStream ois =caller.getOutputStream();
		DataOutputStream dos=new DataOutputStream(ois);
		
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the msg from client and send to server");	
		String msg =scan.nextLine();
		dos.writeUTF(msg);	
		
		InputStream is =caller.getInputStream();
		DataInputStream ds=new DataInputStream(is);
		String reply =ds.readUTF();
		System.out.print(msg);
		
	}
}
