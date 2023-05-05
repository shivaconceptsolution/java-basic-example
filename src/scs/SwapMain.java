package scs;

public class SwapMain {

	public static void main(String[] args) {
		SwapExample obj = new SwapExample();
		obj.setTemp(obj.getA());
		obj.setA(obj.getB());
		obj.setB(obj.getTemp());
		System.out.println(obj.getA() + ", " + obj.getB());

	}

}
