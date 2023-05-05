package collectionexample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		//HashSet obj = new HashSet();
		//Set obj = new HashSet();
		//Set<String> obj = new LinkedHashSet();
		Set<String> obj = new TreeSet();
		obj.add("CPP");
		obj.add("C");
		obj.add("JAVA");
		obj.add("iOS");
		obj.add("Android");
		obj.add("CPP");
		obj.remove("CPP");
		//obj.add(12);
		for(Object o:obj)
		{
			System.out.println(o);
		}
		

	}

}
