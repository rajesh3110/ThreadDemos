package demos;
import java.util.*;

public class RunnableInter implements Runnable {

	
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Even OR Odd");
		
		String m=sc.nextLine();
        if(m.equals("Even"))
        {
		for(int i=0;i<=21;i++)
		{
			if(i%2==0)
				
			System.out.println(i);
			try
			{
			Thread.sleep(300);
		    }
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}}
        else if(m.equals("Odd"))
        {
        	for(int i=0;i<=21;i++)
    		{
        		if(i%2!=0)
    			System.out.println(i);
    			try
    			{
    			Thread.sleep(100);
    		    }
    			catch(InterruptedException e)
    			{
    				System.out.println(e);
    			}
    		}
        }
        else
        {
        	System.out.println("Bye eeeeee");
        }
	   
	}

	
	
	
	
	public static void main(String ag[])
	{
		RunnableInter r1=new RunnableInter();
		Thread t1=new Thread(r1);
		t1.start();
		
		
	}
	
}
