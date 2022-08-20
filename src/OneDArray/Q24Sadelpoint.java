package OneDArray;
import java.util.Scanner;
public class Q24Sadelpoint {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of row n coloumn");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		System.out.println("enter "+(n*n)+" elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		int s[]=new int[n];
		int m[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int small=a[i][0];
			for(int j=0;j<n;j++)
			{
				if(a[i][j]<small)
				{
					small=a[i][j];
				}
				s[i]=small;
			}
		}
		for(int i=0;i<n;i++)
		{int max=a[0][i];
			for(int j=0;j<n;j++)
			{
				if(a[j][i]>max)
				{
					max=a[j][i];
				}
				m[i]=max;
			}
		}System.out.println("Min in rows are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
		System.out.println("Max in coloumns are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(m[i]+" ");
		}System.out.println();
		int z=0;
		for(int i=0;i<n;i++)
		{
			if(s[i]==m[i])
			{
				z=s[i];
			}
		}
		if(z>0)
		{
			System.out.print(z+" is saddle point");
		}
		else
			System.out.println("No saddle point");
	}

}
