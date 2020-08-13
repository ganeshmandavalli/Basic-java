package String;
import java.util.*;
public class A1 {
	public static void main(String[] args) {
		System.out.println("Enter the string and delete the spaces in between them");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				res=res+s.charAt(i);
			}	
		}
		System.out.println(res);
	}

}
