package OneDArray;
public class Q25Triplet {
	public static void main(String[] args) {
		int a[]= {5,1,3,4,7};
		int c;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}	}	}
		for(int d:a)
		{ 	System.out.println(d);	}
		int x=a[0];
		int z=0;
		System.out.println("Triplets are:");
		for(int i=1;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(x!=a[i]&&a[i]!=a[j])
				{
					if(x+a[i]+a[j]<12)
					{
						System.out.println("("+x+","+a[i]+","+a[j]+")");
						z++;
					}	}	}
		}System.out.println("Output="+z);

	}

}
