package ioexample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("d://stu.txt");
		Student s = new Student(1001,"xyz");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(s);
		oo.close();
		

	}

}
