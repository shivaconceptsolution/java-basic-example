package inhr;

public class CallStaff {

	public static void main(String[] args) {
		Admin obj = new Admin();
		obj.accept(1001,"Admin");
		obj.display();
		Employee obj1 = new Employee();
		obj1.accept(1002,"Employee");
		obj1.accept1(12000);
		obj1.display();
		obj1.display1();
		
		OtherStaff obj2 = new OtherStaff();
		obj2.accept(1003,"Other Staff");
	//	obj2.accept1(12000);
		obj2.accept2(500);
		obj2.display();
	//	obj2.display1();
		obj2.display2();

	}

}
