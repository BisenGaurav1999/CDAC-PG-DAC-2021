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
public class Vehicle implements Comparable<Vehicle> {
	private int chasisNo;
	private String color;
	private double price;
	private Date manufactureDate;
	// vehicle HAS-A Category
	private Category category;
	// Establish one(Vehicle)---->one(Address) association between 2 entities
	private DeliveryAddress address;
	// method area
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Vehicle(int chasisNo, String color, double price, Date manufactureDate, Category category) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.category = category;
	}

	// add overloaded ctor : to wrap PK details
	public Vehicle(int chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
		String mesg = address == null ? "Addres not yet linked!!!" : address.toString();
		return "Vehicle chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufactureDate="
				+ sdf.format(manufactureDate) + " category " + category + " " + mesg;
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

	@Override
	public int compareTo(Vehicle anotherVehicle) {
		System.out.println("in vehicle's compareTo");
		if (this.chasisNo < anotherVehicle.chasisNo)
			return 1;
		if (this.chasisNo == anotherVehicle.chasisNo)
			return 0;
		return -1;
		//Can these 5 lines be replaced by 1 liner? YES : Integer's comapreTo

	}

	// Add a method to link delivery address to a vehicle.
	public void assignDeliveryAddress(String city, String state, String country, String zipCode) {
		this.address = new DeliveryAddress(city, state, country, zipCode);// link is established
	}
	// add a getter to return delivery address

	public DeliveryAddress getAddress() {
		return address;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public Category getCategory() {
		return category;
	}

	public int getChasisNo() {
		return chasisNo;
	}

	// non static nested class (=inner class)
	public class DeliveryAddress {
		private String city, state, country, zipCode;

		public DeliveryAddress(String city, String state, String country, String zipCode) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipCode = zipCode;
		}

		@Override
		public String toString() {
			return "DeliveryAddress [city=" + city + ", state=" + state + ", country=" + country + ", zipCode="
					+ zipCode + "]";
		}
		// getter for city

		public String getCity() {
			return city;
		}

	}// inner class over

}// outer class over
