package com.tester;
import com.app.org.*;
import static java.lang.System.out;
public class TestOrganization1 {

	public static void main(String[] args) {
		Mgr m1 = new Mgr("Gaurav","MG01",5000,450);
		Worker w1=new Worker(10,400,"WORK01",12000,"PARBHU");
		out.println(m1.toString());
		out.println(m1.getPerformanceBonus());
		out.println(w1.toString());
		out.println(w1.getHourlyRate());
	}
}
