package com.app.vehicles;

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
		return "DeliveryAddress [city=" + city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode
				+ "]";
	}
	

}
