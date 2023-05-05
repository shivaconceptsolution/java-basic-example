package exceptionexample;

public class SalaryException extends Exception{

	public String getMessage()
	{
		return "Salary should be above 10000";
	}
}
