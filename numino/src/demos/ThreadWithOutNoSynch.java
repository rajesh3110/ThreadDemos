class Table{  
	
	
	synchronized void printTable(int n)
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
  
class MyThread1 extends Thread
{  
Table t;  
MyThread1(Table t)
{  
this.t=t;  
}  
public void run()
{  
t.printTable(21);  
}  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t)
{  
this.t=t;  
}  
public void run()
{  
t.printTable(120);  
}  
}  
  
public class ThreadWithOutNoSynch{  

	public static void main(String args[])
	{  

		Table obj = new Table();//only one object  
        MyThread1 t1=new MyThread1(obj);  

        MyThread2 t2=new MyThread2(obj);  

        t1.start();  

        t2.start();  
}  
}  
