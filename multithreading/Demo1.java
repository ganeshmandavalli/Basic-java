// program for implement a runnable thread in multi-threading and their methods of  threads run by one by one//
package multithreading;
import java.util.Scanner;
class Demo2 implements Runnable
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
class Demo3 implements Runnable{
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
class Demo4 implements Runnable{
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
public class Demo1  {
	public static void main(String[] args) throws Exception {
		Demo2 d2=new Demo2();// ---> Runnable target is assigned.
		Demo3 d3=new Demo3();// ---> Runnable target is assigned.
		Demo4 d4=new Demo4();// ---> Runnable target is assigned.
		Thread t1=new Thread(d2);// ----> Thread is created and Target is assigned.
		Thread t2=new Thread(d3);// ----> Thread is created and Target is assigned.
		Thread t3=new Thread(d4);// ----> Thread is created and Target is assigned.
		t1.start();// ----> Thread is activated and starts executing run() using target object.
		System.out.println(t1.isAlive());// ---> check whether Thread is alive or not
		t1.join();// ---->  T1 thread starts execute after it moves T1 to dead state. T2 starts execute.
		System.out.println(t1.isAlive());// ---> check whether Thread is alive or not.
		t2.start();// ----> Thread is activated and starts executing run() using target object.
		System.out.println(t2.isAlive());// ---> check whether Thread is alive or not
		t2.join();  //----> T2 thread starts execute after it moves T2 to dead state. T3 starts execute.
		System.out.println(t2.isAlive());// ---> check whether Thread is alive or not
		t3.start();// ----> Thread is activated and starts executing run() using target object.
		System.out.println(t3.isAlive());// ---> check whether Thread is alive or not
		t3.join();// ----> T1 thread starts execute after it moves T1 to dead state. another thread starts execute.
		System.out.println(t3.isAlive());// ---> check whether Thread is alive or not
	}
}
