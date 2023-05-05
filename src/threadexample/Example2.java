package threadexample;

public class Example2 extends A implements Runnable {

	Example2()
	{
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		for(int process=1;process<=10;process++)
		{
			try
			{
 System.out.println(process + super.display() +  
		 Thread.currentThread().getName());
			Thread.sleep(1000); //non runnable
			}
			catch(InterruptedException ex)
			{
				
			}
		}
		
	}
public static void main(String[] args) {
		
     Example2 obj = new Example2();
     Example2 obj1 = new Example2();
     
	}

}
