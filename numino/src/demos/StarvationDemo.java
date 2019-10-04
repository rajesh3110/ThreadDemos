
public class StarvationDemo extends Thread
{
          static int threadcount=1;
          public void run()
          {
        	 
        	  System.out.println(threadcount+ "st child "+ "Thread Execution starts \n ");
          
              System.out.println("Child Thread Execution completes \n");
              threadcount++;
          
          }
	
	public static void main(String[] args) throws InterruptedException {

		
		
		System.out.println("Main Execution is start  \n ");
		StarvationDemo t1=new StarvationDemo();
		t1.setPriority(3);
		
		StarvationDemo t2=new StarvationDemo();
		t1.setPriority(5);
		
		StarvationDemo t3=new StarvationDemo();
		t1.setPriority(2);
		
		StarvationDemo t4=new StarvationDemo();
		t1.setPriority(9);
		
		StarvationDemo t5=new StarvationDemo();
		t1.setPriority(1);
		
		StarvationDemo t6=new StarvationDemo();
		t1.setPriority(7);
		
		
		
		t1.start();
		t2.start();

		t3.start();

		t4.start();

		t5.start();

		t6.start();
		
		
		System.out.println("Main Execution is complete \n ");
		
		
	}

}
