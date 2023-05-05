package ioexample;

import java.io.Serializable;

public class Student implements Serializable{
	private int rno;
	private transient String sname;
	Student(int rno,String sname)
	{
		this.rno=rno;
		this.sname=sname;
	}
	public void display()
	{
		System.out.println("rno is "+rno + "name is "+sname);
	}

}
