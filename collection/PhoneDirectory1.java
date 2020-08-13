package collection;
import java.util.ArrayList;
import java.util.Scanner;
public class PhoneDirectory1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the details of phone based directory");
		while(true) {
			String name=scan.next();
			if(name.equalsIgnoreCase("exit")) {
				break;
			}
			else {
				al.add(name);
			}
		}
		for(String temp:al) 
		{
			System.out.println(temp);
		}
	}
}
