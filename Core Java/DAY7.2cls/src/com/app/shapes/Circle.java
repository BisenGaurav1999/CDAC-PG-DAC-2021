package com.app.shapes;

public class Circle extends BoundedShape {
	private double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	//implement more fitting word /override inherited extract method
	@Override
	public double area() {
		return PI*radius*radius;
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}
	//can circle override toString further? YES
	@Override
	public String toString() {
		return "Circle "+super.toString()+" radius ="+radius;
	}
}
