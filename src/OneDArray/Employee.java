package OneDArray;
import java.util.Scanner;

public class Employee
{
	int e_id;
	String e_name;
	double e_sal;

	public Employee(int e_id, String e_name, double e_sal) {
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_sal = e_sal;
	}

	@Override
	public String toString() {

		return " emp_id : " + e_id + " emp_name : " + e_name + " emp_sal :" + e_sal;
	}

	public static void main(String[] args)
	{
		double temp;
		String temp1;
		int temp2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of employees :");
		int size = sc.nextInt();
		Employee e[] = new Employee[size];
		//initializing array
		for (int i = 0; i < size; i++)
		{
			System.out.println("ALL THE  EMPLOYEE ID AND NAME AND SAL");
			e[i] = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		}
		System.out.println("printing the details of employee");
		for (int i = 0; i < size; i++)
		{
			System.out.println(" " + e[i]);
		}
		// FOR ASSENDING SAL
		System.out.println("FOR DECENDING SAL");
		for (int i = 0; i < size; i++) 
		{
			for (int j = i + 1; j < size; j++) 
			{
				if (e[i].e_sal < e[j].e_sal)
				{
					temp2 = e[i].e_id;
					e[i].e_id = e[j].e_id;
					e[j].e_id = temp2;
					
					temp1 = e[i].e_name;
					e[i].e_name = e[j].e_name;
					e[j].e_name = temp1;
					
					temp = e[i].e_sal;
					e[i].e_sal = e[j].e_sal;
					e[j].e_sal = temp;
				}

			}
		}
		System.out.println("DECENDING SORTED ARRAY OF SAL");
		for (int i = 0; i < size; i++) {
			System.out.println(e[i] + " ");
		}
	}
}

