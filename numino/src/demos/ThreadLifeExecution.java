class thread implements Runnable 
{
	
	 public void run() 
	    { 
	      
	        try
	        { 
	            Thread.sleep(1500); 
	        }  
	        catch (InterruptedException e)  
	        { 
	            e.printStackTrace(); 
	        } 
	          
	        System.out.println("State of  -"+ 
	        		ThreadLifeExecution.thread1.getState()); 
	        try
	        { 
	            Thread.sleep(200); 
	        }  
	        catch (InterruptedException e)  
	        { 
	            e.printStackTrace(); 
	        }      
	    } 
		
}



public class ThreadLifeExecution implements Runnable {

	
	 public static Thread thread1; 
	 public static ThreadLifeExecution obj; 
	 
	 
	 
	 
	
	
	   
	    public static void main(String[] args) 
	    { 
	        obj = new ThreadLifeExecution(); 
	        thread1 = new Thread(obj); 
	          
	        
	        System.out.println("State of 1 Thread created   " + thread1.getState()); 
	        thread1.start(); 
	          
	       
	        System.out.println("State of  1 Thread  " +  
	            thread1.getState()); 
	    } 
	      
	    public void run() 
	    { 
	        thread myThread = new thread(); 
	        Thread thread2 = new Thread(myThread); 
	          
	        System.out.println("State of 2 Thread created "+ thread2.getState()); 
	        thread2.start(); 
	          
	        System.out.println("State   2 Thread  " +  
	            thread2.getState()); 
	          
	        try
	        { 
	            Thread.sleep(200); 
	        }  
	        catch (InterruptedException e)  
	        { 
	            e.printStackTrace(); 
	        } 
	        System.out.println("State of  2 Thread - "+  
	            thread2.getState() ); 
	          
	          
	        try 
	        { 
	            thread2.join(); 
	        }  
	        catch (InterruptedException e)  
	        { 
	            e.printStackTrace(); 
	        } 
	        System.out.println("State of  2 Thread - " +  
	            thread2.getState()); 
	    } 
	      
	} 
