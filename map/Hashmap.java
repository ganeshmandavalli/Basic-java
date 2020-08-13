package map;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Hashmap
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no  of employees");
		Map<String,Integer> details =new HashMap<>();
		int size =scan.nextInt();
		System.out.println("Enter the details of employees");
		for(int i=0;i<size;i++) 
		{
			String data=scan.next();
			String split[]= data.split("=");
			details.put(split[0],Integer.parseInt(split[1]));
		}
		String name[]= new String[size];
		System.out.println("Enter the names to fetch the data");
		for(int i=0;i<size;i++)
		{
			name[i]=scan.next();
		}
		System.out.println("Check present in or not: ");
		for(String key:name)
     	{
			if(details.containsKey(key)) {
				System.out.println(key +"="+details.get(key));
			}
			else {
				System.out.println(key + " "+"missing");
			}
		}
	}
}
	
