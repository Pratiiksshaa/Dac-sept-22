// Java Program to Demonstrate Usage of a Static Variable in the Test Class

class Q24{
	
	static int count; 
	
	// Static can be used to keep track of no of objects created
	// Static variables are shared by all objects 
	// Static is created once per class
	// Common shared data between objects is kept static
	
	Q24(){
		count++;
	}
	
	public static void main(String[] args){
		
		new Q24();
		new Q24();
		new Q24();	
		
		System.out.println("Number of objects created is: " + count);	//3
	}
	
}

