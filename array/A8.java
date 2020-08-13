package array;
public class A8 {
	public static void main(String[] args) {
		int count = 0,l=1,m=5;
		for(int i=1;i<m;i++) {
			for(int j=m;j>=m-i+1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<m-i+1;k++) {
				System.out.print(k);	
				count++;
			}
			while(l<count){
				count--;
				System.out.print(count);
			}		
			System.out.println();
			count=0;
		}
	}
}
	
