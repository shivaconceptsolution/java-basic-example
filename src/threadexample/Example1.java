package threadexample;

public class Example1 extends Thread {
	public void run()
	{
		for(int process=1;process<=10;process++)
		{
			try
			{
		System.out.println(process + Thread.currentThread().getName());
			Thread.sleep(1000); //non runnable
			}
			catch(InterruptedException ex)
			{
				
			}
		}
	}
	public static void main(String args[]) throws InterruptedException
	{
		Example1 obj = new Example1();
		obj.start();
		obj.join();
		Example1 obj1 = new Example1();
		obj1.start();
	}

}
