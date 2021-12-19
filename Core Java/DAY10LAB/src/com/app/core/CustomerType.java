package com.app.core;

public enum CustomerType {
	SILVER(500),GOLD(1000),DIAMOND(1500),PLATINUM(2000);
	//adding regAmt state;
	private double registrationAmt;
	CustomerType(double price) {
		registrationAmt=price;
	}
	public double getRegistrationAmt() {
		return registrationAmt;
	}
	
	
}
