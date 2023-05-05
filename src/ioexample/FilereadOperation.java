package ioexample;


import java.io.*;


public class FilereadOperation {

	public static void main(String[] args) throws IOException {
		   File f = new File("d://stuinfo.txt");
		   FileReader fw = new FileReader(f);
		   BufferedReader bw = new BufferedReader(fw);
		   String data="",s="";
		   while((s=bw.readLine())!=null)
		   {
			   data = data + s;
		   }
		   System.out.println(data);
		   bw.close();

	}

}
