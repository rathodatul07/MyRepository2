package OneDArray;

import java.util.Scanner;
public class Equiality
{
	public static void main(String[] args)
	{

		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of array 1");
		int size=sc.nextInt();
		
		System.out.println("Enter the size of array 2");
		int size1=sc.nextInt();
		
		System.out.println("Enter the element in Array 1");
		
		int arr[]=new int[size];
		int arr1[]=new int[size1];
		
	
		
		for(int i=0; i<size ; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element in Array 2");
		for(int i=0; i<size ; i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		boolean flag=false;
		for(int i=0; i<size ; i++)
		{
			if(arr[i]== arr1[i])
			{
				System.out.println("they are equal");
				flag=true;
				break;
			}
		}
			if(flag==false)
			
			{
				System.out.println("they are not equal");
			}
		
		
	}
}
