
class Customer

{  

	int amount=10000;  
      
    
	synchronized void withdraw(int amount)
	{
		
    System.out.println("going to withdraw...\n ");  
      
    if(this.amount<amount)
    {  
    
    	System.out.println("Low balance; waiting for deposit...\n");  
    
    	try
    	{
    		wait();
    	}
    	catch(Exception e)
    	{
    		
    	}  
    }  
    
    this.amount-=amount;  
    
    System.out.println("withdraw completed...\n");  
    
	}  
      
    synchronized void deposit(int amount)
    {  
    
    	System.out.println("going to deposit...\n");  
    
    	this.amount+=amount;  
    
    	System.out.println("deposit completed... \n");  
    
    	notify();  
    
    }  
    
}  
      
    class InterThreadCommunication
    {  
    
    	public static void main(String args[])
    	{  
    
    		
    		final Customer c=new Customer();  
    new Thread(){  
    
    	public void run()
    	{
    		c.withdraw(15000);
    		}  
    }.start();  
    new Thread()
    {  
    
    	public void run()
    	{
    		c.deposit(10000);
    		}  
    }.start();
    
      
    }
    	}  
