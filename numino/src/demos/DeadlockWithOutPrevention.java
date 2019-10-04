

public class DeadlockWithOutPrevention {

	public static Object lock1=new Object();
	
	public static Object lock2=new Object();
	
	
	   
	
	public static void main(String args[])
	{
		 ThreadDemo1 t1=new ThreadDemo1();
			
		 ThreadDemo2 t2=new ThreadDemo2();
		
	      t1.start();
	      t2.start();
	}  
	    private static class ThreadDemo1 extends Thread
		{
			public void run()
			{
				synchronized(lock1)
				{
					System.out.println("Thread 1 Holding lock1  : ");
			
				try
				{
					Thread.sleep(500);
					
				}
				catch(InterruptedException e)
				{
					
				}
				System.out.println("Thread 1 Request for the Lock2 ");
				synchronized(lock2)
				{
					System.out.println("Thread 1 Holding for lock1 & lock2 ");
				}
			}
			
		}
} 

	    private static class ThreadDemo2 extends Thread
		{
			
			public void run()
			{
				synchronized(lock2)
				{
					System.out.println("Thread 2 Holding Lock2: ");
				
				
				try
				{
					Thread.sleep(400);
				}
				catch(InterruptedException e)
				{
					
				}
				System.out.println("Thread 2 Request for the Lock1");
				synchronized(lock1)
				{
					System.out.println("Thread 2 Holding for lock 1 & lock 2");
				}
			}
			
		}
		}
	}

