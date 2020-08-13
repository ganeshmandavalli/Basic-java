package multithreading;
import java.util.*;
class Sample implements Runnable{
	@Override
	public void run() {
			try{
				Thread T=Thread.currentThread();
				String name=T.getName();
				if(name.equals("Type")) {
					Typing();
				}
				else if(name.equals("Autocompile")) {
				Auto();	
				}
				else {
					Suggest();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	public void Typing() throws Exception{
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		  {
			System.out.println("typing");
			Thread.sleep(1000);
		   }
		}
	public void Auto() throws Exception{
	Scanner scan=new Scanner(System.in);
	for(;;)
	  {
		System.out.println("Auto compilation");
		Thread.sleep(1000);
	   }
	}
	public void Suggest() throws Exception{
		for(;;)
		  {
			System.out.println("suggest");
			Thread.sleep(1000);
		   }
	}
}
public class Deamon1 {
	public static void main(String[] args) {
	Sample s=new Sample();
	Thread t1=new Thread(s);
	Thread t2=new Thread(s);
	Thread t3=new Thread(s);
	t1.setName("Type");
	t2.setName("Autocompile");
	t3.setName("suggest");
	t2.setDaemon(true);
	t3.setDaemon(true);
	t1.setPriority(3);
	t2.setPriority(1);
	t3.setPriority(2);
	t1.start();
	t2.start();
	t3.start();
	}
}
