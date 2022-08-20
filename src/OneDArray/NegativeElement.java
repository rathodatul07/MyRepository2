package OneDArray;
import java.util.*;
public class NegativeElement 
{
        public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sixe of array");
		a=sc.nextInt();
		int arr[]=new int[a];
		int cnt=0;
		System.out.println("enter element=");
		for(int i=0;i<a;i++)
			
		{
	      arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<a;i++)
	     {
			if(arr[i]<0)
			{
			System.out.println(arr[i]);
			cnt++;
			}
			
	}
		System.out.println("Total negative numbers:"+cnt);

	}

}
