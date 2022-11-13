// Java Program to Demonstrate Usage of a Static Variable in the Test Class

class Q23{
	
	String name;
	int age;
	
	Q23(){
		name = "";
		age = 0;
	}
	
	Q23(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void printDetail(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static void main(String[] args){
		
		Q23 obj1 = new Q23("Anand", 25);
		Q23 obj2 = new Q23("Rohan", 22);
		Q23 obj3 = new Q23("Varun", 26);	
		
		obj1.printDetail();
		obj2.printDetail();
		obj3.printDetail();
	}
	
}
