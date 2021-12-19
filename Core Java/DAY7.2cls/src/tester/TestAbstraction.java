package tester;

import com.app.shapes.*;

public class TestAbstraction {

	public static void main(String[] args) {
		// create rectangle and circle instances and there refs in the array n display
		// their details + area from single for each

		Computable[] shapes = { new Rectangle(10, 20, 20.5, 4.6), new Circle(50, 100, 12.5) };// 3 objects
		
		for(Computable s: shapes) {
			System.out.println(s);		//s.toString() from super cls
			System.out.printf("Area : %10.2f%n",s.area()); //s.area() from super 
		}
	}
}
 