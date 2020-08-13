package String;
import java.util.Scanner;
public class A14 {
	public static void main(String[] args) {
		int temp=0,temp1=0;
		String temp2="",characters="";
		System.out.println("Enter the number of string:");
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String s[]=new String[n];
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter the string:");
        for(int i=0;i<n;i++) 
        {
           s[i]=scan1.next();
        }
        for(int i=0;i<=s[i].length();i++) 
        {
        	
        	for(int j=0;j<=s[i].length();j++) 
        	{
        		if(s[j].contains(s[i])) 
        		{
        			temp++;
        		}
        	}
        	temp=0;
        	for(int j=0;j<=n-1;j++) {
        		if(i+1<n) {
        		if(s[j].contains(s[i+1]))
        		{
        			
        				temp1++;
        			}
        		}
        	}
        	temp1=0;
        	if(temp<temp1) {
        		temp2=s[i];
                s[i]=s[i+1];
                s[i+1]=temp2;
        	}
            System.out.print(temp2);
        }
	}
}	