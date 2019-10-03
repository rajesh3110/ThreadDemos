package demos;

public class DaemenThreadDemo extends Thread

{
   public void run()
   {
	   
	   if(Thread.currentThread().isDaemon())
	   {
		   System.out.println("Daemon Thread : ");
	   }
	   else
	   {
		   System.out.println("User thread :");
	   }
   }


   public static void main(String ar[])
   {
	   
	   DaemenThreadDemo d1=new DaemenThreadDemo();
	   
	   DaemenThreadDemo d2=new DaemenThreadDemo();
	   
	   DaemenThreadDemo d3=new DaemenThreadDemo();

	   d1.setDaemon(true);

	   d1.start();

	   d2.start();
	   
	   d3.setDaemon(true);
	   
	   d3.start();
	   
	   
   }

}
