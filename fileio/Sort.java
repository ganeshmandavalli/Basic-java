package fileio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class Sort {

	public static void main(String[] args) throws IOException {
		FileReader f= new FileReader("E:\\ioprg\\output3.txt");
		BufferedReader br =new BufferedReader(f);
		TreeSet <String> ts= new TreeSet<String>();
		String x;
		while((x=br.readLine())!=null) 
		{
			ts.add(x);
		}
		FileWriter f1=new FileWriter("E:\\ioprg\\output3.txt");
		BufferedWriter br1 =new BufferedWriter(f1);
		for(String temp:ts) {
			br1.write(temp);
			br1.newLine();
		}
		br1.flush();
		br1.close();
		br.close();
	}
}
