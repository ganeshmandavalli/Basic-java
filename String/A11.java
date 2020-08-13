package String;
import java.util.Scanner;
public class A11 {

	public static void main(String[] args) {
		System.out.println("Enter the number of string:");
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String s[]=new String[n];
        Scanner scan1=new Scanner(System.in);
        String temp="";
        System.out.println("Enter the string:");
        for(int i=0;i<n;i++) 
        {
           s[i]=scan1.next();
        }
        for(int i=0;i<n-1;i++) 
        {
        	for(int j=i+1;j<n;j++) 
        	{
        	if(s[i].compareTo(s[j])>0) 
        	{
              temp=s[i];
              s[i]=s[i+1];
              s[i+1]=temp;
        	}
        }
     }
        System.out.println("Sorted the string in ascending order:");
        for(int i=0;i<n;i++) {
        	System.out.println(s[i]);
        }
        System.out.println("Sorted the string in dscending order:");
        for(int i=n-1;i>=0;i--) {
        	System.out.println(s[i]);
        }
	}
}	
