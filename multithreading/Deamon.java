// Daemon Thread//
package multithreading;
import java.util.Scanner;
class Demo5 implements Runnable
{
	public void run() {	
		try{
			Thread T=Thread.currentThread();
			String name=T.getName();
			if(name.equals("Banking")) {
				banking();
			}
			else if(name.equals("Alphabets")) {
				alphabets();
			}
			else {
				numbers();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void banking() throws Exception{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the account");
		int acno=scan.nextInt();
		System.out.println("Enter the password");
		int pwd=scan.nextInt();
		Thread.sleep(1000);
		System.out.println("collect u r money");	
	}
	public void alphabets() throws Exception{
		for(int i=65;i<=90;i++)
		  {
			System.out.println((char)i);
			Thread.sleep(1000);
		   }
	}
	public void numbers() throws Exception{
		for(int i=1;i>=1;i++)
		  {
			System.out.println(i);
			Thread.sleep(1000);
		   }
	}
	}
public class Deamon {
	public static void main(String[] arg) throws Exception {
		Demo5 d5=new Demo5();
		Thread t1= new Thread(d5);
		Thread t2= new Thread(d5);
		Thread t3= new Thread(d5);
		t1.setName("Banking");
		t2.setName("Alphabets");
		t3.setName("Numbers");
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}
