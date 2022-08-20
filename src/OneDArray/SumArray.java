package OneDArray;

import java.util.*;
public class SumArray {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int arr[]= new int [size];
		System.out.println("enter "+size+"elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("entered elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("sum of elements are");
		for(int i=0;i<arr.length;i++)
		{
			 sum=sum-arr[i];
		}
		System.out.println(sum);

	}

}
