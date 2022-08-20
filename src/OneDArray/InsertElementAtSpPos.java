package OneDArray;
import java.util.*;
public class InsertElementAtSpPos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int a=sc.nextInt();
		
		int d[]=new int[a];
		System.out.println("Enter elements of array:");
		for(int i=0;i<a;i++)
		{
			d[i]=sc.nextInt();
		}
		System.out.println("Elements of array are:");
		for(int i=0;i<a;i++) {
			System.out.print(d[i]+" ");
		}
		System.out.println();
		System.out.println("Enter position");
		int pos=sc.nextInt();
		System.out.println("Enter element to insert");
		int ele=sc.nextInt();
		d[pos]=ele;
		System.out.println("After inserting element at specific position");
		for(int i=0;i<a;i++) {
			System.out.print(d[i]+" ");
		}
		
		
		
	}

}
