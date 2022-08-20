package OneDArray;
import java.util.*;
public class AddOffArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int s1=sc.nextInt();
		int arr1[]=new int[s1];
		System.out.println("Enter element:");
		for(int i=0;i<s1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		

		System.out.println();
		System.out.println("Size of second Array:");
		int s2=sc.nextInt();
		int arr2[]=new int[s2];
		System.out.println("Enter element:");
		for(int i=0;i<s2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println();
		int res[]=new int[s1+s2];
		int a=0;
		for(int i=0;i<s1;i++) 
		{
			res[a]=arr1[i];
			a++;
		}
		for(int i=0;i<s2;i++)
		{
			res[a]=arr2[i];
			a++;
		}
		System.out.println("Merged array");
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}


	}

}
