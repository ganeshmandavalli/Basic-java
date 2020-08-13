package collection;
import java.util.LinkedList;
public class linkedlist {
	public static void main(String[] args) {
		LinkedList l1= new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(40);
		l1.add(30);
		l1.add(50);
		l1.add(10);
		l1.add(60);
		l1.add(70);
		l1.add(10);
		System.out.println(l1);
		l1.addFirst(77);
		l1.addLast(88);
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.getClass());
		System.out.println(l1.removeFirst());
		System.out.println(l1.removeLast());
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
		l1.push(99);
		System.out.println(l1);
		System.out.println(l1.pop());
		
	}
}
