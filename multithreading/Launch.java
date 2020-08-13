                            // program for multi threading by concurrently //
package multithreading;
import java.util.Scanner;
class multi1 extends Thread
{
	public void run() {
		System.out.println("Banking activity ");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the account number");
		try {
		int acno=scan.nextInt();
		System.out.println("Enter the password");
		int pwd=scan.nextInt();
		Thread.sleep(2000);
		System.out.println("collect u r money");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Banking activity completed");
	}
}
class multi2 extends Thread{
	public void run() 
	{
		System.out.println("Print the numbers");
		try {
		for(int i=1;i<=26;i++)
		  {
			System.out.println(i);
			Thread.sleep(1000);
		   }
		}
		catch(Exception g) {
			g.printStackTrace();
		}
	}
}
class multi3 extends Thread{
	public void run() {
		System.out.println("Print the alphabets");
		try {
		for(int i=65;i<=90;i++) {
			System.out.println((char) i);
			Thread.sleep(1000);
		   }
		}
		catch (Exception f) {
			f.printStackTrace();
		}
	}
}
public class Launch  {
	public static void main(String[] args)  {
		multi1 d1=new multi1();
		multi2 d2=new multi2();
		multi3 d3=new multi3();
		d2.start();
		d1.start();
		d3.start();
	}
}

