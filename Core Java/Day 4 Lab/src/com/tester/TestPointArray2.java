package com.tester;
import com.app.geometry.*;
import java.util.Scanner;


public class TestPointArray2 {
		static Point2D arr[];
	public static void main(String [] args) {
		System.out.println("how many points to plot?");		//4) Question 2.1
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		arr = new Point2D[sc.nextInt()];
		do {
		System.out.println("*************************");
		System.out.println("\tMenu \n1. plot a new point");
		System.out.println("2. Display all points plotted so far.");
		System.out.println("3. Test equality of 2 points");
		System.out.println("4. Calculate distance");
		System.out.println("5. Exit\n");
		System.out.println("*************************");
		
		System.out.println("Select appropriate option");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("I/P --index , x & y");
			addPoint(sc.nextInt(),sc.nextDouble(),sc.nextDouble());
			break;
		case 2:
			System.out.println("Plotted Points are");
			getPlottedPoints(arr);
			break;
		case 3:
			System.out.println("Enter index1 and index2");
			compare(sc.nextInt(),sc.nextInt());
			break;
		case 4:
			System.out.println("Enter Start And End Point Index");
			distance(sc.nextInt(),sc.nextInt());
			break;
		case 5:
			exit = true;
			break;
		}
		}while(!exit);
		
		sc.close();
	}
	private static void distance(int id1, int id2) {
		if(arr[id1]!=null && arr[id2]!=null && id1>=0 && id1<arr.length && id2>0 &&id2<arr.length) {
			System.out.println("Distance Between them is: "+arr[id1].calculateDistance(arr[id2]));
		}
	}
	private static void addPoint(int id,double xx, double yy) {
		if(id>=0 && id<arr.length) {
			if(arr[id]==null) {
				arr[id] = new Point2D(xx,yy);
			}else
				System.out.println("Entered Index"+id+"is already Occupied");
		}else
			System.out.println("Entered Index is OutofBound");
	}
	
	private static void getPlottedPoints(Point2D[] point) {
		int i=0;
		for (Point2D ele : point) {
			if(ele!=null) {
				System.out.println("Value at index"+i+"is"+ ele.getDetails() );
			}else
				System.out.println("Value at index"+i+"is null ");
			i++;
		}
	}
	private static void compare(int id1, int id2) {
		if(arr[id1]!=null && arr[id2]!=null && id1>=0 && id1<arr.length && id2>=0 &&id2<arr.length) {
			if(arr[id1].isEqual(arr[id2])) {
				System.out.println("Enter coordnates are same");
			}else
				System.out.println("Index coordinate does nt match");
		}
	}
}
