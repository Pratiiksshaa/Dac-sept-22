class Array3
{
	public static void main(String args [])
	{
		int arr[]= {1, 5, 7, -1, 6};
		int sum=6;
		
	for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if((arr[i]+arr[j])== sum)
				System.out.println(arr[i]+" and "+arr[j]+" are pair of elements whose sum is equal to "+sum);
			}
			
		}
		
	}
	
}

/* OUTPUT=
1 and 5 are pair of elements whose sum is equal to 6
7 and -1 are pair of elements whose sum is equal to 6
*/