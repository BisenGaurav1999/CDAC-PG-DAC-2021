package tester;

import static utils.VehicleValidationRules.validateAllInputs;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Vehicle[] vehicles=new Vehicle[10];
			System.out.println("Enter Vehicle details : chasisNo,  color,  price,  manufactureDate, category");
			Vehicle v1 = validateAllInputs(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), vehicles);
			vehicles[0]=v1;
			System.out.println(v1);
			System.out.println("Linking delivery address");
			System.out.println("Enter adr details : city state country zipcode");
			v1.assignDeliveryAddress(sc.next(), sc.next(),sc.next(), sc.next());
			System.out.println(v1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
