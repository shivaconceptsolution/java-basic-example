package scs;
import java.util.Scanner;
public class PrimeExample {
   static int start,end;
   static String s="";
   static void accept(int start,int end)
   {
	   PrimeExample.start=start;
	   PrimeExample.end=end;
   }
   
   static void primeLogic()
   {
	   int i;
	   for(int num=start;num<end;num++)
	   {
	   for(i=2;i<num;i++)
	   {
		   if(num%i==0)
		   {
			   
			   break;
		   }
	   }
	   if(num==i)
	   {
		   s += num + "\n";
	   }
	   }
	   
   }
   static void display()
   {
	   System.out.println(s);
   }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting point");
		int a,b;
		a = sc.nextInt();
		System.out.println("Enter Ending point");
		b = sc.nextInt();
		
		PrimeExample.accept(a,b);
		PrimeExample.primeLogic();
		PrimeExample.display();

	}

}
