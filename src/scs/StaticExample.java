package scs;

public class StaticExample {

	 static int x=10,y=20; //global
	 public static void main()
	 {
		 System.out.println("hello");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x=1,y=2; //local variable
         StaticExample.x=100;
         StaticExample.y=200;
         System.out.println(x+y); //local
         System.out.println(StaticExample.x+StaticExample.y); //global
         main();
	}

}
