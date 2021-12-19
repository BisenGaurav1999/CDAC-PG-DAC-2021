package com.app.fruits;

public class Orange extends Fruit {
	public Orange(String colorr, double weightt) {
		super(colorr,weightt,"Orange");
	}
	public String taste() {
		return "sour";
	}
	public void juice() {
		System.out.println(super.getName()+" "+super.getWeight()+" : extracting juice!");
	}
}
