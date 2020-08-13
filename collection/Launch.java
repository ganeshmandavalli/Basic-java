package collection;
import java.util.ArrayList;
public class Launch {
	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		ArrayList al1 =new ArrayList();
		ArrayList al2 =new ArrayList();
		al.add(10);
		al.add("Gani");
		al.add('c');
		al.add(10.56789);
		System.out.println(al);
		al1.add(20);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add("Gani");
		System.out.println(al1);
		al.addAll(al1);
		System.out.println(al.contains(10));
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.getClass());
		System.out.println(al.indexOf(10));
		System.out.println(al.lastIndexOf(10));
		System.out.println(al1.indexOf(20));
		System.out.println(al1.lastIndexOf(20));
		System.out.println(al.remove(1));
		al.removeAll(al1);
		System.out.println(al);
		al.set(1,550);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.subList(0,2));
	}
}
