package serialdserial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dlauch {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("E:\\ioprg\\customer.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		while((fis.available())!=0) {
			System.out.println("Details of customer name,crn,balance");
			Customer c=  (Customer) ois.readObject();
			System.out.println(c.getname()+"\n"+c.getbalance()+"\n"+c.getcrn());
		}
	}
}

