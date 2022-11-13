import java.util.Arrays; 
class Array2
{
	public static void main (String args [])
	{
		int [] arr1 = {1, 2, 3, 4, 5};
		int [] arr2={1, 4, 5, 6, 7};
		if(Arrays.equals(arr1, arr2))
		{
		System.out.println("Arrays are equal");
		}
		else
		{		
		System.out.println("Arrays are not equal");
		}
	}
}

/* OUTPUT=
Arrays are not equal
*/