class P2Q13{
	public static void main(String args []){
		for(char i='A'; i<='E'; i++)
		{
			for(char j='E'; j>i; j--)
				System.out.print(" ");
				
	        
			for(char j='A'; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

/* OUTPUT=
    A
   B B
  C C C
 D D D D
E E E E E

*/