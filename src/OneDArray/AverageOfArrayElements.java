package OneDArray;
import java.util.*;
public class AverageOfArrayElements {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of arrays:");
      int a=sc.nextInt();
      double total=0;
    int b[]=new int[a];
    System.out.println("enter elements");
     for(int i=0;i<a;i++)
     {
    	b[i]=sc.nextInt();
     }
     for(int i=0;i<a;i++)
     {
    	 total=total+b[i];
     }
     System.out.println("total="+total);
     double avrg=total/a;
         
     System.out.println("avg="+avrg);
	}

}
