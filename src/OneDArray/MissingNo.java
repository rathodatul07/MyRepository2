package OneDArray;

import java.util.Scanner;

public class MissingNo {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[10];
      int sum=0;
      System.out.println("Enter number from 1 to 10");
      for(int i=0;i<10;i++)
      {
    	  a[i]=sc.nextInt();
    	  sum=sum+a[i];
    	
      }
      System.out.println(66-sum+" is missing");
     
	}

}
