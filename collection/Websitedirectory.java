package collection;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
public class Websitedirectory 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a websites ");
		String [] links=scan.next().split(",");
		//create a Website directory (Unique and Alphabetical order)
		TreeSet <String> websites=new TreeSet();
		for(String temp:links) 
		{
			websites.add(temp);
		}
		System.out.println("Sorted Strings in Ascending order");
		Iterator <String> itr = websites.iterator();
		{
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
	}
}
