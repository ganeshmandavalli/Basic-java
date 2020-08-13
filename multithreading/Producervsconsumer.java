package multithreading;
class Producer11{
	public void put(int a) {
		Queue q=new Queue();
		q.put(a);
		System.out.println(q);
	}
}
class Consumer11{
	public void get() {
		Queue q=new Queue();
		q.get();
		System.out.println(q);
	}
}
class Queue11{
	private int x;
	public void put(int a) 
	{
		x=a;
		System.out.println("I have put into x:"+x);
	}
	public void get() {
		System.out.println("I have taken from x:"+x);
	}
}
public class Producervsconsumer {
	public static void main(String[] args) {
		Queue11 q =new Queue11();
		Producer11 p=new Producer11();
		Consumer11 c=new Consumer11();
		for(int i=1;i<=5;i++) {
			p.put(i);
			c.get();
		}
	}
}
