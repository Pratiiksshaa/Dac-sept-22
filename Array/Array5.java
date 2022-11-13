class Array5 
{
	public static void main(String args [])
	{
		int a[]= {50, 45, 30, 20, 25};
		int max=0, min=0;
		int index1=0, index2=0; 
		
		for(int i=0; i<a.length; i++)
		{
			if(i==0)
			{
				max=a[i];
				min=a[i];
			}
			else
			{
				if(max<a[i])
				{
					max=a[i];
					index1= i;
				}
				if(min>a[i])
				{
					min=a[i];
					index2=i;
				}
			}
		}
		System.out.println("smallest number is "+min+" at index "+index1);
		System.out.println("largest number is "+max+" at index "+index2);
	}
}

/* OUTPUT=
smallest number is 20 at index 0
largest number is 50 at index 3
*/