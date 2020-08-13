package collection;
import java.util.TreeSet;
public class Treesetex1 {
	public static void main(String[] args) {
	 TreeSet <Integer> ts = new TreeSet();
	 ts.add(88);
	 ts.add(77);
	 ts.add(66);
	 ts.add(55);
	 ts.add(88);
	 ts.add(44);
	 ts.add(33);
	 ts.add(22);
	 ts.add(88);
	 System.out.println(ts);
	 System.out.println(ts.first());
	 System.out.println(ts.last());
	 System.out.println(ts.headSet(78));
	 System.out.println(ts.tailSet(42));
	 System.out.println(ts.subSet(23,78));
	 System.out.println(ts.ceiling(33));
	 System.out.println(ts.ceiling(34));
	 System.out.println(ts.higher(33));
	 System.out.println(ts.higher(34));
	 System.out.println(ts.floor(33));
	 System.out.println(ts.lower(33));
	 System.out.println(ts.floor(34));
	 System.out.println(ts.lower(34));
	}
}
