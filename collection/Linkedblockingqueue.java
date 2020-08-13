package collection;
import java.util.concurrent.LinkedBlockingQueue;
public class Linkedblockingqueue {
	public static void main(String[] args) throws InterruptedException {
		LinkedBlockingQueue<Integer> lbq =new LinkedBlockingQueue<Integer>(7);
		lbq.add(10);
		lbq.add(20);
		lbq.add(30);
		lbq.add(10);
		lbq.add(40);
		lbq.add(50);
		System.out.println(lbq);
		lbq.put(6);
		System.out.println(lbq);
		lbq.remove(6);
		System.out.println(lbq); 
		System.out.println(lbq.contains(10));
		System.out.println(lbq.remainingCapacity());
		lbq.clear();
		System.out.println(lbq);
		System.out.println(lbq.remainingCapacity());
	}
}
