package abstractclassexample;

public class CallAbstract {

	public static void main(String[] args) {
		Area obj =new AreaImpl();
		obj.accept(10, 2);
		obj.rectArea();
		obj.display();
		Operation obj1 = new AreaImpl();
		obj1.addition(10, 2);
		obj1.division(100, 2);

	}

}
