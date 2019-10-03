package demos;

public class ThreadJoin extends Thread {

    public void run()
    {
    	
       for(int i=0;i<10;i++)
    	
        {
    	   try
    	   {
   		Thread.sleep(100);
 	    System.out.println(i);	
 	   System.out.println(Thread.currentThread().getName());  
    	   }
        catch(Exception e)
    	   {
        	System.out.println(e);
    	   }
        }
    		
    }
    
	public static void main(String ag[])
	{
		
		
	
	ThreadJoin t1=new ThreadJoin();
	t1.start();
	
	ThreadJoin t2=new ThreadJoin();
	ThreadJoin t3=new ThreadJoin();
	t1.setName("Rajesh");
	t2.setName("bhosale");
	System.out.println(t1.getName());
	
	System.out.println(t2.getName());
	
	System.out.println(t3.getName());
	System.out.println(t3.getId());


	try
	{
		t1.join();
		
		Thread.sleep(1000);
	}
	catch(Exception s)
	{
		System.out.println(s);
	}
	
	t2.start();
	t3.start();
	
}
}