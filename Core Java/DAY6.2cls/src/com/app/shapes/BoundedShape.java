package com.app.shapes;

public abstract class BoundedShape {
	//tight encapsulation
	private int x,y;

	public BoundedShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return " [x=" + x + ", y=" + y + "]";
	}
	//area :of any bounded shape:abstract method declaration
	public abstract double area();
}
 