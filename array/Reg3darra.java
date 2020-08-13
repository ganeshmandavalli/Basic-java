package array;
import java.util.Scanner;
public class Reg3darra {
	public static void main(String[] args) {
		int [][][]a=new int[2][3][4];
		Scanner scan=new Scanner(System.in);
				for(int i=0;i<a.length;i++){
					for(int j=0;j<a[i].length;j++) {
						for(int k=0;k<a[i][j].length;k++) {
							System.out.println("enter a marks of school"+" "+(i+1)+" "+"class"+" "+(j+1)+" "+"student"+" "+(k+1));
							a[i][j][k]= scan.nextInt();
						}
					}
			
		}
				System.out.println("The marks of students:");
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].length;j++) {
						for(int k=0;k<a[i][j].length;k++) {
							System.out.println(a[i][j][k]);	
							}
						}
					}
	}
}
