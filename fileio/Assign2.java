package fileio;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Assign2 {
	public static void main(String[] args) throws IOException {
		File f=new File("E:\\ioprg\\output2.txt");
		File f1=new File("E:\\ioprg\\output3.txt");
		f.createNewFile();
		f1.createNewFile();
		FileWriter fw=new FileWriter("E:\\ioprg\\output2.txt");
		FileWriter fw1=new FileWriter("E:\\ioprg\\output3.txt");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the details:");
		while(true) {
			String data=scan.next();
			if(data.equalsIgnoreCase("Exit")) {
				break;
			}
			else
			{
				String []split=data.split(":");
				fw.write(split[0]+"\n");
				fw1.write(split[1]+"\n");
			}
		}
		fw.flush();
		fw1.flush();
		fw.close();
		fw1.close();
		scan.close();
	}
}
