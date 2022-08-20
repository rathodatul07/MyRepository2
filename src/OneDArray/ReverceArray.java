package OneDArray;
import java.util.*;
public class ReverceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int a=sc.nextInt();
		int b[]=new int[a];
		System.out.println("enter element:");
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=a-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}
	}
}
