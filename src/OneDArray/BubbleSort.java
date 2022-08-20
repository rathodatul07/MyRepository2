package OneDArray;

import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements of array:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<size;i++) 
		{
			for(int j=i+1;j<size;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("ascending order");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}