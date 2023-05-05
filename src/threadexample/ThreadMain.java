package threadexample;

public class ThreadMain {

	public static void main(String[] args) {
		Table obj = new Table();
		Thread1 t1 = new Thread1(obj);
		t1.start();
		t1.setDaemon(true);
		Thread2 t2 = new Thread2(obj);
		t2.start();

	}

}
