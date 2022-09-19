class P2Q8 {
	public static void main(String args []){
		for(int i=5;i>=1;i--) //row
		{  
			for(int j=i;j>1;j--) //column
			{
				System.out.print(" ");
			}	
			
			for(int j=i;j<=5;j++) //column
			{
				System.out.print(j+" ");
				
			}				
			System.out.println();
		
		}
		
    }
}    

/* OUTPUT=
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

 */