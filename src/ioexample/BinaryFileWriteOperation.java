package ioexample;

import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriteOperation {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("d://abc.txt",true);
		String s = "welcome";
		byte arr[] = s.getBytes(); // String to byte array
		fo.write(arr);
		fo.close();
		

	}

}
