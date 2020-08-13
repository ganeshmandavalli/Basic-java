package String;
import java.util.Scanner;
public class A4 {
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine(); 
		int  vowels=0,consonants=0,digits=0,specialcharacters=0,space=0;
		String res="",res1="",res2="",res3="";
		for(int i=0;i<s.length();i++) {
			char ch;
			ch =s.charAt(i);
		    if((s.charAt(i)=='A')||(s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='E')||(s.charAt(i)=='i')
				    ||(s.charAt(i)=='I')||(s.charAt(i)=='o')||(s.charAt(i)=='O')||(s.charAt(i)=='U')||(s.charAt(i)=='u'))
			{
				vowels++;
				res=res+s.charAt(i)+",";
			}
		    else if((s.charAt(i)>=65)&&(s.charAt(i)<=90)||(s.charAt(i)>=97)&&(s.charAt(i)<=122))
			{
			    consonants++;	
			    res1=res1+s.charAt(i)+",";
			}
			else if((s.charAt(i)=='9')||(s.charAt(i)=='0')||(s.charAt(i)=='1')||(s.charAt(i)=='2')||(s.charAt(i)=='3')
				    ||(s.charAt(i)=='8')||(s.charAt(i)=='7')||(s.charAt(i)=='6')||(s.charAt(i)=='5')||(s.charAt(i)=='4'))
			{
				digits++;
				res2=res2+s.charAt(i)+",";
			}
			
			else if(s.charAt(i)==' ') {
				space++;
			}
			else {
				specialcharacters++;
				res3+=s.charAt(i)+" ";
			}
		}
		System.out.println("vowels:"+vowels);
		System.out.println("consonants:"+consonants);
		System.out.println("digits:"+digits);
		System.out.println("special characters:"+specialcharacters);
		System.out.println("result of spaces:"+space);
		System.out.println("result of vowels :"+res);
		System.out.println("result of consonants:"+res1);
		System.out.println("result of digits:"+res2);
		System.out.println("result of specialcharacters:"+res3);
	}
}
