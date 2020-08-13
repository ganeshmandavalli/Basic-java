package array;
public class A7 {
	public static void main(String[] args) {
		int count = 0,l=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<5-i+1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);	
				count++;
			}
			while(l<count) {
				count--;
				System.out.print(count);
			}		
			System.out.println();
			count=0;
		}
	}
}
	

