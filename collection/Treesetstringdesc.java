package collection;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Iterator;
class Mycomparator1 implements Comparator<String>
{
	@Override
	public int compare(String s1, String s2) {
		int x=s2.compareTo(s1);
		return x;
	}
}
public class Treesetstringdesc {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);	
		System.out.println("Enter the Strings:");
		TreeSet <String> ts =new TreeSet<String>(new Mycomparator1());
		while(true) 
		{
			String word=scan.next();
			if(word.equalsIgnoreCase("exit")) {
				break;
			}
			else {
				ts.add(word);
			}
		}
		System.out.println("Desending order:");
		System.out.println(ts);
	}
}
	
