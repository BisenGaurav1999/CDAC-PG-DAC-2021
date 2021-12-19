package com.app.org;

public class Emp {
	private int id;
	private String name;
	private String deptId;
	private double basic;
	private static int i=100 ;
	{
		i=i+1;
	}
	protected Emp(String name,String deptId,double basic) {
		this.id=i;
		this.name=name;
		this.deptId=deptId;
		this.basic=basic;
	}
	public String toString() {
				return ("ID : "+this.id+"\nName : "+this.name+
				"\nDept. ID : "+deptId+"\nBasic : "+basic+"\n");
			}

}

