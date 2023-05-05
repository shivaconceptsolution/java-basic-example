package collectionexample;

public class Student  {
   int rno;
   String sname;
   int fees;
   Student(int rno,String sname,int fees)
   {
	   this.rno=rno;
	   this.sname=sname;
	   this.fees=fees;
	   
   }
   void display()
   {
	   System.out.println("rno is "+rno + " name is "+sname + "fees is "+ fees);
   }

}
