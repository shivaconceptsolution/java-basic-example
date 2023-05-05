package inhr;

public class Employee extends Admin {
  private int sal;
  void accept1(int sal)
  {
	  this.sal=sal;
  }
  void display1()
  {
	  System.out.println("Salary is "+sal);
  }
}
