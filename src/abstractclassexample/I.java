package abstractclassexample;

public interface I {
  int a=10; //final variable
  static void fun() // static method
  {
  System.out.println("Static");
  }
  default void fun2() // default method
  {
  System.out.println("Default method");
  }
  abstract void fun3(); // abstract method
  
}
