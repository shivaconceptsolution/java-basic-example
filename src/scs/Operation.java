package scs;

public class Operation {
    int a=10,b=2,c;
    void addition(int a, int b)
    {
    	System.out.println(a+b);
    }
    int substraction(int a, int b)
    {
    	return a-b;
    }
    void multiplication()
    {
    	c=a*b;
    	System.out.println("Result is "+c);
    }
    int division()
    {
    	c=a/b;
    	return c;
    }
	public static void main(String[] args) {
		
        Operation obj = new Operation();
        obj.addition(1000,200);
        int x = obj.substraction(1000,2);
        System.out.println(x);
        obj.multiplication();
        int y = obj.division();
        System.out.println(y);
	}

}
