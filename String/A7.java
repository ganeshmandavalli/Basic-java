package String;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String n="";
		char ch= ' ';
		for(int i=0;i<s.length();i++) {
			if(ch!=s.charAt(i)) {
			n=n+s.charAt(i);
			ch=s.charAt(i);
			}	
		}
		System.out.println("Remove the duplicates in a string:");
		System.out.print(n);
	}

}
