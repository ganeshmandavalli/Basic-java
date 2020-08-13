package array;

public class A2 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1||j==5||i==5||j==1)
				{
					System.out.print("1");
				}
				else if(i==3&&j==3){
					System.out.print("3");
				}
				else {
					System.out.print("2");
				}
			}
			System.out.println();
		}
	}
}
