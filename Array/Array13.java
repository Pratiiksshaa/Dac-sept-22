/*13. Write a program to sort an Array in Java ? */
class Array13
{
	static void sort(int a[])
	{
		int n=a.length;
		for(int i=0; i<n-1; i++) 
		{
			int min=i;
			for(int j=i+1; j<n; j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
	static void display(int a[])
	{
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int a[]={5,14,35,90,13};
		System.out.println("Array before sort:-");
		display(a);
		sort(a);
		System.out.println("Array after sort:-");
		display(a);
	}
}

/* OUTPUT=
Array before sort:-
 5 14 35 90 13
Array after sort:-
 5 13 14 35 90
*/