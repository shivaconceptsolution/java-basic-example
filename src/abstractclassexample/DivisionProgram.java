package abstractclassexample;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg="";
		try
		{
		int a,b,c;
		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		c=a/b;
		System.out.println(c);
		msg = "success";
		}
		catch(ArithmeticException ex)
		{
			System.out.println("denominator can not be zero");
			msg = "fail";
		}
		catch(InputMismatchException ex)
		{
			System.out.println("enter only numeric value");
			msg = "fail";
		}
		finally
		{
			System.out.println(msg);
		}

	}

}
