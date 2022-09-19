class P2Q11{
	public static void main(String args []){
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>i; j--)     //5,4,3,2; 5,4,3,
			{
				System.out.print(" ");
			} 
			for(int j=1; j<=i; j++)    //1;  1,2
			{
				System.out.print("*");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	} 
}

/* OUTPUT= 
    *
   ***
  *****
 *******
*********

Divide it into two parts.
    *
   **
  ***      and   solve individually and combine           
 ****
***** 
   
    
    *
	**
    ***
    ****
   