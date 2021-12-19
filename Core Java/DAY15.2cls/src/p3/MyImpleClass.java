package p3;

public class MyImpleClass implements Formula {
//MUST imple abstract methods
	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method");
		return a * a;
	}
	// Imple. class can access inherited default  method YES , can it override : YES
	//Can you override i/f static method ? NO , can be re-declared.
	
//	@Override
	 static void print(String mesg)
	    {
	    	System.out.println("Printing a mesg "+mesg.toUpperCase()+" from the class's static method");
	    	Formula.print("bye");//how to refer to i/f static method ? i/f Name.method
	    }

}
