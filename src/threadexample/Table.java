package threadexample;

public class Table {
      void displayTable(int num) throws InterruptedException
      {
    	  synchronized(this)
    	  {
    	  for(int i=1;i<=10;i++)
    	  {
    		 
    		  System.out.println(num*i);
    		  if(i>5)
    		  {
    		  wait(5000);
    		  notify();
    		  }
    		  else
    			  Thread.sleep(1000);
    	  }
    	  }
    	  System.out.println("hello");
      }
}
