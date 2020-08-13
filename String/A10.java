package String;
import java.util.Scanner;
public class A10 {
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scan =new Scanner(System.in);
		String s1=scan.nextLine();
		String s=s1.toLowerCase();
		String characters="";
		String duplicates="";
		
        for(int i=0;i<s.length();i++) 
        {
        String current=Character.toString(s.charAt(i));
        if(characters.contains(current))
        {
        	if(!duplicates.contains(current)) 
        	{
        		duplicates+=current;	
        	}
        }else 
        {
        characters=characters+current;	
        }
        }
        System.out.println("reapted characters:");
        System.out.println(duplicates);
        System.out.println("Removing reapted characters:");
        System.out.println(characters);
	}
}
    

