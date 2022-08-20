package OneDArray;
import java.util.*;
public class Distances_small_to_larg
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
		int temp=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		int distances =a[size-1]-a[0];
		System.out.println("DIstances betteween smallest and largest is :"+distances);

	}

}
