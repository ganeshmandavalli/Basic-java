package map;
import java.util.*;
import java.util.Map.*;
public class Phonedirectory {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no  of users:");
		HashMap<String,Long> Phonedirectory =new HashMap<>();
		long size =scan.nextLong();
		System.out.println("Enter the details of user");
		for(int i=0;i<size;i++) 
		{
			String data=scan.next();
			String split[]= data.split("-");
			Phonedirectory.put(split[0],Long.parseLong(split[1]));
		}
		System.out.println("keys:user");
		Set<String> key = Phonedirectory.keySet();
			for(String temp:key) 
			{
				System.out.println(temp);
				//System.out.println(Phonedirectory.keySet());
			}
		System.out.println("values:phonedirectory");
		Collection<Long> key1=Phonedirectory.values();
		for(long temp:key1)
		{
			System.out.println(temp);
			//System.out.println(Phonedirectory.values());
		}
		System.out.println("Details:");
		Set<Entry<String, Long>> temp1=Phonedirectory.entrySet();
			for(Entry<String, Long> temp2:temp1) 
			{
				System.out.println(temp2);	
			}
			
	}
}
