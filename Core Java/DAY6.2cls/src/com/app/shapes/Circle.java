package com.app.shapes;
import static java.lang.Math.PI;

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
	//can circle override toString further? YES
	@Override
	public String toString() {
		return "Circle "+super.toString()+" radius ="+radius;
	}
}
