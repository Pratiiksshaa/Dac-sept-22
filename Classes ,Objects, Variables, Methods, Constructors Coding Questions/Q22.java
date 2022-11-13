// Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method

class Q22{
	
	double balance;
	int AccNo;
	static double roi;
	
	Q22(){
		balance = 0.0;
		AccNo = 0;
		roi = 2.5;
	}
	
	Q22(double balance, int AccNo){
		this();
		this.balance = balance;
		this.AccNo = AccNo;
	}
	
	static void roiDetails(){
		System.out.println("Rate of Interest : " + roi + "%");
		// can access only static members(variables/methods)
		
		// balance++; // not allowed: non-static variable balance cannot be referenced from a static context	
	}
	
	void printDetail(){
		System.out.println("Account Number: " + AccNo);
		System.out.println("Balance: " + balance);
		roiDetails(); // can access both static and non static members(variables/methods)
		
	}
	
	public static void main(String[] args){
		
		Q22 obj1 = new Q22(75000.56, 1);
		Q22 obj2 = new Q22(12050.666, 2);
		Q22 obj3 = new Q22(35129.056, 3);	
		
		obj1.printDetail();
		obj2.printDetail();
		obj3.printDetail();
	}
	
}

