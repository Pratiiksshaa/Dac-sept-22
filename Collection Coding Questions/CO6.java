import java.util.*;
class CO6
{
	public static void main(String args [])
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		Collections.swap(list, 1, 3);
		System.out.println("List after swapping elements at index 1 and 3");
		System.out.println(list);
	}
}

/* OUTPUT=
[1, 2, 3, 4]
List after swapping elements at index 1 and 3
[1, 4, 3, 2]
*/