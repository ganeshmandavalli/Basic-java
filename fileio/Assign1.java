package fileio;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Assign1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("E:\\ioprg\\output1.txt");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of users:");
		int size =scan.nextInt();
		System.out.println("Enter the names:");
		int count=0;
		for(int i=0;i<size;i++) {
			String data=scan.next();
			fw.write(data+"\n");
			count++;
		}
		System.out.println("Count the line:"+" "+count);
		fw.flush();
		fw.close();
		scan.close();
	}
}
