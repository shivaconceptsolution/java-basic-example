package scs;

public class SortArr {

	int arr[];
	void accept(int [] arr)
	{
		 this.arr=arr;
	}
	void sortLogic()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
			
		}
	}
	
	void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int x[] = {12,34,11,7,9,91,102,34};
		SortArr obj = new SortArr();
		obj.accept(x);
		obj.sortLogic();
		obj.display();

	}

}
