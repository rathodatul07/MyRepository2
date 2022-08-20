package OneDArray;

import java.util.Scanner;

public class ReversrTemp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size,start=0, temp,end=0;
		        System.out.println("ENTER THE SIZE OF ARRAY");
				size = sc.nextInt();
				int j = size;
				int a[] = new int[size];
				int a1[] = new int[size];
				 
			
				System.out.println("ENTER THE ELEMENT");
				for (int i = 0; i < size; i++) 
				{
					a[i] = sc.nextInt();
				}
				System.out.println("The orignal element are");
				for (int i = 0; i < size; i++) 
				{
					System.out.print(a[i] + " ");
				}
				     while(start<=end)
				 {
				 temp=a[start];
				 a[start]=a[end];
				 a[end]=temp;
				 start++;
				 end--;
				System.out.println("\nTHE REVERSE NUMBER IS ");
				int  end1=size-1;
				for (int i =0; i < size; i++)
				{
					a1[i]=a[end1];
					end1--;
					a1[i]=a[size-i-1];
					System.out.print(a1[i]+" ");
				}
			}
	}
}
		 
		 
		 

