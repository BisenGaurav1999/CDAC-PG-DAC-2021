package tester;

import static utils.VehicleValidationRules.validateAllInputs;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class Test2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// DeliveryAddress adr = new DeliveryAddress("Mumbai", "MH", "India",
			// "45367");// => aggregation between Vehicle n
			// DeliveryAddress
			Vehicle[] vehicles = new Vehicle[10];
			System.out.println("Enter Vehicle details : chasisNo,  color,  price,  manufactureDate, category");
			Vehicle v1 = validateAllInputs(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), vehicles);
			vehicles[0] = v1;
			System.out.println(v1);
			//inner class instance can only exist within outer class instance.
			Vehicle.DeliveryAddress adr=v1.new DeliveryAddress("Mumbai", "MH", "India","45367");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
