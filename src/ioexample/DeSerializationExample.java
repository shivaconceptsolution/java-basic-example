package ioexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fo = new FileInputStream("d://stu.txt");
		ObjectInputStream oi = new ObjectInputStream(fo);
		Student s =(Student)oi.readObject();
		s.display();
		

	}

}
