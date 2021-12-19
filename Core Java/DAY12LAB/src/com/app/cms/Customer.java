package com.app.cms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer> {
	private String name, email, password;
	private double registrationAmount;
	private Date dob;
	private CustomerType type;
	private AadharDetails aadhar; // Establish one(Customer)---->one(Aadhar) association between 2 entities
	public static SimpleDateFormat sdf;

	static {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
	}

	public Customer(String name, String email, String password, CustomerType type, Date dob,
			double registrationAmount) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.type = type;
	}

	// creating a parameterized constructor for the Primary Key to wrap it inside
	// the class
	public Customer(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		String aadharDetails = aadhar == null ? "Details not entered yet!!" : aadhar.toString();
		return "Customer [Name = " + name + ", Email = " + email + ", Registration Amount = " + registrationAmount
				+ ", Date Of Birth = " + sdf.format(dob) + ", Type = " + type + ", Aadhar Details = " + aadharDetails
				+ "]";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Customer)
			return email.equals(((Customer) o).email);
		return false;
	}

	@Override
	public int compareTo(Customer o) {
		return this.email.compareTo(o.email);
	}
	
	public String getPassword() // getter for password used in "findCustomerAndCheckPassword()" method
	{
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setAadharDetails(String aadharNo, String location) {
		this.aadhar = new AadharDetails(aadharNo, location);
	}

	public AadharDetails getAadhar() {
		return aadhar;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public CustomerType getPlan() {
		return type;
	}

	public void setType(CustomerType type) {
		this.type = type;
	}

	// non static nested class ( i.e Inner Class)
	public class AadharDetails {

		private String aadharNumber, location;

		public AadharDetails(String aadharNumber, String location) {
			this.aadharNumber = aadharNumber;
			this.location = location;
		}

		@Override
		public String toString() {
			return "[Aadhar Number=" + aadharNumber + ", Location=" + location + "]";
		}
	}// inner class over

}// outer class over
