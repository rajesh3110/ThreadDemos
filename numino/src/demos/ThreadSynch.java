class Tablew{  
	
	
synchronized static void printTable(int n)
 {  
   
	 for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try
     {  
     
    	 Thread.sleep(400);  
     
     }
     catch(Exception e)
     {
    	 System.out.println(e);
    	 }  
   }  
  
 }  
}  
  
class AThread extends Thread
{  

public void run()
{  
	Tablew.printTable(5);  
}  
  
}  
class BThread extends Thread{  

public void run()
{  
	Tablew.printTable(100);  
}  
}  
  
public class ThreadSynch{  

	public static void main(String args[])
	{  

		Tablew obj = new Tablew();//only one object  
		AThread t1=new AThread();  

        BThread t2=new BThread();  

        t1.start();  

        t2.start();  
}  
}  
