package fileio;
import java.io.*;
public class Fileinfolder {

	public static void main(String[] args) throws IOException {
		// create a folder ioprg
		File f=new File("E:\\ioprg");
		System.out.println(f.mkdir());
		// create a file infolder ioprg
		f=new File("E:\\ioprg\\output1.txt");
		System.out.println(f.createNewFile());

	
	}
}
