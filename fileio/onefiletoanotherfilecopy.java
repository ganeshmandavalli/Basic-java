package fileio;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class onefiletoanotherfilecopy {
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("E:\\ioprg\\output2.txt");
		FileWriter f1=new FileWriter("E:\\ioprg\\output3.txt",true);
		int content;
		while((content=f.read())!=-1) {
			f1.write(content);
		}
		f1.flush();
		f.close();
		f1.close();
	}

}
 