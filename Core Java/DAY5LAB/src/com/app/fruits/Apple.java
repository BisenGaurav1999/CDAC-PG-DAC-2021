package com.app.fruits;

public class Apple extends Fruit {
	public Apple(String colorr, double weightt) {
		super(colorr,weightt,"Apple");
	}
	public String taste() {
		return "sweet n sour";
	}
	public void jam() {
		System.out.println(super.getName()+" : making jam!");
	}
}
