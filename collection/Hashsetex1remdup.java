package collection;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
public class Hashsetex1remdup {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word");
		String word=scan.next();
		//iterator
		HashSet <Character> hs= new HashSet();
		for(int i=0;i<word.length();i++) {
			hs.add(word.charAt(i));
		}
		//display
		Iterator <Character> itr=hs.iterator(); 
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		
	}
}
