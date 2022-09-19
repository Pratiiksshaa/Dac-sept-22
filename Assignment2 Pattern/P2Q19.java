class P2Q19{
	
	public static void main(String [] args){
		
		
		
	for(int i=1; i<=5; i++){
		
		//spaces
		for(int spaces=5; spaces>i; spaces--){
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++){
			if(i==5){
				System.out.print("*");
			}
			
			else if(j==1 || j==i){
				System.out.print("*");
			}
			
			else{
				System.out.print(" ");
			}
		}
		
		
		System.out.println();
	}
	
	
	
	

	
	}
}
