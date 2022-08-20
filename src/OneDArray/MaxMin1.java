package OneDArray;

import java.util.Scanner;

public class MaxMin1 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of first array");
		int s1=sc.nextInt();
		int arr1[]=new int[s1];

		System.out.println("Enter element:");
		for(int i=0;i<s1;i++)
		{
		arr1[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<s1;i++)
		{
			if(max<arr1[i])
			{
				max=arr1[i];

			}
		}
		int min=0;
		for(int i=0;i<s1;i++)
		{
			if(min>arr1[i])
			{
				min=arr1[i];

			}
		}
		System.out.println("maximum="+max);
		System.out.println("minimum="+min);


	}

}
