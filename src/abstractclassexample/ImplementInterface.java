package abstractclassexample;

public class ImplementInterface implements I {

	public static void main(String[] args) {
		I obj = new ImplementInterface();
		obj.fun2();
		obj.fun3();

	}

	@Override
	public void fun3() {
		System.out.println("Fun3");
		
	}

}
