package array;
import java.util.Scanner;
public class Regarr1d {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the marks of students"+" "+(i+1));
			a[i]=scan.nextInt();
			}
		System.out.println("The marks of students:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
