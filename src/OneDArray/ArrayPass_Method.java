package OneDArray;

public class ArrayPass_Method
{

	public static void main(String[] args)
	{
	int a[]= {7,6,5,4,3,2,1};
	System.out.println("Unsorted List is=");
	display(a);
	sort(a);
	System.out.println("\n Sorted List is=");
	display(a);
	}
	static void display(int b[])
	{
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
	}
	static void sort(int b[])
		{
			int i,j,temp;
		for( i=0;i<b.length-1;i++)
		{
			for(j=0;j<b.length-i-1;j++)
			{
				if(b[j]>b[j+1])
				{
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		}}
