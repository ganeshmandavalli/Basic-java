package collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class Traversing {
	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList <Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(10);
		al.add(70);
		al.add(80);
		al.add(90);
		System.out.println(al);
		System.out.println("Forward & Backward:");
		ListIterator<Integer> itr = al.listIterator();
		System.out.println("Forward");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("Backward");
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+" ");
		}
		System.out.println();
		System.out.println("Backward");
		ListIterator<Integer> itr2 = al.listIterator(al.size());
		while(itr2.hasPrevious()) {
			System.out.print(itr2.previous()+" ");
		}
		System.out.println();
		for(int i=0;i<al.size();i++) 
		{
			if(al.get(i)==10) 
			{
				System.out.print(i +" ");
			}
		}

	}
}
