/*19. Write a program to sum all the values of a given Array in java? */
class Array19
{
	public static void main(String args[])
	{
		
		int a[]={10,20,30,40};
		int n=a.length;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		
	System.out.println("Sum of Array Elements: "+sum);
	}
}

// OUTPUT= Sum of Array Elements: 100