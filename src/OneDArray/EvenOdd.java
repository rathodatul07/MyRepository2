package OneDArray;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		
		int d[]=new int[size];
		System.out.println("Enter elements of array:");
		for(int i=0;i<size;i++)
		{
			d[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			if(d[i]%2==0)
			System.out.println(d[i]+" is even");
			
			else 
				System.out.println(d[i]+" is odd number");
				
			
		}
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
		
		
	}

}
