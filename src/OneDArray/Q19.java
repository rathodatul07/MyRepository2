package OneDArray;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {

		int  i,j,n;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows and columns of matrix");
		n = in.nextInt();

		int first[][] = new int[n][n];
		int second[][] = new int[n][n];
		int sum[][] = new int[n][n];

		System.out.println("Enter the elements of first matrix");

		for (i = 0; i<n; i++)
			for (j = 0; j<n; j++)
				first[i][j] = in.nextInt();

		System.out.println("Enter the elements of second matrix");

		for (i = 0 ; i<n; i++)
			for (j = 0 ; j<n ; j++)
				second[i][j] = in.nextInt();

		for (i = 0; i<n; i++)
			for (j = 0; j<n; j++)

				for (int k = 0; k < n; k++)
				{
					//  c[i][j] = c[i][j] + a[i][k] * b[k][j];
					// }
					sum[i][j] = sum[i][j]+ first[i][k] * second[k][j];  //replace '+' with '-' to subtract matrices
				}
		System.out.println("Sum of the matrices:");

		for (i = 0; i<n; i++)
		{
			for (j = 0; j<n; j++)
				System.out.print(sum[i][j]+"\t");

			System.out.println();
		}
	}


}







