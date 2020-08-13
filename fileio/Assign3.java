package fileio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Assign3 {

	public static void main(String[] args) throws IOException {
		File f =new File("E:\\ioprg\\input.txt");
		f.createNewFile();
		File f1 =new File("E:\\ioprg\\output11.txt");
		f1.createNewFile();
		File f2 =new File("E:\\ioprg\\output12.txt");
		f2.createNewFile();
		FileWriter f11=new FileWriter("E:\\ioprg\\input.txt");
		BufferedWriter br1 =new BufferedWriter(f11);
		br1.write("India is my country");
		br1.flush();
		FileReader f13=new FileReader("E:\\ioprg\\input.txt");
		BufferedReader br2=new BufferedReader(f13);
		FileWriter f14=new FileWriter("E:\\ioprg\\output11.txt");
		BufferedWriter br3 =new BufferedWriter(f14);
		FileWriter f15=new FileWriter("E:\\ioprg\\output12.txt");
		BufferedWriter br4 =new BufferedWriter(f15);
		String contents;
		while((contents=br2.readLine())!=null) {
			br3.write(contents.toUpperCase());
			br3.newLine();
			br4.write(contents.toLowerCase());
			br4.newLine();	
		}
		br3.flush();
		br4.flush();
		br3.close();
		br4.close();
		br1.close();
	}
}


