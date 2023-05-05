package inhr;

public class OtherStaff extends Admin {
   private int bonus;
   void accept2(int bonus)
   {
	   this.bonus=bonus;
   }
   void display2()
   {
	   System.out.println("Bonus is "+bonus);
   }
}
