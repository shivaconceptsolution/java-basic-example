package scs;

public class SI {
  private float p,r,t,si;
  void accept(float p,float r, float t)
  {
	  this.p=p; // this is keyword that point the address of current object
	  this.r=r;
	  this.t=t;
  }
  void calcSI()
  {
	  si = (p*r*t)/100;
  }
  void display()
  {
	  System.out.println("SI is "+si);
  }
  public static void main(String args[])
  {
	  SI obj = new SI();
	  obj.accept(12000,2,2);
	  obj.calcSI();
	  obj.display();
  }
}
