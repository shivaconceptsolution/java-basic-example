package scs;

public class InstanceVariableExample {

	int x=10;
	int y=20;
	
	public static void main(String args[])
	{
		InstanceVariableExample obj = new InstanceVariableExample();
		System.out.println(obj.x+obj.y);
	}
}
