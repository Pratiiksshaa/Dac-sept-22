class Array9
{
	public static void main(String args [])
	{
		int num=0;
		int n=7;
		int b[]= new int[n];
		for(int i=1; i<n; i++)
		{
			if(i%2==0)
			{
				num= i*i;
				b[i]= num;
			}
			else
			{
				num=i*i*i;
				b[i]=num;
			}
		}
		for(int i=1; i<n; i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}
}

// OUTPUT= 1 4 27 16 125 36