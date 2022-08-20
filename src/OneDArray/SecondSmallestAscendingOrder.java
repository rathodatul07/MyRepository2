package OneDArray;

import java.util.Scanner;

public class SecondSmallestAscendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array=");
		int b=sc.nextInt();

		int p[]=new int[b];
		System.out.println("enter element=");
		int temp=0;
		for(int i=0;i<b;i++)
		{
			p[i]=sc.nextInt();
		}
		for(int i=0;i<b;i++)
		{
			for(int j=i+1;j<b;j++)
			{
				if(p[i]>p[j])
				{
					temp=p[j];
					p[j]=p[i];
					p[i]=temp;
				}
			}
		}
		int temp1=p[0],
				cnt=0;
		for(int i=0;i<b;i++) {
			if(temp1==p[i]) {
				cnt++;
			}
		}
		try
		{
		
		System.out.println(p[cnt]+" is second smallest");
		}
		catch(Exception e)
		{
			
			
			
			System.out.println("all values are same");
		}
	
		
		}
    
}
