package demos;
import java.util.*;


	
	public class ThreadDemo extends Thread {

		
		Scanner sc=new Scanner(System.in);

	
		public void run()
		{
			System.out.println("Enter the First number for GCD :: ");
			int gcd1=sc.nextInt();
			System.out.println("Enter the second number for GCD :: ");

			int gcd2=sc.nextInt();
			int gcd=0;
			if(gcd2>=2&&gcd1>=2)
			{		
			for(int i=1;i<=gcd1&&i<=gcd2;i++)
			{
				if(gcd1%i==0&&gcd2%i==0)
				{
					gcd=i;
					try {
					Thread.sleep(1000);
				        }
					catch(Exception r)
					{
						System.out.println(r);
					}
				}
				
			}			
			System.out.println(gcd);
			}
			else
			{
				for(int i=0;i<10;i++)
				{
					try
					{
					Thread.sleep(300);
					System.out.println(i);
					
					}
					
					catch(Exception r)
					{
						System.out.println(r);
					}
				}
			}
			
			
		}
	
		
	public static void main(String ar[])
	{
		
		ThreadDemo d=new ThreadDemo();
		System.out.println("Thread ");
		d.start();
		
		
		
		

		
		
	}
}
