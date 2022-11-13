class Array4
{
	public static void main(String args [])
	{
		int [] arr = {1, 2, 3, 4, 5};
		System.out.println("Elements of an array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse elements of an array");
		for(int i= arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}

/* OUTPUT= 
Elements of an array
1 2 3 4 5
Reverse elements of an array
5 4 3 2 1
*/