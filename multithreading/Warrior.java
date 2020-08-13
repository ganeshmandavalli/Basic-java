package multithreading;
class Battle implements Runnable{
	String Res1="Ak47";
	String Res2="missile";
	String Res3="nuclear";
	@Override
	public void run() {
		try {
			Thread t =Thread.currentThread();
			String name=t.getName();
			if(name.equals("india")) {
				india();
			}
			else {
				pak();
			}
		}
		catch(Exception e) {
		e.printStackTrace();	
		}
	}
	public void india() throws Exception{
		Thread.sleep(1000);
		synchronized(Res3){//res3 used
			System.out.println("india has accquired"+" "+Res3);
			Thread.sleep(1000);
			synchronized(Res2){//res2 used 
				System.out.println("india has accquired"+" "+Res2);
				Thread.sleep(1000);
				synchronized(Res1){// res 1 used in pak and it acyclic.
					System.out.println("india has accquired"+" "+Res1);
				}
			}
		}
	}
	public void pak() throws Exception{
		Thread.sleep(1000);
		synchronized(Res1){//res1 used
			System.out.println("pak has accquired"+" "+Res1);
			Thread.sleep(1000);
			synchronized(Res2){// res2 in lock used in india and after the dealock happens.
				System.out.println("pak has accquired"+" "+Res2);
				Thread.sleep(1000);
				synchronized(Res3){//res3 used in india and it acyclic and deadlock happens
					System.out.println("pak has accquired"+" "+Res3);
				}
			}
		}
	}
}
public class Warrior {
	public static void main (String[] args) throws Exception {
		Battle b=new Battle();
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		t1.setName("india");
		t2.setName("pak");
		t1.start();
		t2.start();
	}
}
