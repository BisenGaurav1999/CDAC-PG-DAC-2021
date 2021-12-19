package tester;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.app.vehicles.Category;
import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;

import static utils.VehicleValidationRules.*;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create empty AL to hold Vehicle type of refs.
			ArrayList<Vehicle> vehicles = new ArrayList<>();// size =0 , capa =10
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Add Vehicle 2. Display 3. Find by chasis no 4.Update Price"
						+ "5.Delete Vehicle Info 6. Purchase a Vehicle 10. Exit");
				try {
					switch (sc.nextInt()) {
					case 1: // add a vehicle
						System.out.println(
								"Enter vehicle details : chasisNo,  color,  price,  manufactureDate(day-mon-yr), category");
						vehicles.add(validateAllInputs(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next(),
								vehicles));
						System.out.println("vehicle added to the showroom....");

						break;
					case 2: // display all vehicles
						System.out.println("Showroom details");
						for (Vehicle v : vehicles)
							System.out.println(v);

						break;
					case 3:
						System.out.println("Enter chasis no");
						System.out.println(findByChasisNo(sc.nextInt(), vehicles));
						break;

					case 4:
						System.out.println("Enter chasis no n new price");
						Vehicle v = findByChasisNo(sc.nextInt(), vehicles);
						v.setPrice(sc.nextDouble());
						System.out.println("Price updated for the vehicle with chasis no " + v.getChasisNo());
						break;

					case 5:
						System.out.println("Enter chasis no to remove vehile details from the showroom");
						v = new Vehicle(sc.nextInt());
						System.out.println("vehicle details removed...." + vehicles.remove(v));
						// OR can use indexOf + remove
						break;
					case 6:
						System.out.println("Enter chasis No ");
						v = findByChasisNo(sc.nextInt(), vehicles);
						// => vehicle found
						if (v.getAddress() == null) // not yet sold
						{
							System.out.println("Enter delivery address city state country zipcode");
							v.assignDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next());
							System.out
									.println("delivery address set for the vehicle with chasis no " + v.getChasisNo());

						} else // sold
							throw new VehicleHandlingException("Vehicle un available!!!!!");
						break;
					case 7:
						/*
						 * 1.1 Apply discount to all vehicles manufactured before a specific date n
						 * category i/p : date n category n discount
						 */
						System.out.println("Enter date n category n discount amount");
						Date d1 = parseAndValidateDate(sc.next());
						Category category = validateCategory(sc.next());
						double discountAmt = sc.nextDouble();
						for (Vehicle v1 : vehicles)
							if (v1.getManufactureDate().before(d1) && v1.getCategory() == category)
								v1.setPrice(v1.getPrice() - discountAmt);
						System.out.println("applied discount....");// will be improved with Func Prog.
						break;
					case 8:
						/*
						 * 1.2 Display vehicle chasis no n price , of all the vehicles dispatched to a
						 * specific city i/p : city
						 */
						System.out.println("Enter city for delivery");
						String city = sc.next();
						System.out.println("Chasis NO n price of all vehicles dispatched to " + city);
						for (Vehicle v1 : vehicles)
							if (v1.getAddress() != null)
								if (v1.getAddress().getCity().equals(city))
									System.out.println(v1.getChasisNo() + " " + v1.getPrice());

						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// to read off pending tokens from the scanner : till end of line
				sc.nextLine();

			}

		}

	}

}
