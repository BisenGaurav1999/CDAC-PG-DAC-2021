package com.app.cms;

public enum CustomerType {
	SILVER(500),GOLD(1000),DIAMOND(1500),PLATINUM(2000);
	
	//adding a state: registrationAmount
	
	private double regAmount;
	
	CustomerType(double regAmount){
		this.regAmount=regAmount;
	}
	
	public double getRegAmount()
	{
		return regAmount;
	}
}
