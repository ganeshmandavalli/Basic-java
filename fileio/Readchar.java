package fileio;
import java.io.*;
public class Readchar {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("E:\\ioprg\\output.txt");
		int content;
		while((content=fr.read())!=-1) 
		{	
			System.out.println((char) content);
		}
		fr.close();
	}
}