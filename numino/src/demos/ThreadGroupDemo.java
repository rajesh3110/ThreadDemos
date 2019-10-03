package demos;

public class ThreadGroupDemo implements Runnable


{

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	
	}
	
	public static void main(String ar[])
    
	{
		
		ThreadGroupDemo d2=new ThreadGroupDemo();
	
		 ThreadGroup tg1=new ThreadGroup("RAJESH");
		 
		 Thread t1=new Thread(tg1,d2,"One ");
		 t1.start();
		 
		 Thread t2=new Thread(tg1,d2,"Two ");
		 t2.start();
		 
		 Thread t3=new Thread(	tg1,d2,"Three");
		 t3.start();
		 try
		 {
		 
		 System.out.println("Name of Parent "+tg1.getName());
		 
		 
		 tg1.list();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 
	
	
       }
  } 
