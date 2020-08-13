package String;
import java.util.*;
public class A8 {
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scan =new Scanner(System.in);
		String s1=scan.nextLine();
		String s=s1.toLowerCase();
		char[] ch=s.toCharArray();
		char temp=' ';
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
		System.out.println("Ascending order:");
		System.out.println(ch);
        //String s2=String.valueOf(ch)
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
		System.out.println("Dscending order:");
		System.out.println(ch);
	}		
}
