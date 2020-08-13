package String;
import java.util.Scanner;
public class A3 {
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		 {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
				count++;
		 }
		String ar[]=new String[count+1];
		String temp="";
		int j=0;
		for(int i=s.length()-1;i>=0;i--)
		{//this_is_my_class
			if(s.charAt(i)!=' ')        //  
				temp=temp+s.charAt(i);  //  temp= ssalc temp=si temp =ym temp = shit
			else
			{
				ar[j]=temp; // 3=shit 2=ym  1=si 0=sssalc
				j++;        // 4      3     2    1
 				temp="";
			}
		}
		ar[j]=temp;//3=shit
		System.out.println("The reversed of each word in a string is:");
		for(int i=ar.length-1;i>=0;i--){
			System.out.print(ar[i]+" ");
			}
		System.out.println();
		System.out.println("The reversed of entire words in a string is:");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}