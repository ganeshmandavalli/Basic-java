package String;
import java.util.*;
public class A6 {
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scan =new Scanner(System.in);
		String s1=scan.nextLine();
		String s=s1.toLowerCase();
		char[] ch=s.toCharArray();
		char temp;
		int len=ch.length;
		for(int i=0;i<len;i++) 
		{
		for (int j=0;j<len-1;j++) 
		{
			if(ch[j]>ch[j+1])
			{
				temp=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=temp;
			}
		}
		}
		System.out.println("sorted the string in ascending order:");
		System.out.println(ch);
		String s2=String.valueOf(ch);
		String n="";
		char ch1= ' ';
		for(int i=0;i<s2.length();i++) {
			if(ch1!=s2.charAt(i)) {
			n=n+s2.charAt(i);
			ch1=s2.charAt(i);
			}	
		}
		System.out.println("Remove the duplicate elements in ascending order:");
		System.out.println(n);
		for(int i=0;i<len;i++) 
		{
		for (int j=0;j<len-1;j++) 
		{
			if(ch[j]<ch[j+1])
			{
				temp=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=temp;
			}
		}
		}
		System.out.println("sorted the string in dscending order:");
		System.out.println(ch);
		String s3=String.valueOf(ch);
		String m="";
		char ch2=' ';
		for(int i=0;i<s3.length();i++) {
			if(ch2!=s3.charAt(i)) {
				m=m+s3.charAt(i);
				ch2=s3.charAt(i);
			}
		}
		System.out.println("Remove the duplicate elements in dscending order:");
		System.out.println(m);
	}		
}
