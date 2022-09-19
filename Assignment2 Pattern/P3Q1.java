class P3Q1
{
	public static void main(String args[])
	{
	  for(int i=1; i<=9; i++)
      {
		  for(int j=i; j<=8; j-- )
		  {
			  System.out.print(" ");
		  }
		  for(int j=i; j>=1; j++)
		  {
			  System.out.print(i);
		  }
		  System.out.println();
	  }	
	}
}	

/* OUTPUT=
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
*/

class P3Q2
{
	public static void main(String args [])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=i; j<=8; j++)
		  {
			  System.out.print(" ");
		  }
		  for(int j=1; j<=i; j++)
		  {
			  System.out.print(j+" ");
		  }
		  System.out.println();
	    }	
	}
	
	
}

/* OUTPUT=
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
*/

class P3Q3
{
	public static void main(String args [])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=i; j<=8; j++)
		  {
			  System.out.print(" ");
		  }
		  for(int j=1; j<=i; j++)
		  {
			  System.out.print("* ");
		  }
		  System.out.println();
	    }	
	}
}
/* OUTPUT=
        *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * *
* * * * * * * * *
*/








