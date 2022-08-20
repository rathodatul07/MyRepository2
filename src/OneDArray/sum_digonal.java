package OneDArray;

import java.util.Scanner;

public class sum_digonal
{

	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner (System.in);
		 System.out.println("Enter the  row size of array ");
		 int row=sc.nextInt();
		 System.out.println("Enter the  colom size of array ");
		 int col=sc.nextInt();
		
		 System.out.println("Enter the element in Array ");
		
		int arr[][]=new int[row][col];
		for(int i=0; i<row ; i++)
		{
			for(int j=0; j<col ; j++)
			{
			   arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<row ; i++)
		{
			for(int j=0; j<col ; j++)
			{
			   System.out.println(arr[i][j]+"\t");
			}
			System.out.println("");
		}
		int sum=0;
		for(int i=0; i<row ; i++)
		{
			for(int j=0; j<col ; j++)
			{
				if(i==j)
				{
		     sum=sum+arr[i][i];
				}
			}
	}
		System.out.println("Sum of Diagonal elements of the matrix="+sum);
	}
}
