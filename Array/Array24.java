class Array24
{
	public static void main(String args [])
	{
		
		int a[]={5,4,2,3,1};
		int first=0;

		for(int i=0; i<a.length; i++)
		{
			if(a[i]>first)
			first=a[i];
		}
		// second largest element
		int second=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
		
		if(a[i]>second && a[i]<first)
			second=a[i];
		}
		System.out.println("second largest element is: "+second);
	}
}
// OUTPUT=second largest element is: 4