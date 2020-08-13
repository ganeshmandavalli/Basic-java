package String;
import java.util.Scanner;
public class A5 {
	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String res="";
		int si=0,ei=0,count=0;
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
				count++;
			}else if(s.charAt(i)!=' '){
				res+=s.charAt(i);
			}
		}
		count= count+1;
		System.out.println("Delete the multiple spaces:");
		System.out.println(res);
		String ar[]=new String[count];
		String temp="";
		int j=0;
		for(int i=res.length()-1;i>=0;i--)
		{//this_is_my_class
			if(res.charAt(i)!=' ')        //  
				temp=temp+res.charAt(i);  // temp= ssalc temp=si temp =ym  temp = shit  
			else
			{
				ar[j]=temp; // 0=sssalc  1=si  2=ym  3=shit 
				j++;        //    1        2    3     4
 				temp="";
			}
		}
		ar[j]=temp;
		System.out.println("The reverse of a each word of string is:");
		for(int i=ar.length-1;i>=0;i--){
			System.out.print(ar[i]+' ');
			}
		System.out.println();
		System.out.println("The reverse of entire string is:");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+' ');
		}
	}
}