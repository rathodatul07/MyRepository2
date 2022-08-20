package OneDArray;

import java.util.Scanner;
public class Student_Class {
	int eid;	String name;	int marks;
	Student_Class(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id,name and Marks for 10 student");
		eid=sc.nextInt();
		name=sc.next();
		marks=sc.nextInt();
	}
	public String toString() {
		return "eid=" + eid + ", name=" + name + ", marks="
				+ marks;
	}
	public static void main(String[] args) {
		Student_Class a[]=new Student_Class[10];
		for(int i=0;i<a.length;i++){	
			a[i]=new Student_Class();
		}
		int c=0;
		for(int i=0;i<10;i++)
		{ c=a[i].marks;
			for(int j=0;j<10;j++)
			{
				if(a[j].marks>c)
				{
					c=a[j].marks;
				}
			}
		}
		for(int i=0;i<10;i++)
		{
			if(c==a[i].marks)
			{
				System.out.println(a[i]);
			}
		}


		
	}

}
