package scs;
import java.util.*;
public class ParagraphReverse {

	public static void main(String[] args) {
		System.out.println("Enter Paragraph");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = s+" ";
		String word="";
		int index=0;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		String arr[] = new String[count+1];
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
			{
				word+=s1.charAt(i);
			}
			else
			{
				arr[index]=word;
				word="";
				index++;
			}
		}
		String data="";
        for(String s2:arr)
        {
        	
        	for(int i=s2.length()-1;i>=0;i--)
        	{
        		data=data+s2.charAt(i);
        	}
        	data=data + " ";
        }
        System.out.println(data);
	}

}
