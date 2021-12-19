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
	private AdharLocation adharloc;

	public Customer(String name, String email, String password, double registrationAmount, Date dob,CustomerType type) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.type=type;
		
	}
	//inner class for linking adhar and location
	public class AdharLocation{
		private int adharid;
		private String location;
		public AdharLocation(int adhar, String location) {
			super();
			this.adharid = adhar;
			this.location = location;
		}
		@Override
		public String toString() {
			return ", Adharid=" + adharid + ", location=" + location ;
		}
		
		
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
		String mesg = adharloc==null?", KYC is pending":adharloc.toString();
		return "Customer [Name = " + name + ", email = " + email + ", password = " + password + ", registrationAmount = "
				+ registrationAmount + ", dob = " + dob + ", Cutomer plan = "+ type + mesg+"]";
	}

	@Override
	public boolean equals(Object o) {
		/* System.out.println("In customer Equals"); */
		if (o instanceof Customer) {
			return this.email.equals(((Customer) o).email);
		}else return false;
	}
	
	public boolean passwordMatching(String passwd) {
		return this.password.equals(passwd);
	}
	
	public void assignAdharLoc(int id, String loc) {
		adharloc = new AdharLocation(id, loc);
	}

	
}
