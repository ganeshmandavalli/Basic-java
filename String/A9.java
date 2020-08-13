package String;

import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=scan.nextLine();
		System.out.println("Enter the Character:");
		CharSequence ch;
		ch= scan.next();
		boolean value=s.contains(ch);
		System.out.print("Matches:"+value);
	}

}
