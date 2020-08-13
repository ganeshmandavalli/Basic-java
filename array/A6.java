package array;

public class A6 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<5-i+1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++) {
				if(k==1||k==(2*i)-1) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		for(int k=4;k>=1;k--) 
		{
			for(int m=4;m>=k;m--)
			{
			System.out.print(" ");
			}
		for(int l=1;l<=(2*k)-1;l++) 
		{
			if(l==1||l==(2*k)-1) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		}
		System.out.println();
	}
	}

}
