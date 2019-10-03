package demos;
import java.util.*;


 class R extends Thread
{
	
	public  void run()
	{
		System.out.println("Priting the odd series : ");
	
		for(int i=0;i<10;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
	
	
}
class B extends Thread
{
	
	public void run()
	{
		System.out.println("Priting the Even series : ");
		
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}
}
public class MultiTaskingThread {
	
	public static void main(String a[])
	{

		R r=new R();
		
		r.start();
		
		
		B b=new B();
		
		b.start();
		
		
	}
	
	
	

}
