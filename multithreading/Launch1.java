package multithreading;
class Producer1 extends Thread{
	Queue q1;
	public Producer1(Queue q1) {
		this.q1=q1;
	}
	public void run() {
		int m=1;
		while(true) {
			q1.put(m++);
			
		}
	}
}
class Consumer extends Thread{
	Queue q2;
	public Consumer(Queue q2) {
		this.q2=q2;
	}
	public void run() {
		while(true) {
		q2.get();
		
		}
	}
}
class Queue{
	private int x;
	public void put(int i) {
		x=i;
		System.out.println("I have put into x:"+x);
	}
	public void get() {
		System.out.println("I have taken from x:"+x);
	}
}
public class Launch1 {
	public static void main(String[] args) {
		Queue q=new Queue();
		Producer1 p=new Producer1(q);
		Consumer C=new Consumer(q);
		p.start();
		C.start();
	}
}
