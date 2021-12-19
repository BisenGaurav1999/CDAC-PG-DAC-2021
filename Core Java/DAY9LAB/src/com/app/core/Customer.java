package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date dob;
	private CustomerType type;

	public Customer(String name, String email, String password, double registrationAmount, Date dob,CustomerType type) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.type=type;
	}
	
	public Customer(String email) {
		super();
		this.email = email;
	}

	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	@Override
	public String toString() {
		return "Customer [Name = " + name + ", email = " + email + ", password = " + password + ", registrationAmount = "
				+ registrationAmount + ", dob = " + dob + ", Cutomer plan = "+ type + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("In customer Equals");
		if (o instanceof Customer) {
			return this.email.equals(((Customer) o).email);
		}else return false;
	}

	
}
