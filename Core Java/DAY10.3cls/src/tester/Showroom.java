package tester;

import java.util.Date;
import java.util.Scanner;

import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;
import static utils.VehicleValidationRules.*;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter showroom capacity");
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];// 1 array object
			int counter = 0;
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Add Vehicle 2.Display all 3.Purchase a vehicle 10. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						if (counter < vehicles.length) {
							System.out.println(
									"Enter Vehicle details : chasisNo,  color,  price,  manufactureDate, category");
							Vehicle v1 = validateAllInputs(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(),
									sc.next(), vehicles);

							// => success
							vehicles[counter++] = v1;

							System.out.println("vehicle added to the showroom");
						} else
							throw new VehicleHandlingException("Showroom full!!!!");

						break;
					case 2: // display
						System.out.println("Showroom details ");
						for (Vehicle v : vehicles)
							if (v != null)
								System.out.println(v);

						break;
					case 3:// customer wants to purchase a vehicle
						System.out.println("Enter chasis no");
						// invoke validation method to chk if vehicle by specified chasisNO exists or
						// not
						int chasisNo = sc.nextInt();
						Vehicle v = findByChasisNo(chasisNo, vehicles);
						// => vehicle is found , now chk if it's available
						if (v.getAddress() == null) {
							// not yet sold!
							System.out.println("Enter delivery adr : city state country zipCode");
							// link
							v.assignDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next());
							System.out.println("Address linked to a vehicle!!!!");
						} else
							throw new VehicleHandlingException(
									"Vehicle with chasis no " + chasisNo + " already sold!!!");
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();

				}
				// clear off pending tokens from the scanner's buffer till end of line
				sc.nextLine();

			}
		}

	}

}
