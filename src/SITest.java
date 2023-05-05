import java.util.Scanner;;
public class SITest {

	public static void main(String[] args) {
		try
		{
		Scanner sc = new Scanner(System.in);
		double p,r,t;
		System.out.println("Enter p");
		p=sc.nextDouble();
		System.out.println("Enter r");
		r=sc.nextDouble();
		System.out.println("Enter t");
		t=sc.nextDouble();
		SI obj = new SI();
		obj.calcSI(p,r,t);
		}
		catch(Exception ex)
		{
			System.out.println("Enter only numeric data");
		}
		

	}

}
