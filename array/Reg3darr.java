package array;
import java.util.Scanner;
public class Reg3darr{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int[][] a=new int[3][4];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
		System.out.println("enter the marks of class"+" "+(i+1)+" "+"Students"+" "+(j+1));
		a[i][j]=scan.nextInt();
		}
	}
	System.out.println("The marks of students:");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
		System.out.println(a[i][j]);
	}
		}
		
	}
}