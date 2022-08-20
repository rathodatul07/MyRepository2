package OneDArray;

public class Subarray
{
	void findFirstSub(int a[],int ar_len,int sub_len)
	{
		int index=0,sum;
		double avg,least=0;
		for(int i=0;i<ar_len;i++)
		{
			sum=0;
			if((i+(sub_len-1))<ar_len)
			{
				for(int j=i;j<(i+sub_len);j++)
				{
					sum=sum+a[j];
					System.out.print(a[j]+"");
				}
				System.out.println("="+sum+"\n");
					avg=sum/sub_len;
					System.out.print("Average="+avg);
					if(least==0)
					{
						least=avg;
						index=i;
					}
					else if(least>avg)
					{
						least=avg;
						index=i;
					}
				}
			}
			System.out.println("Smallest avg is"+least+"with index"+index);
			
		}
	

	public static void main(String[] args)
	{
		int a[]= {3,7,90,20,5,50,40};
		 Subarray s= new  Subarray();
		 s.findFirstSub(a,7,2);

	}

}
