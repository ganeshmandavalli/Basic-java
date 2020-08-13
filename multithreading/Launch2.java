/* Problem Identify in Producer-Consumer Problem.Solving through Semaphore */
package multithreading;
class Producer3 extends Thread
{
	Queue3 q1;
	public Producer3(Queue3 q1) 
	{
		this.q1=q1;
	}
	public void run() 
	{
		int m=1;
		while(true) 
		{
			q1.put(m++);
		}
	}	
}
class Consumer3 extends Thread
{
    Queue3 q2; 
	public Consumer3(Queue3 q2) 
	{
		this.q2=q2;
	}
	public void run()
	{
		while(true)
		{
			q2.get();
		}
	}
}
class Queue3{
	private int x;
	boolean value_in_x=false;
	synchronized public void put(int i) 
	{
		try 
		{
			if(value_in_x==false)
			{
			x=i;
			System.out.println("I have put into x:"+x);
			notify();
			value_in_x=true;
			}
			else {
				wait();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	synchronized public void get() 
	{
		try
		{
			if(value_in_x==true) 
			{
				System.out.println("I have taken a x:"+x);	
				notify();
				value_in_x=false;
			}
			else {
				wait();
			}
		}
		catch(Exception g) {
			g.printStackTrace();
		}
	}
}
public class Launch2 {
	public static void main(String[] args) {
		Queue3 q=new Queue3();
		Producer3 p =new Producer3(q);
		Consumer3 c =new Consumer3(q);
		p.start();
		c.start();
	}
}
