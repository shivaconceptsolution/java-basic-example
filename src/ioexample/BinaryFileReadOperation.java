package ioexample;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReadOperation {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("d://abc.txt");
		byte arr[] = new byte[12];
		while(fi.read(arr)!=-1)
		{
			String s = new String(arr);
			System.out.println(s);
		}
		fi.close();

	}

}
