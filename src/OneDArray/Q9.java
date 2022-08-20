package OneDArray;
 import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		
		    int n;
	        Scanner Sc = new Scanner(System.in);
	        
	        
	        System.out.print("Enter number of elements : ");
	        n = Sc.nextInt();
	        
	        // creating an array.
	        int a[] = new int[n];
	        
	        // enter array elements.
	        System.out.println("Enter the elements in array : ");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = Sc.nextInt();
	        }
		
		Arrays.sort(a);
		System.out.println("Minimum = " + a[0]);
		System.out.println("Maximum = " + a[a.length-1]);

	}

}



