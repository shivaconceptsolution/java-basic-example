package ioexample;
import java.io.*;
public class FilewriteOperation {
   public static void main(String args[]) throws IOException
   {
	   File f = new File("d://stuinfo.txt");
	   float p=55000,r=3,t=2,si;
	   si = (p*r*t)/100;
	   FileWriter fw = new FileWriter(f,true); //append
	   BufferedWriter bw = new BufferedWriter(fw);
	   bw.write("result is "+si);
	   bw.newLine();
	   bw.close();
	   
   }
}
