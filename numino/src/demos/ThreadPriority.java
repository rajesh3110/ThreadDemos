package demos;

public class ThreadPriority extends Thread{
	
	
	public void run()
	{
		
		System.out.println("Name of Thread is "+Thread.currentThread().getName());
		
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception r)
		{
			System.out.println(r);
		}
		
		System.out.println(Thread.currentThread().getPriority());
		
		
	}
	
	public static void main(String a[])
	{
		
		
		ThreadPriority pr1=new ThreadPriority();
		pr1.start();
		
		pr1.setName("Rajesh");
		
		
		ThreadPriority pr2=new ThreadPriority();

		pr2.start();
		pr2.setName("bhosale");
		
		
		pr1.setPriority(Thread.MIN_PRIORITY);
		
		pr2.setPriority(Thread.MAX_PRIORITY);

		
	}
	

}
