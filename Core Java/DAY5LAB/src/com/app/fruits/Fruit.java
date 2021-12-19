package com.app.fruits;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	public Fruit(String c,double w, String n) {
		color=c;
		weight=w;
		name=n;
		fresh=true;
	}
	
	public String toString() {
		return "color "+color+" weight "+weight+" Name "+name;
	}
	public String taste() {
		return "no specific taste";
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

}
