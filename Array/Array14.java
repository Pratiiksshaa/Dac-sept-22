import java.util.*;
class Array14
{
	public static boolean areEqual(int a[], int b[])
	{
		int N=a.length;
		int M=b.length;
		// If lengths are not equal means array array not equal.
		if(N!=M)
			return false;
		// sort arrays 
		Arrays.sort(a);
		Arrays.sort(b);
		// Linearly compare elements
		 for (int i = 0; i < N; i++)
            if (a[i] != b[i])
                return false;
        // If all elements were same.
        return true;
	}
	public static void main(String args[])
	{
		int a[]= new int[]{1,2,3,4,5};
		int b[]=new int[]{6,7,8,9,10};
		if(areEqual(a, b))
		{
			System.out.print("Equal");
		}
		else
		System.out.print("Not equal");
	}
}

// OUTPUT= Not equal