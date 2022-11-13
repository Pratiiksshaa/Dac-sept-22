/* Print the third-largest number in an array without sorting it 
Input: [ 24,54,31,16,82,45,67]
*/

class Array6
{
	public static void main(String args [])
	{
		int a []={24,54,31,16,82,45,67};
		if(a.length<3)
		{
			System.out.println("Invalid");
		}
		int first=a[0];
		// First largest number
		for(int i=0 ; i<a.length; i++)
		{
			if(a[i]>first)
				first=a[i];
		}
		// Second largest number
		int second= Integer.MIN_VALUE; // Smallest value is taken 
		for(int i=0; i<a.length; i++)
		{
			if(a[i]> second && a[i]< first)
			second = a[i];
		}
		// Third largest number
		int third= Integer.MIN_VALUE;  // Smallest value is taken 
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>third && a[i]< second)
			third= a[i];
		}
		System.out.println("Third largest number is "+third);
		System.out.println(first+" and "+second+" are largest and second-largest");
	}
}

/* OUTTPUT= 
Third largest number is 54
82 and 67 are largest and second-largest
*/