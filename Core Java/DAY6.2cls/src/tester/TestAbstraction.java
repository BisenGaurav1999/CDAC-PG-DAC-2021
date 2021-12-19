package tester;

import com.app.shapes.*;

public class TestAbstraction {

	public static void main(String[] args) {
		// create rectangle and circle instances and there refs in the array n display
		// their details + area from single for each

		BoundedShape[] shapes = { new Rectangle(2, 2, 20.5, 4.5), new Circle(50, 100, 12.5) };// 3 objects
		// BoundedShape s1 = new BoundedShape(30,60);
		for(BoundedShape s: shapes) {
			System.out.println(s);		//s.toString() from super cls
			System.out.printf("Area : %10.2f%n",s.area()); //s.area() from super 
		}
	}
}
 