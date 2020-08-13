package collection;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Linedhashset {

	public static void main(String[] args) 
	{
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a user ");
		String [] user=scan.next().split(",");
		//Remove Duplicates and insertion order should be mentioned
		LinkedHashSet <String> lhs= new LinkedHashSet();
		//length greater than 4 and less than 10 should be added as user
		for(String temp:user) 
		{
			if(temp.length()>4&&temp.length()<10) 
			{
				lhs.add(temp);	
			}
		}
		//Display the user
		System.out.println("Display the user length greater than 4 and less than 10:");
		Iterator <String> itr = lhs.iterator();
		{
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	    }
	}
}
