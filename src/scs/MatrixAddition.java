package scs;

public class MatrixAddition {
    int x[][] = {{1,2},{3,4}};
    int y[][] =  {{4,5},{7,8}};
	int [][] addition(int a[][],int b[][])
	{
		int z[][] = new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		return z;
	}
	
	public static void main(String[] args) {
		
        MatrixAddition obj = new MatrixAddition();
        int x[][] = {{1,2},{3,4}};
        int y[][] =  {{4,5},{7,8}};
        int arr[][] = obj.addition(x,y);
        for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
        
	}

}
