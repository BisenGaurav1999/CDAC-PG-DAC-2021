package tester;

import java.util.Date;
import java.util.Scanner;

import com.app.vehicles.Vehicle;

import static com.app.vehicles.Vehicle.sdf;

public class Test3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 1st  vehicle details : chasisNo,  color,  price, manufactureDate(day-mon-yr)");
			Object v1 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()));
			//=> success
			System.out.println("Added vehicle details "+v1);
			System.out.println("Enter 2nd vehicle details : chasisNo,  color,  price, manufactureDate(day-mon-yr)");
			Object v2 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()));
			//=> success
			System.out.println("Added vehicle details "+v2);
			System.out.println(v1==v2);//ref equality : false
			//Object class API : public boolean equals(Object o) : true / false => ref eq (rets true : ref1==ref2)
			System.out.println(v1.equals(v2));//inherited equals method of object (Vehicle extends Object) : false
			Object obj=null;
			System.out.println(v1.equals(obj));//false
			Date d1=new Date();
			System.out.println(v1.equals(d1));//false
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main cntd...");

	}

}
