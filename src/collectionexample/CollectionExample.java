package collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionExample {

	public static void main(String[] args) {
		
		Set<Integer> obj = new LinkedHashSet<Integer>(); // Generic
		obj.add(1);
		obj.add(2);
		obj.add(7);
		obj.add(11);
		obj.add(9);
		List<Integer> obj2 = new ArrayList<Integer>(); // Generic
		for(Integer a:obj)
		{
			obj2.add(a);
			
		}
		for(int i=obj2.size()-1;i>=0;i--)
		{
			System.out.println(obj2.get(i));
		}
	}

}
