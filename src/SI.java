
public class SI {
    double res;
	public void calcSI(double p,double r, double t)
	{
		try
		{
		res = (p*r*t)/100;
		System.out.println(res);
		}
		catch(Exception ex)
		{
			System.out.println("Enter only numeric data");
		}
	}
	

}

