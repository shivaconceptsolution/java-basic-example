package inhr;

public class Admin {
	private int id;
	private String name;
	void accept(int id,String name) {
		this.id=id;
		this.name=name;
				
	}
	void display()
	{
		System.out.println("Id is "+ id + "\n name is "+name);
	}

}
