package OneDArray;
import java.util.*;
public class ReverceArrayOneD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array=");
		int s1=sc.nextInt();

		int arr[]=new int[s1];

		System.out.println("enter an element=");
		for(int i=0;i<s1;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=s1-1;i>=0;i--)
		{
			System.out.print(arr[i]+"  ");
		}
	}

}
