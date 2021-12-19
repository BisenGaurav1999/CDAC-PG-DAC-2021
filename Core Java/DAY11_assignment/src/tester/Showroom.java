package tester;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.app.vehicles.Category;
import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;

import static utils.VehicleValidationRules.validateAllInputs;
import static utils.VehicleValidationRules.findByChasisNo;
import static com.app.vehicles.Vehicle.sdf;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create empty AL to Hold vehicle type of refs
			ArrayList<Vehicle> vehicles = new ArrayList<>();// size=0, capacity = 10
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"\tOptions \n1. Add Vehicle \n2. Display\n3. Display vehicle\n4. Set Price\n5. Remove Vehicle\n6. Apply Discount\n7. Purchase vehicle\n8. Sold Vehicle List(city)\n9. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter Vehicle Details :\nChasisNo, Colour, Price, ManufacturingDate, Category");
						vehicles.add(validateAllInputs(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next(),
								vehicles));
						System.out.println("Vehicle added successfull...");
						break;
					case 2:
						String msg = "Showroom details : List is Empty...";
						if (vehicles.size() == 0)
							System.out.println(msg);
						else {
							System.out.println("Showroom Details : \n");
							for (Vehicle vehicle : vehicles) {
								System.out.println(vehicle);
							}
						}
						break;
					case 3:
						System.out.println("Enter Chesis No.");
						System.out.println(findByChasisNo(sc.nextInt(), vehicles));
						break;
					case 4:
						System.out.println("Enter Chasis no and new Price");
						Vehicle v = findByChasisNo(sc.nextInt(), vehicles);
						v.setPrice(sc.nextDouble());
						System.out.println("Price Updated for the chasis no " + v.getChasisNo());
						break;
					case 5:
						System.out.println("Enter Chasis no of vehicle : ");
						int ch = sc.nextInt();
						Vehicle chasisn=new Vehicle(ch);
						
						if(vehicles.remove(chasisn))
							System.out.println("Vahicle has been Removed");
						else
							throw new VehicleHandlingException("No data Found");
						break;
					case 6:
						System.out.println("Enter Date And Category ");
						Date date = sdf.parse(sc.next());
						Category category = Category.valueOf(sc.next().toUpperCase());
						System.out.println("Enter Discount amount");
						double dis = sc.nextDouble();
						for (Vehicle vehicle : vehicles) {
							if (vehicle.getManufactureDate().before(date) && vehicle.getCategory() == category) {
								vehicle.setPrice(vehicle.getPrice() - dis);
								System.out.println("Updated succesfully");
							}
						}
						break;
					case 7:
						System.out.println("Enter Chasis No");
						Vehicle obj = findByChasisNo(sc.nextInt(), vehicles);
						System.out.println("Enter Delivery Address : City, State, Country, ZipCode");
						obj.assignDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next());
						break;
					case 8:
						System.out.println("Enter city Name");
						String city=sc.next();
						boolean flag = true;
						for (Vehicle vehicle : vehicles) {
							if(vehicle.getAddress()!=null&&vehicle.getCity().equals(city)) {
								System.out.println("Price is "+vehicle.getPrice()+" and Chasis No is "+ vehicle.getChasisNo());
								flag = false;
							}
						}
						if(flag)
							throw new VehicleHandlingException("No Data Found");
						break;
					case 9:
						exit = true;
						break;
					default:
						System.out.println("Invalid Entry...");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// to read off pending tokens from the Scanner : till end of line
				sc.nextLine();
			}
		}
	}
}
