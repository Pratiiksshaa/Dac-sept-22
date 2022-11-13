/*18. How to find duplicate elements in a given Array*/
class Array18
{
	public static void main(String args[])
	{
		int a[]={1,21,17,15,21,16,30,16,40};
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate No:"+a[i]+" at index "+i+" "+j);
				}
			}
		}
	}
}

/* OUTPUT=
Duplicate No:21 at index 1 4
Duplicate No:16 at index 5 7
*/