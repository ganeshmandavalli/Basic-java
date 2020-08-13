package collection;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
class Producer implements Runnable
 {
	 protected BlockingQueue<String> pbq;
	 public Producer(BlockingQueue<String> pbq) 
	 {
		 this.pbq=pbq;
	 }
	@Override
	public void run() 
	{
		while(true)
		{
			try
			{
				String data = UUID.randomUUID().toString();
				System.out.println("put():"+data);
				pbq.put(data);
				Thread.sleep(1000);
			}
		catch(Exception e) 
			{
			e.printStackTrace();
		    }
	    }
     }
}
class Consumer implements Runnable
{
	 protected BlockingQueue<String> pbq;
	 public Consumer(BlockingQueue<String> pbq) 
	 {
		 this.pbq=pbq;
	 }
	@Override
	public void run() 
	{
		while(true)
		{
			try
			{
				String data = pbq.take();
				System.out.println(Thread.currentThread().getName()+"take():"+data);
				pbq.put(data);
				Thread.sleep(1000);
			}
		catch(Exception e) 
			{
			e.printStackTrace();
		    }
	    }
    }
}
public  class Pc {

	public static void main(String[] args) {
	 BlockingQueue<String> pbq = new PriorityBlockingQueue<String>();
		new Thread(new Producer(pbq)).start();
		new Thread(new Consumer(pbq)).start();
	}
}
