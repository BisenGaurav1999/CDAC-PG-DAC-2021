package com.app.org;

public class Mgr extends Emp{
	private double performanceBonus;
	public Mgr(String name, String deptId,double basic,double pb) {
		super(name,deptId,basic);
		this.performanceBonus=pb;
	}
	public String toString() {
		return super.toString()+"Performance Bonus"+this.performanceBonus+"\n";
	}
	public String getPerformanceBonus() {
		return "\nPerformance Bonus :"+performanceBonus+"\n";
	}
}
