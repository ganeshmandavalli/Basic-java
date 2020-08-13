package collection;
import java.util.Scanner;
import java.util.LinkedList;
public class AddELements {
	public static void main(String[] args) {
		LinkedList <Integer>l=new LinkedList<Integer>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers, when done exit");
		while(scan.hasNextInt())
		{
			int number =scan.nextInt();
			String word="";
			if(word.equalsIgnoreCase("Exit")) 
			{
			break;
			}
			else 
			{
				l.add(number);
			}
		}
		System.out.println(l);
		//For-each Loop
		for(int temp: l ) {
			System.out.print(temp+" ");
		}
		System.out.println();
		//For-Loop
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
		
	}
}
