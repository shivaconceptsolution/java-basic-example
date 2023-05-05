package collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListGeneric {

	public static void main(String[] args) {
	List<Student> obj = new ArrayList<Student>();
	Student s1 = new Student(1001,"Stu1",12000);
	Student s2 = new Student(1003,"stu2",60000);
	Student s3 = new Student(1002,"stu3",50000);
	obj.add(s1);
	obj.add(s2);
	obj.add(s3);
	//Collections.sort(obj, new FeesComparator());
	Collections.sort(obj, new RnoComparator());
	for(Student s:obj)
	{
		s.display();
	}

	}

}
