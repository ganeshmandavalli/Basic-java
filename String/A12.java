package String;
import java.util.Scanner;
public class A12 {
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the string:");
    String s=scan.nextLine();
    System.out.println("Enter the key:");
    int key=scan.nextInt();
    System.out.println("After the key:");
    for(int i=1;i<key;i++) {
    	System.out.print(s.charAt(i-1));
    }
    System.out.println();
    System.out.println("Before the key:");
    for(int i=key;i<s.length();i++) {
    	System.out.print(s.charAt(i));
    }
    
	}
}
