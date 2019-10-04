
import java.lang.*;

class MyThread extends Thread
{
	
	
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" In Control ");
		
		
	}
}


public class ThreadYield {
	
	
	public static void main(String a[])
	{
	MyThread t=new MyThread();
	
	t.setName("rajesh");
	
	t.setPriority(5);
	t.start();
	
	
	
	MyThread t2=new MyThread();
	
	t2.setName("bhosale");
	
	t2.setPriority(2);//
	
	t2.start();
	
	for(int i=0;i<5;i++)
	{
		Thread.yield();
		
		System.out.println(Thread.currentThread().getName());
		
		//System.out.println(Thread.currentThread().getPriority());
		
		System.out.println(Thread.currentThread().getState());


	}
		

}

}
