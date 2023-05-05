package exceptionexample;
import java.util.Scanner;
public class EmpSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int salary;
		System.out.println("Enter Salary");
		salary= sc.nextInt();
		try
		{
			if(salary<10000)
			{
				throw new SalaryException();
			}
			System.out.println("Salary is "+salary);
		}
		catch(SalaryException ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
