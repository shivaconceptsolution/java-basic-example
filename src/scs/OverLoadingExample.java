package scs;

public class OverLoadingExample {

	void addition(int a, int b)
    {
      System.out.println("Int" + (a+b));
    }
	void addition(Integer a, Integer b)
    {
      System.out.println("Integer" + (a+b));
    }
	
    void addition(int a, int b, int c)
    {
    	 System.out.println(a+b+c);
    }

   void addition(float a,float b)
   {
	   System.out.println("Float" + (a+b));
   }
   void addition(double a,float b)
   {
	   System.out.println(a+b);
   }
   void addition(float a,double b)
   {
	   System.out.println(a+b);
   }
   void addition(double a,double b)
   {
	   System.out.println("Double " + (a+b) );
   }
	public static void main(String[] args) {
		OverLoadingExample obj = new OverLoadingExample();
		obj.addition(1,2);
		obj.addition(1.2,2.3);
		obj.addition(1.2F,2.3F);
		Integer x=10,y=20;
		obj.addition(x,y);
	}

}
