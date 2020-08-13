package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("E:\\ioprg\\output111.txt");
		fw.write("Hello");
		fw.close();
		
	}
}
