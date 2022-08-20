package OneDArray;
import java.util.*;


public class DuplicateNo {

	public static void main(String[] args)
	{
Scanner s= new Scanner(System.in);
int arr[],size;
System.out.println("enter size");
size=s.nextInt();
arr=new int[size];
System.out.println("enterelements");
for(int i=0;i<arr.length;i++)
{
	arr[i]=s.nextInt();
}
System.out.println("sorted elements");
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	System.out.println(arr[i]);
}
int b=0;
arr[b]=arr[0];
for(int i=0;i<arr.length;i++)
{
	
		if(arr[b]!=arr[i])
		{
			b++;
			arr[b]=arr[i];
			
		}
	}

System.out.println("elements are");
for(int i=0;i<=b;i++)
{
	System.out.println(arr[i]+" ");
}

}
}