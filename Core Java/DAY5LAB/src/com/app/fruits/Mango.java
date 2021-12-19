package com.app.fruits;

public class Mango extends Fruit {
	public Mango(String colorr, double weightt) {
		super(colorr,weightt,"Mango");
	}

	
	public String taste() {
		return "sweet";
	}
	public void pulp() {
		System.out.println(super.getName()+" "+super.getColor()+" : creating pulp!");
	}
}
