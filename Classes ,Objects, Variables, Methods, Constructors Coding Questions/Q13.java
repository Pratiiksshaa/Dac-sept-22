// Java Program to Create a Method without Parameters and Return Type

class Addition{
	
	int a;
	int b;
	
	Addition(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void printSum(){
		System.out.println("Sum is : " + (a+b));
	}

}
class Q13{

	public static void main(String[] args){
		
		Addition add = new Addition(5,5);
		add.printSum();

	}
}

// OUTPUT= Sum is : 10