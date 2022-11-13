/*22. How to convert Array to TreeSet in java ? */
import java.util.*;
class Array22
{
    public static void main(String args[]) 
	{
        
		Integer[] n = {1,2,3,4,5};
		/*First we convert an Array to List using
		  Arrays.asList(), then pass the list as an
		  argument to the constructor of TreeSet */
		List<Integer> list = Arrays.asList(n);
		Set<Integer> set = new TreeSet<Integer>(list);
		// Show Set elements
		System.out.println("The TreeSet elements are :");
		for(Integer num : set)
			System.out.print(num+" ");
  }
}

/* OUTPUT= 
The TreeSet elements are :
1 2 3 4 5
*/