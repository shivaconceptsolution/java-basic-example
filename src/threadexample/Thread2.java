package threadexample;

public class Thread2 extends Thread {
	Table t;
    Thread2(Table t)
    {
    	this.t=t;
    }
    public void run()
    {
    	try {
			t.displayTable(9);
		} catch (InterruptedException e) {
			
		}
    }
}
