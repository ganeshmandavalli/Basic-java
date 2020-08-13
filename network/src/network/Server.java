package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
A socket is one endpoint of a two-way communication link between two
 programs running on the network. A socket is bound to a port 
number so that the TCP layer can identify the application that
 data is destined to be sent to.*/

public class Server {
	public static void main(String[] args) throws IOException {
		//receive the message
		
		@SuppressWarnings("resource")
		ServerSocket listener = new ServerSocket(4000);
		
		System.out.println("Server is ready to accept");
		Socket ssoc =listener.accept();
		
		InputStream dis =ssoc.getInputStream();
		
		DataInputStream ds=new DataInputStream(dis);
		
		String msg =ds.readUTF();
		System.out.print(msg);
		
		//sending the reply
		
		OutputStream os =ssoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		@SuppressWarnings("resource")
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the msg from server and send to client");	
		String reply =scan.nextLine();
		dos.writeUTF(reply);	
	}
}
