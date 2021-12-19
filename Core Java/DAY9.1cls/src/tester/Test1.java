package tester;

import java.util.Date;
import java.util.Scanner;

import com.app.vehicles.Vehicle;

import static com.app.vehicles.Vehicle.sdf;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter vehicle details : chasisNo,  color,  price, manufactureDate(day-mon-yr)");
			Vehicle v1 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()));
			//=> success
			System.out.println("Added vehicle details "+v1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main cntd...");

	}

}
