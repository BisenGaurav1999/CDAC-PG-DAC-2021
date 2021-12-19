package com.app.geometry;
/*
 4.1 Create a class Point2D , in package - "com.app.geometry"   : for representing a point in x-y co-ordinate system.

4.2 Create a parameterized constructor to init x & y co-ords.

4.3 Add a method to return string form of  point's x & y co-ords
Hint :  public String getDetails()) 

4.4 Add isEqual method to Point2D class :a boolean returning method : must return true 
if and only if both points are having same x,y co-ords or false otherwise.

4.5 Add calculateDistance method to calculate distance between current point and 
specified point & return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.*/

public class Point2D { // 4.2
	private double x, y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() // 4.3
	{
		return "The Coordinate is (" + this.x + " , " + this.y + ")";
	}

	public boolean isEqual(Point2D obj) // 4.4
	{
		return (this.x == obj.x && this.y == obj.y);
	}

	public double calculateDistance(Point2D obj) // 4.5
	{
		double dis = Math.sqrt(Math.pow((this.x - obj.x), 2) + Math.pow((this.y - obj.y), 2));
		return dis;

	}

}
