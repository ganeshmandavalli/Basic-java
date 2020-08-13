package collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;
public class Modify {
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList <String>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the nuumbers, when done exit");
		while(true) {
			String name=scan.next();
			if(name.equalsIgnoreCase("exit")) {
				break;
			}
			else {
				al.add(name);
			}
		}
		System.out.println();
		ListIterator<String> itr = al.listIterator();
		while(itr.hasNext()) {
			String name=itr.next();
			itr.set(name.toUpperCase());
		}
		System.out.println(al);
	}
}
