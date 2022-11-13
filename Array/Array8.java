/*Write a program which takes an array of integers and prints the running average of 3 
consecutive integers. 
In case the array has fewer than 3 integers, there should be no output.
Input: [5,14,35,89,140]
Output: [18, 46, 88] 
(Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...
*/

class Array8
{
	static void average(int a[], int n, int b[])
	{
		int sum=0, count=0, avg=0;
		for(int i=0; i<n-2; i++)
		{
		if(count<3)
		{
			sum=a[i]+a[i+1]+a[i+2];
			count++;
		}
		avg=sum/3;
		System.out.print(avg+" ");
		}
		System.out.println();
	}
	public static void main(String args [])
	{
		
		int a[] = {5,14,35,89,140};
		int n=a.length;
		int b []= new int[n-2];
		average(a,n,b);
	}
}

// OUTPUT= 18 46 88