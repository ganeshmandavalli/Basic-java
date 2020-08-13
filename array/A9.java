package array;
public class A9{
	public static void main(String[] args) {
		int count = 0,l=1,m=0;
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
			m++;
		}
		for(int n=1;n<m;n++) {
			for(int o=m;o>=m-n+1;o--) {
				System.out.print(" ");
			}
			for(int p=1;p<m-n+1;p++) {
				System.out.print(p);	
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
	
