
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


class Task implements Runnable
{
	private String name;
	
	public String getName()
	{
		return name;
	}
	
	public Task(String name)
	{
		this.name=name;
	}
	
	public void run()
	{
		
		 try {
	            long duration = (long) (Math.random() * 10);
	            System.out.println("Executing : " + name);
	            TimeUnit.SECONDS.sleep(duration);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
	
}




public class ThreadPool {
	
	public static void main(String arg[])
	{
		
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        
		for(int i=0;i<5;i++)
		{
		
		Task t=new Task("Rajesh "+i);
		
		System.out.println("Created "+t.getName());
		executor.execute(t);
		
		}
		executor.shutdown();
        System.out.println("Finished all threads");  
		
	}
	
	

}
