package scs;

public class StringExample {

	public static void main(String[] args) {
		String s = "welcome";
		int cv=0,cc=0;
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
		    {
		    	cv++;
		    }
		    else
		    {
		    	cc++;
		    }
		}
		System.out.println("Total vowels are "+cv);
		System.out.println("Total Consonents are "+cc);
		
	}

}
