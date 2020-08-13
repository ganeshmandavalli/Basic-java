package collection;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Comparator;
class Mycomparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer val1, Integer val2) 
	{
		if(val1>val2)
			return -1;
		else if(val1<val2)
			return 1;
		else
			return 0;
	}
}
public class Treesetdescord 
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);	
		System.out.println("Choose how many integers:");
		TreeSet <Integer> ts =new TreeSet<Integer>(new Mycomparator());
		while(true) 
		{
			//Enter the no of integers 
			int num=scan.nextInt();
			System.out.println("Enter the integers:");
			for(int i=0;i<num;i++) 
			{
				ts.add(scan.nextInt());
			}
			System.out.println("Desending order:");
			System.out.println(ts);
		}
	}
}
