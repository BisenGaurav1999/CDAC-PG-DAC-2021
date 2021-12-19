package com.app.org;

public class Worker extends Emp{
	int hoursWorked;
	int hourlyRate;
	public Worker(int hw,int hr,String deptId,double basic,String name) {
		super(deptId,name,basic);
		this.hourlyRate=hr;
		this.hoursWorked=hw;
	}
	public String toString() {
		return super.toString()+"\nHourly Rate "+hourlyRate+"\nHours Worked "+hoursWorked+"\n";
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	
}
