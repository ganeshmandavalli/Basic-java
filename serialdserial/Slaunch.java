package serialdserial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Slaunch 
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("E:\\ioprg\\customer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter the customer name,crn,balance");
			oos.writeObject(new Customer(scan.next(), scan.nextInt(), scan.nextDouble()));
		}
	}
}
