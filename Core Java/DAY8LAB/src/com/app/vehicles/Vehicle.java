package com.app.vehicles;

import java.util.Date;

public class Vehicle {
	private int chasisNo;
	private String color;
	private double price;
	private Date manufacturingDate;
	
	public Vehicle(int chasisNo, String color, double price, Date manufacturingDate) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
	}
	
	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufacturingDate="
				+ manufacturingDate + "]";
	}
	//override equals method , inherited from Object Class
	//v1.equals(v2)
	//this :v1, anotherVehicle = v2
	@Override
	public boolean equals(Object o) {
		System.out.println("In Vehicle's Equal method");
		if(o instanceof Vehicle)
		//PK : chasisNo
			return this.chasisNo==((Vehicle)o).chasisNo;
		else 
			return false;
	}
}
