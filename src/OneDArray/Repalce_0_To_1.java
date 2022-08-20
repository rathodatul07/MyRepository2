package OneDArray;

import java.util.Scanner;

public class Repalce_0_To_1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<size;i++)
		{
		a[i]=sc.nextInt();
		System.out.println("a["+i+"]="+a[i]);
		}
		for(int i=0; i<size ; i++)
		{
		     if(a[i]==0)
		     {
		    	 a[i]=1;
		     }
		}
		for(int i=0; i<size ; i++)
		{
			System.out.print(" "+a[i]);
		}
		
}
}

