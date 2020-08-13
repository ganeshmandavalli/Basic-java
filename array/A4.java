package array;

public class A4 {
	public static void main(String[] args) {
		int n=0;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=(2*i)+i;k++) {
				if(n==0) {
					System.out.print(++n);
				}else {
					System.out.print(--n);
				}
				
			}
			n--;
			System.out.println();
		}
	}

}
