package scs;

public class ConstructorExample {
    int a,b,c;
	ConstructorExample()
	{
		a=100;
		b=200;
	}
	ConstructorExample(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	ConstructorExample(ConstructorExample o)
	{
		this.a=o.a;
		this.b=o.b;
	}
	void add()
	{
		c=a+b;
	}
	void display()
	{
		System.out.println(c);
	}
	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample();
		obj.add();
		obj.display(); //300
		ConstructorExample obj1 = new ConstructorExample(100,2);
		obj1.add();
		obj1.display(); //102
		ConstructorExample obj2 = new ConstructorExample(obj1);
		obj2.add();
		obj2.display(); //102
	}

}
