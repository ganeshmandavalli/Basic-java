package multithreading;
class Printer implements Runnable{
	@Override
	synchronized public void run() {
		try {
			Thread t=Thread.currentThread();
			String name=t.getName();
			System.out.println(name + " "+"Document starts printing");
			Thread.sleep(1000);
			System.out.println(name +" "+"Document is processed");
			Thread.sleep(1000);
			System.out.println(name +" "+"Document is completed");
			Thread.sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
public class Sych {
	public static void main(String[] args) {
		Printer p=new Printer();
		Thread t1 =new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(p);
		Thread t4=new Thread(p);
		Thread t5=new Thread(p);
		t1.setName("Telegu");
		t2.setName("Tamil");
		t3.setName("Kannada");
		t4.setName("Malayalam");
		t5.setName("English");
		t1.start();
		t2.start();
		t3.start(); 
        t4.start();
        t5.start();
		}
}
