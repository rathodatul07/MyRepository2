package OneDArray;
import java.util.Scanner;
public class Q18Subtract {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int r=sc.nextInt();
		System.out.println("Enter no of coloumns");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter "+(r*c)+"array1 elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int b[][]=new int[r][c];
		System.out.println("Enter "+(r*c)+"array2 elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		int x[][]=new int[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				x[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("Subtraction is: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(x[i][j]+" ");
			
			}System.out.println();
		}

	}

}
