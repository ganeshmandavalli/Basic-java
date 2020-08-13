package String;
import java.util.*;
public class A2 {
	public static void main(String[] args) {
		System.out.println("Enter the string and delete the multiple spaces in between them");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String res="";
		int si=0,ei=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				si=i;
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ') {
				ei=i;
				break;
			}
	}
		for(int i=si;i<=ei;i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				res+=s.charAt(i);
			}else if(s.charAt(i)!=' '){
				res+=s.charAt(i);
			}
		}
		System.out.println(res);
	}

}