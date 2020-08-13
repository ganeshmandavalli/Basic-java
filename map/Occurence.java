package map;
import java.util.Scanner;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
public class Occurence 
{
	public static void main(String[] args) 
	{
		HashMap<Character,Integer> hs= new HashMap();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word:");
		String data=scan.next();
		for(int i=0;i<data.length();i++) 
		{
			char c=data.charAt(i);
			if(hs.containsKey(c)) 
			{
				int count=hs.get(c);
				hs.put(c, ++count);
			}
			else
			{
				hs.put(c,1);
			}
		}
		System.out.println("keys:repetation");
		Set<Character> key = hs.keySet();
			for(Character temp:key) 
			{
				System.out.println(temp+":"+hs.get(temp));
			}
		System.out.println("keys:Pairs");	
		HashMap<Character,Integer> hs1= new HashMap<Character, Integer>();
		Set<Character> key1 = hs.keySet();
			for(Character temp:key1) 
			{
				int count1=0;
				if(hs.get(temp)>=2) 
				{
				count1=hs.get(temp)/2;
				hs1.put(temp,count1);
				}
			}
		Set<Character> key2 = hs1.keySet();
			for(Character temp:key2) 
			{
				System.out.println(temp+":"+hs1.get(temp));
			}
		Collection<Integer> values=hs1.values();
		int count2=0;
		    for(int temp:values)
				{
				    count2=count2+temp;
				}
		    System.out.println("The no of pairs are:"+count2);
	}
}
