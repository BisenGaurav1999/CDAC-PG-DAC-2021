package tester;

import com.app.geometry.*;

/*
4.6 Write TestPoint class , in package "tester" , with a main method
Accept co-ordinates of 2 points from user (Scanner) --to create 2 points (p1 & p2)

4.7 Use getDetails method to display point details.(p1's details & p2's details)

4.8 Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position)

4.9 If they are not located at the same position , display distance between p1 & p2 , otherwise simply give a message : "points at the same position"

 */

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {

		System.out.println("Enter the Coordinate (x,y) for Point 1 ");
		// 4.6
		Scanner sc = new Scanner(System.in);
		// Accepting coordinates of point 1
		Point2D p1 = new Point2D(sc.nextDouble(), sc.nextDouble());
		// Accepting coordinate of point 2
		System.out.println("Enter the Coordinate (x,y) for Point 2 ");
		Point2D p2 = new Point2D(sc.nextDouble(), sc.nextDouble());

		// 4.7--> Using getDetails Method
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());

		// 4.8-->Using isEqual method
		if (p1.isEqual(p2)) {
			System.out.println("p1 & p2 are located at the same position");
		} else // 4.9-->For Different coordinate
		{
			System.out.println("p1 & p2 are located at the different position");
			System.out.println("The distance between the coordinates is " + p1.calculateDistance(p2));
		}

		sc.close();
	}

}
