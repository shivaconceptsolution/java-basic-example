package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> obj = new ArrayList<Integer>(); // Generic
		obj.add(1);
		obj.add(2);
		obj.add(7);
		obj.add(11);
		obj.add(9);
		Iterator<Integer> it = obj.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o);
		}
		System.out.println("List Iterator Example");
		ListIterator<Integer> it1 = obj.listIterator();
		while(it1.hasNext())
		{
			Object o = it1.next();
			System.out.println(o);
		}
		while(it1.hasPrevious())
		{
			Object o = it1.previous();
			System.out.println(o);
		}
	}

}
