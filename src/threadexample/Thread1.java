package threadexample;

public class Thread1 extends Thread {
	Table t;
    Thread1(Table t)
    {
    	this.t=t;
    }
    public void run()
    {
    	try {
			t.displayTable(5);
		} catch (InterruptedException e) {
			
		}
    }
}
