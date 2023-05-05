package collectionexample;

import java.util.Comparator;

public class FeesComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.fees>o2.fees)
		{
			return 1;
		}
		else if(o1.fees<o2.fees)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
