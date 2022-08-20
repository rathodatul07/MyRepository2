package OneDArray;

import java.util.Scanner;

public class Declaration {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array");
		int a=sc.nextInt();
		int b[]=new int[a];
		System.out.println("enter element");
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<a;i++)
		{
			System.out.println(b[i]);
		}
		
	}
	
}
