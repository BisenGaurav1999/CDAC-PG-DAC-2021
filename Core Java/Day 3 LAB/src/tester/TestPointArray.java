package tester;

import java.util.Scanner;

import com.app.geometry.*;

/*
 4.10 If time permits...
Create another  class , in the "tester" package "TestPointArray" , with main(..)
Ask user , how many points to plot.
Accept x,y co-ordinates for all the points nd store it suitably.
Display x,y co-ordinates of all the points plotted so far.

 */

public class TestPointArray {

	public static void main(String[] args) {

		System.out.println("How many Points to plot");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();			//storing size of array
		Point2D[] arr = new Point2D[n];	//Point2D array obj creation
		
		//Accepting user entry for n no. of coordinates
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Coordinates(x,y)");
			arr[i] = new Point2D(sc.nextDouble(), sc.nextDouble());
		}
		
		//Displaying array Of points using FOR-EACH
		for (Point2D point2d : arr) {
			System.out.println(point2d.getDetails());
		}
		sc.close();
	}

}
