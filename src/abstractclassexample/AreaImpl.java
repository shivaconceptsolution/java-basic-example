package abstractclassexample;

public class AreaImpl implements Area,Operation{
	float area;
    int a,b;
   
	 public void accept(int a,int b)
     {
    	 this.a=a;
    	 this.b=b;
     }
	@Override
	public void rectArea() {
		area = a*b;
		
	}

	@Override
	public void triangleArea() {
		area = (a*b)/2;
		
	}
	 public void display()
     {
    	 System.out.println("Area is "+area);
     }
	@Override
	public void addition(int x, int y) {
		
		System.out.println(x+y);
	}
	@Override
	public void division(int x, int y) {
		System.out.println(x-y);
		
	}
  
}
