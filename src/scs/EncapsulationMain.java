package scs;

public class EncapsulationMain {

	public static void main(String[] args) {
		EncapsulationExample obj = new EncapsulationExample();
	    obj.setA(10);
	    obj.setB(20);
	    obj.setC(obj.getA()+obj.getB());
	    System.out.println(obj.getC());
      
	}

}
