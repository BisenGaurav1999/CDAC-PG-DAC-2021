package com.app.vehicles;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Create a class Vehicle , under the package : com.app.vehicles , to represent any vehicle. 
Supply tight encapsulation.
state(data members)  : chasisNo : int , color : String , price : double, manufactureDate : Date
chasisNo  MUST be unique (non duplicate) for any vehicle (primary Key : unique chasisNo)
Get  complete state : toString
 */
public class Vehicle {
	private int chasisNo;
	private String color;
	private double price;
	private Date manufactureDate;
	// method area
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Vehicle(int chasisNo, String color, double price, Date manufactureDate) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufactureDate="
				+ sdf.format(manufactureDate) + "]";
	}

	// overrding form of equals
	// Object class API : public boolean equals(Object o) : true / false => ref eq
	// (rets true : ref1==ref2)
	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals");
		if (o instanceof Vehicle)
			return chasisNo == ((Vehicle) o).chasisNo;
		return false;
		
	}

}
