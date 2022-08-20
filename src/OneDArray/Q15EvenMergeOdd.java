package OneDArray;

import java.util.Scanner;

public class Q15EvenMergeOdd {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter"+size+"elements");
		for(i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(a[i]%2==0){
			System.out.println(a[i]);
			}
		}
		for(i=0;i<size;i++)
		{
			if(a[i]%2!=0){
			System.out.println(a[i]);
			}
		}
		
	}

}
