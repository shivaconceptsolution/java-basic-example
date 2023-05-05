package scs;

public class ArrayExample {
   int x[] = {12,23,67,78,81};
   void arrDisplay1()  //default without return type
   {
	   for(int d:x)
	   {
		   System.out.println(d);
	   }
   }
   int [] arrDisplay()  // default with return type
   {
	  return x; 
   }
   
   void arrDisplay3(int x[]) //parametrised without return type
   {
	   for(int data:x)
	   {
		   System.out.println(data);
	   }
   }
   int [] arrDisplay4(int x[]) //parametrised with return type
   {
	   return x;
   }
   
   public static void main(String args[])
   {
	   int y[] = {12,23,67,78,81};
	   ArrayExample obj = new ArrayExample();
	   obj.arrDisplay1();
	  int arr[]= obj.arrDisplay();
	  for(int k:arr)
	  {
		  System.out.println(k);
	  }
	   obj.arrDisplay3(y);
	   int arr1[]= obj.arrDisplay4(y);
	   for(int k:arr1)
		  {
			  System.out.println(k);
		  }
   }
}
